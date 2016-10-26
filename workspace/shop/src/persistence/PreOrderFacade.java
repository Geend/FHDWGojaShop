package persistence;

import model.*;

import java.sql.*;
//import oracle.jdbc.*;

public class PreOrderFacade{

	private String schemaName;
	private Connection con;

	public PreOrderFacade(String schemaName, Connection con) {
		this.schemaName = schemaName;
		this.con = con;
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentPreOrder newPreOrder(long idCreateIfLessZero) throws PersistenceException {
        oracle.jdbc.OracleCallableStatement callable;
        try{
            callable = (oracle.jdbc.OracleCallableStatement)this.con.prepareCall("Begin ? := " + this.schemaName + ".PrOrdrFacade.newPrOrdr(?); end;");
            callable.registerOutParameter(1, oracle.jdbc.OracleTypes.NUMBER);
            callable.setLong(2, idCreateIfLessZero);
            callable.execute();
            long id = callable.getLong(1);
            callable.close();
            PreOrder result = new PreOrder(null,null,id);
            if (idCreateIfLessZero < 0)Cache.getTheCache().put(result);
            return (PersistentPreOrder)PersistentProxi.createProxi(id, 149);
        }catch(SQLException se) {
            throw new PersistenceException(se.getMessage(), se.getErrorCode());
        }
    }
    
    public PersistentPreOrder newDelayedPreOrder() throws PersistenceException {
        oracle.jdbc.OracleCallableStatement callable;
        try{
            callable = (oracle.jdbc.OracleCallableStatement)this.con.prepareCall("Begin ? := " + this.schemaName + ".PrOrdrFacade.newDelayedPrOrdr(); end;");
            callable.registerOutParameter(1, oracle.jdbc.OracleTypes.NUMBER);
            callable.execute();
            long id = callable.getLong(1);
            callable.close();
            PreOrder result = new PreOrder(null,null,id);
            Cache.getTheCache().put(result);
            return (PersistentPreOrder)PersistentProxi.createProxi(id, 149);
        }catch(SQLException se) {
            throw new PersistenceException(se.getMessage(), se.getErrorCode());
        }
    }
    
    public PreOrder getPreOrder(long PreOrderId) throws PersistenceException{
        try{
            CallableStatement callable;
            callable = this.con.prepareCall("Begin ? := " + this.schemaName + ".PrOrdrFacade.getPrOrdr(?); end;");
            callable.registerOutParameter(1, oracle.jdbc.OracleTypes.CURSOR);
            callable.setLong(2, PreOrderId);
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
            PersistentAbstractOrder This = null;
            if (obj.getLong(4) != 0)
                This = (PersistentAbstractOrder)PersistentProxi.createProxi(obj.getLong(4), obj.getLong(5));
            PreOrder result = new PreOrder(customerDeliveryTime,
                                           This,
                                           PreOrderId);
            obj.close();
            callable.close();
            PreOrderICProxi inCache = (PreOrderICProxi)Cache.getTheCache().put(result);
            PreOrder objectInCache = (PreOrder)inCache.getTheObject();
            if (objectInCache == result)result.initializeOnInstantiation();
            return objectInCache;
        }catch(SQLException se) {
            throw new PersistenceException(se.getMessage(), se.getErrorCode());
        }
    }

}

