package persistence;

import model.*;

import java.sql.*;
//import oracle.jdbc.*;

public class CustomerDeliveryTimeFacade{

	private String schemaName;
	private Connection con;

	public CustomerDeliveryTimeFacade(String schemaName, Connection con) {
		this.schemaName = schemaName;
		this.con = con;
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentCustomerDeliveryTime newCustomerDeliveryTime(common.Fraction price,long deliveryTime,long idCreateIfLessZero) throws PersistenceException {
        oracle.jdbc.OracleCallableStatement callable;
        try{
            callable = (oracle.jdbc.OracleCallableStatement)this.con.prepareCall("Begin ? := " + this.schemaName + ".CstmrDlvrTmFacade.newCstmrDlvrTm(?,?,?); end;");
            callable.registerOutParameter(1, oracle.jdbc.OracleTypes.NUMBER);
            callable.setString(2, price.toString());
            callable.setLong(3, deliveryTime);
            callable.setLong(4, idCreateIfLessZero);
            callable.execute();
            long id = callable.getLong(1);
            callable.close();
            CustomerDeliveryTime result = new CustomerDeliveryTime(price,deliveryTime,null,null,id);
            if (idCreateIfLessZero < 0)Cache.getTheCache().put(result);
            return (PersistentCustomerDeliveryTime)PersistentProxi.createProxi(id, 150);
        }catch(SQLException se) {
            throw new PersistenceException(se.getMessage(), se.getErrorCode());
        }
    }
    
    public PersistentCustomerDeliveryTime newDelayedCustomerDeliveryTime(common.Fraction price,long deliveryTime) throws PersistenceException {
        oracle.jdbc.OracleCallableStatement callable;
        try{
            callable = (oracle.jdbc.OracleCallableStatement)this.con.prepareCall("Begin ? := " + this.schemaName + ".CstmrDlvrTmFacade.newDelayedCstmrDlvrTm(); end;");
            callable.registerOutParameter(1, oracle.jdbc.OracleTypes.NUMBER);
            callable.execute();
            long id = callable.getLong(1);
            callable.close();
            CustomerDeliveryTime result = new CustomerDeliveryTime(price,deliveryTime,null,null,id);
            Cache.getTheCache().put(result);
            return (PersistentCustomerDeliveryTime)PersistentProxi.createProxi(id, 150);
        }catch(SQLException se) {
            throw new PersistenceException(se.getMessage(), se.getErrorCode());
        }
    }
    
    public CustomerDeliveryTime getCustomerDeliveryTime(long CustomerDeliveryTimeId) throws PersistenceException{
        try{
            CallableStatement callable;
            callable = this.con.prepareCall("Begin ? := " + this.schemaName + ".CstmrDlvrTmFacade.getCstmrDlvrTm(?); end;");
            callable.registerOutParameter(1, oracle.jdbc.OracleTypes.CURSOR);
            callable.setLong(2, CustomerDeliveryTimeId);
            callable.execute();
            ResultSet obj = ((oracle.jdbc.OracleCallableStatement)callable).getCursor(1);
            if (!obj.next()) {
                obj.close();
                callable.close();
                return null;
            }
            SubjInterface subService = null;
            if (obj.getLong(4) != 0)
                subService = (SubjInterface)PersistentProxi.createProxi(obj.getLong(4), obj.getLong(5));
            PersistentCustomerDeliveryTime This = null;
            if (obj.getLong(6) != 0)
                This = (PersistentCustomerDeliveryTime)PersistentProxi.createProxi(obj.getLong(6), obj.getLong(7));
            CustomerDeliveryTime result = new CustomerDeliveryTime((obj.getString(2) == null ? common.Fraction.Null : common.Fraction.parse(obj.getString(2))),
                                                                   obj.getLong(3),
                                                                   subService,
                                                                   This,
                                                                   CustomerDeliveryTimeId);
            obj.close();
            callable.close();
            CustomerDeliveryTimeICProxi inCache = (CustomerDeliveryTimeICProxi)Cache.getTheCache().put(result);
            CustomerDeliveryTime objectInCache = (CustomerDeliveryTime)inCache.getTheObject();
            if (objectInCache == result)result.initializeOnInstantiation();
            return objectInCache;
        }catch(SQLException se) {
            throw new PersistenceException(se.getMessage(), se.getErrorCode());
        }
    }
    public long getClass(long objectId) throws PersistenceException{
        try{
            CallableStatement callable;
            callable = this.con.prepareCall("Begin ? := " + this.schemaName + ".CstmrDlvrTmFacade.getClass(?); end;");
            callable.registerOutParameter(1, oracle.jdbc.OracleTypes.NUMBER);
            callable.setLong(2, objectId);
            callable.execute();
            long result = callable.getLong(1);
            callable.close();
            return result;
        }catch(SQLException se) {
            throw new PersistenceException(se.getMessage(), se.getErrorCode());
        }
    }
    public void priceSet(long CustomerDeliveryTimeId, common.Fraction priceVal) throws PersistenceException {
        try{
            CallableStatement callable;
            callable = this.con.prepareCall("Begin " + this.schemaName + ".CstmrDlvrTmFacade.prcSet(?, ?); end;");
            callable.setLong(1, CustomerDeliveryTimeId);
            callable.setString(2, priceVal.toString());
            callable.execute();
            callable.close();
        }catch(SQLException se) {
            throw new PersistenceException(se.getMessage(), se.getErrorCode());
        }
    }
    public void deliveryTimeSet(long CustomerDeliveryTimeId, long deliveryTimeVal) throws PersistenceException {
        try{
            CallableStatement callable;
            callable = this.con.prepareCall("Begin " + this.schemaName + ".CstmrDlvrTmFacade.dlvrTmSet(?, ?); end;");
            callable.setLong(1, CustomerDeliveryTimeId);
            callable.setLong(2, deliveryTimeVal);
            callable.execute();
            callable.close();
        }catch(SQLException se) {
            throw new PersistenceException(se.getMessage(), se.getErrorCode());
        }
    }
    public void subServiceSet(long CustomerDeliveryTimeId, SubjInterface subServiceVal) throws PersistenceException {
        try{
            CallableStatement callable;
            callable = this.con.prepareCall("Begin " + this.schemaName + ".CstmrDlvrTmFacade.sbSrvcSet(?, ?, ?); end;");
            callable.setLong(1, CustomerDeliveryTimeId);
            callable.setLong(2, subServiceVal.getId());
            callable.setLong(3, subServiceVal.getClassId());
            callable.execute();
            callable.close();
        }catch(SQLException se) {
            throw new PersistenceException(se.getMessage(), se.getErrorCode());
        }
    }
    public void ThisSet(long CustomerDeliveryTimeId, PersistentCustomerDeliveryTime ThisVal) throws PersistenceException {
        try{
            CallableStatement callable;
            callable = this.con.prepareCall("Begin " + this.schemaName + ".CstmrDlvrTmFacade.ThisSet(?, ?, ?); end;");
            callable.setLong(1, CustomerDeliveryTimeId);
            callable.setLong(2, ThisVal.getId());
            callable.setLong(3, ThisVal.getClassId());
            callable.execute();
            callable.close();
        }catch(SQLException se) {
            throw new PersistenceException(se.getMessage(), se.getErrorCode());
        }
    }

}

