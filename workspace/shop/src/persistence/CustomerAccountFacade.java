package persistence;

import model.*;

import java.sql.*;
//import oracle.jdbc.*;

public class CustomerAccountFacade{

	private String schemaName;
	private Connection con;

	public CustomerAccountFacade(String schemaName, Connection con) {
		this.schemaName = schemaName;
		this.con = con;
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentCustomerAccount newCustomerAccount(common.Fraction balance,long limit,long idCreateIfLessZero) throws PersistenceException {
        oracle.jdbc.OracleCallableStatement callable;
        try{
            callable = (oracle.jdbc.OracleCallableStatement)this.con.prepareCall("Begin ? := " + this.schemaName + ".CstmrAccntFacade.newCstmrAccnt(?,?,?); end;");
            callable.registerOutParameter(1, oracle.jdbc.OracleTypes.NUMBER);
            callable.setString(2, balance.toString());
            callable.setLong(3, limit);
            callable.setLong(4, idCreateIfLessZero);
            callable.execute();
            long id = callable.getLong(1);
            callable.close();
            CustomerAccount result = new CustomerAccount(balance,limit,null,null,null,id);
            if (idCreateIfLessZero < 0)Cache.getTheCache().put(result);
            return (PersistentCustomerAccount)PersistentProxi.createProxi(id, 125);
        }catch(SQLException se) {
            throw new PersistenceException(se.getMessage(), se.getErrorCode());
        }
    }
    
    public PersistentCustomerAccount newDelayedCustomerAccount(common.Fraction balance,long limit) throws PersistenceException {
        oracle.jdbc.OracleCallableStatement callable;
        try{
            callable = (oracle.jdbc.OracleCallableStatement)this.con.prepareCall("Begin ? := " + this.schemaName + ".CstmrAccntFacade.newDelayedCstmrAccnt(); end;");
            callable.registerOutParameter(1, oracle.jdbc.OracleTypes.NUMBER);
            callable.execute();
            long id = callable.getLong(1);
            callable.close();
            CustomerAccount result = new CustomerAccount(balance,limit,null,null,null,id);
            Cache.getTheCache().put(result);
            return (PersistentCustomerAccount)PersistentProxi.createProxi(id, 125);
        }catch(SQLException se) {
            throw new PersistenceException(se.getMessage(), se.getErrorCode());
        }
    }
    
    public CustomerAccount getCustomerAccount(long CustomerAccountId) throws PersistenceException{
        try{
            CallableStatement callable;
            callable = this.con.prepareCall("Begin ? := " + this.schemaName + ".CstmrAccntFacade.getCstmrAccnt(?); end;");
            callable.registerOutParameter(1, oracle.jdbc.OracleTypes.CURSOR);
            callable.setLong(2, CustomerAccountId);
            callable.execute();
            ResultSet obj = ((oracle.jdbc.OracleCallableStatement)callable).getCursor(1);
            if (!obj.next()) {
                obj.close();
                callable.close();
                return null;
            }
            PersistentShoppingCart shoppingCart = null;
            if (obj.getLong(4) != 0)
                shoppingCart = (PersistentShoppingCart)PersistentProxi.createProxi(obj.getLong(4), obj.getLong(5));
            SubjInterface subService = null;
            if (obj.getLong(6) != 0)
                subService = (SubjInterface)PersistentProxi.createProxi(obj.getLong(6), obj.getLong(7));
            PersistentCustomerAccount This = null;
            if (obj.getLong(8) != 0)
                This = (PersistentCustomerAccount)PersistentProxi.createProxi(obj.getLong(8), obj.getLong(9));
            CustomerAccount result = new CustomerAccount((obj.getString(2) == null ? common.Fraction.Null : common.Fraction.parse(obj.getString(2))),
                                                         obj.getLong(3),
                                                         shoppingCart,
                                                         subService,
                                                         This,
                                                         CustomerAccountId);
            obj.close();
            callable.close();
            CustomerAccountICProxi inCache = (CustomerAccountICProxi)Cache.getTheCache().put(result);
            CustomerAccount objectInCache = (CustomerAccount)inCache.getTheObject();
            if (objectInCache == result)result.initializeOnInstantiation();
            return objectInCache;
        }catch(SQLException se) {
            throw new PersistenceException(se.getMessage(), se.getErrorCode());
        }
    }
    public long getClass(long objectId) throws PersistenceException{
        try{
            CallableStatement callable;
            callable = this.con.prepareCall("Begin ? := " + this.schemaName + ".CstmrAccntFacade.getClass(?); end;");
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
    public void balanceSet(long CustomerAccountId, common.Fraction balanceVal) throws PersistenceException {
        try{
            CallableStatement callable;
            callable = this.con.prepareCall("Begin " + this.schemaName + ".CstmrAccntFacade.blncSet(?, ?); end;");
            callable.setLong(1, CustomerAccountId);
            callable.setString(2, balanceVal.toString());
            callable.execute();
            callable.close();
        }catch(SQLException se) {
            throw new PersistenceException(se.getMessage(), se.getErrorCode());
        }
    }
    public void limitSet(long CustomerAccountId, long limitVal) throws PersistenceException {
        try{
            CallableStatement callable;
            callable = this.con.prepareCall("Begin " + this.schemaName + ".CstmrAccntFacade.lmtSet(?, ?); end;");
            callable.setLong(1, CustomerAccountId);
            callable.setLong(2, limitVal);
            callable.execute();
            callable.close();
        }catch(SQLException se) {
            throw new PersistenceException(se.getMessage(), se.getErrorCode());
        }
    }
    public void shoppingCartSet(long CustomerAccountId, PersistentShoppingCart shoppingCartVal) throws PersistenceException {
        try{
            CallableStatement callable;
            callable = this.con.prepareCall("Begin " + this.schemaName + ".CstmrAccntFacade.shppngCrtSet(?, ?, ?); end;");
            callable.setLong(1, CustomerAccountId);
            callable.setLong(2, shoppingCartVal.getId());
            callable.setLong(3, shoppingCartVal.getClassId());
            callable.execute();
            callable.close();
        }catch(SQLException se) {
            throw new PersistenceException(se.getMessage(), se.getErrorCode());
        }
    }
    public void subServiceSet(long CustomerAccountId, SubjInterface subServiceVal) throws PersistenceException {
        try{
            CallableStatement callable;
            callable = this.con.prepareCall("Begin " + this.schemaName + ".CstmrAccntFacade.sbSrvcSet(?, ?, ?); end;");
            callable.setLong(1, CustomerAccountId);
            callable.setLong(2, subServiceVal.getId());
            callable.setLong(3, subServiceVal.getClassId());
            callable.execute();
            callable.close();
        }catch(SQLException se) {
            throw new PersistenceException(se.getMessage(), se.getErrorCode());
        }
    }
    public void ThisSet(long CustomerAccountId, PersistentCustomerAccount ThisVal) throws PersistenceException {
        try{
            CallableStatement callable;
            callable = this.con.prepareCall("Begin " + this.schemaName + ".CstmrAccntFacade.ThisSet(?, ?, ?); end;");
            callable.setLong(1, CustomerAccountId);
            callable.setLong(2, ThisVal.getId());
            callable.setLong(3, ThisVal.getClassId());
            callable.execute();
            callable.close();
        }catch(SQLException se) {
            throw new PersistenceException(se.getMessage(), se.getErrorCode());
        }
    }

}

