package persistence;

import model.*;

import java.sql.*;
//import oracle.jdbc.*;

public class NotInSaleFacade{

	private String schemaName;
	private Connection con;

	public NotInSaleFacade(String schemaName, Connection con) {
		this.schemaName = schemaName;
		this.con = con;
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentNotInSale newNotInSale(long idCreateIfLessZero) throws PersistenceException {
        oracle.jdbc.OracleCallableStatement callable;
        try{
            callable = (oracle.jdbc.OracleCallableStatement)this.con.prepareCall("Begin ? := " + this.schemaName + ".NtInSlFacade.newNtInSl(?); end;");
            callable.registerOutParameter(1, oracle.jdbc.OracleTypes.NUMBER);
            callable.setLong(2, idCreateIfLessZero);
            callable.execute();
            long id = callable.getLong(1);
            callable.close();
            NotInSale result = new NotInSale(null,id);
            if (idCreateIfLessZero < 0)Cache.getTheCache().put(result);
            return (PersistentNotInSale)PersistentProxi.createProxi(id, 195);
        }catch(SQLException se) {
            throw new PersistenceException(se.getMessage(), se.getErrorCode());
        }
    }
    
    public PersistentNotInSale newDelayedNotInSale() throws PersistenceException {
        oracle.jdbc.OracleCallableStatement callable;
        try{
            callable = (oracle.jdbc.OracleCallableStatement)this.con.prepareCall("Begin ? := " + this.schemaName + ".NtInSlFacade.newDelayedNtInSl(); end;");
            callable.registerOutParameter(1, oracle.jdbc.OracleTypes.NUMBER);
            callable.execute();
            long id = callable.getLong(1);
            callable.close();
            NotInSale result = new NotInSale(null,id);
            Cache.getTheCache().put(result);
            return (PersistentNotInSale)PersistentProxi.createProxi(id, 195);
        }catch(SQLException se) {
            throw new PersistenceException(se.getMessage(), se.getErrorCode());
        }
    }
    
    public NotInSale getNotInSale(long NotInSaleId) throws PersistenceException{
        try{
            CallableStatement callable;
            callable = this.con.prepareCall("Begin ? := " + this.schemaName + ".NtInSlFacade.getNtInSl(?); end;");
            callable.registerOutParameter(1, oracle.jdbc.OracleTypes.CURSOR);
            callable.setLong(2, NotInSaleId);
            callable.execute();
            ResultSet obj = ((oracle.jdbc.OracleCallableStatement)callable).getCursor(1);
            if (!obj.next()) {
                obj.close();
                callable.close();
                return null;
            }
            PersistentArticleState This = null;
            if (obj.getLong(2) != 0)
                This = (PersistentArticleState)PersistentProxi.createProxi(obj.getLong(2), obj.getLong(3));
            NotInSale result = new NotInSale(This,
                                             NotInSaleId);
            obj.close();
            callable.close();
            NotInSaleICProxi inCache = (NotInSaleICProxi)Cache.getTheCache().put(result);
            NotInSale objectInCache = (NotInSale)inCache.getTheObject();
            if (objectInCache == result)result.initializeOnInstantiation();
            return objectInCache;
        }catch(SQLException se) {
            throw new PersistenceException(se.getMessage(), se.getErrorCode());
        }
    }

}

