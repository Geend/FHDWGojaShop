package persistence;

import model.*;

import java.sql.*;
//import oracle.jdbc.*;

public class OrderFacade{

	private String schemaName;
	private Connection con;

	public OrderFacade(String schemaName, Connection con) {
		this.schemaName = schemaName;
		this.con = con;
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentOrder newOrder(long idCreateIfLessZero) throws PersistenceException {
        oracle.jdbc.OracleCallableStatement callable;
        try{
            callable = (oracle.jdbc.OracleCallableStatement)this.con.prepareCall("Begin ? := " + this.schemaName + ".OrdrFacade.newOrdr(?); end;");
            callable.registerOutParameter(1, oracle.jdbc.OracleTypes.NUMBER);
            callable.setLong(2, idCreateIfLessZero);
            callable.execute();
            long id = callable.getLong(1);
            callable.close();
            Order result = new Order(null,null,null,id);
            if (idCreateIfLessZero < 0)Cache.getTheCache().put(result);
            return (PersistentOrder)PersistentProxi.createProxi(id, 147);
        }catch(SQLException se) {
            throw new PersistenceException(se.getMessage(), se.getErrorCode());
        }
    }
    
    public PersistentOrder newDelayedOrder() throws PersistenceException {
        oracle.jdbc.OracleCallableStatement callable;
        try{
            callable = (oracle.jdbc.OracleCallableStatement)this.con.prepareCall("Begin ? := " + this.schemaName + ".OrdrFacade.newDelayedOrdr(); end;");
            callable.registerOutParameter(1, oracle.jdbc.OracleTypes.NUMBER);
            callable.execute();
            long id = callable.getLong(1);
            callable.close();
            Order result = new Order(null,null,null,id);
            Cache.getTheCache().put(result);
            return (PersistentOrder)PersistentProxi.createProxi(id, 147);
        }catch(SQLException se) {
            throw new PersistenceException(se.getMessage(), se.getErrorCode());
        }
    }
    
    public Order getOrder(long OrderId) throws PersistenceException{
        try{
            CallableStatement callable;
            callable = this.con.prepareCall("Begin ? := " + this.schemaName + ".OrdrFacade.getOrdr(?); end;");
            callable.registerOutParameter(1, oracle.jdbc.OracleTypes.CURSOR);
            callable.setLong(2, OrderId);
            callable.execute();
            ResultSet obj = ((oracle.jdbc.OracleCallableStatement)callable).getCursor(1);
            if (!obj.next()) {
                obj.close();
                callable.close();
                return null;
            }
            PersistentCustomerDeliveryTime customerDeliveryTime = null;
            if (obj.getLong(2) != 0)
                customerDeliveryTime = (PersistentCustomerDeliveryTime)PersistentProxi.createProxi(obj.getLong(2), obj.getLong(3));
            SubjInterface subService = null;
            if (obj.getLong(4) != 0)
                subService = (SubjInterface)PersistentProxi.createProxi(obj.getLong(4), obj.getLong(5));
            PersistentAbstractOrder This = null;
            if (obj.getLong(6) != 0)
                This = (PersistentAbstractOrder)PersistentProxi.createProxi(obj.getLong(6), obj.getLong(7));
            Order result = new Order(customerDeliveryTime,
                                     subService,
                                     This,
                                     OrderId);
            obj.close();
            callable.close();
            OrderICProxi inCache = (OrderICProxi)Cache.getTheCache().put(result);
            Order objectInCache = (Order)inCache.getTheObject();
            if (objectInCache == result)result.initializeOnInstantiation();
            return objectInCache;
        }catch(SQLException se) {
            throw new PersistenceException(se.getMessage(), se.getErrorCode());
        }
    }

}

