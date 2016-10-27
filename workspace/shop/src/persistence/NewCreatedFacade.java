package persistence;

import model.*;

import java.sql.*;
//import oracle.jdbc.*;

public class NewCreatedFacade{

	private String schemaName;
	private Connection con;

	public NewCreatedFacade(String schemaName, Connection con) {
		this.schemaName = schemaName;
		this.con = con;
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentNewCreated newNewCreated(long idCreateIfLessZero) throws PersistenceException {
        oracle.jdbc.OracleCallableStatement callable;
        try{
            callable = (oracle.jdbc.OracleCallableStatement)this.con.prepareCall("Begin ? := " + this.schemaName + ".NwCrtdFacade.newNwCrtd(?); end;");
            callable.registerOutParameter(1, oracle.jdbc.OracleTypes.NUMBER);
            callable.setLong(2, idCreateIfLessZero);
            callable.execute();
            long id = callable.getLong(1);
            callable.close();
            NewCreated result = new NewCreated(null,null,id);
            if (idCreateIfLessZero < 0)Cache.getTheCache().put(result);
            return (PersistentNewCreated)PersistentProxi.createProxi(id, 130);
        }catch(SQLException se) {
            throw new PersistenceException(se.getMessage(), se.getErrorCode());
        }
    }
    
    public PersistentNewCreated newDelayedNewCreated() throws PersistenceException {
        oracle.jdbc.OracleCallableStatement callable;
        try{
            callable = (oracle.jdbc.OracleCallableStatement)this.con.prepareCall("Begin ? := " + this.schemaName + ".NwCrtdFacade.newDelayedNwCrtd(); end;");
            callable.registerOutParameter(1, oracle.jdbc.OracleTypes.NUMBER);
            callable.execute();
            long id = callable.getLong(1);
            callable.close();
            NewCreated result = new NewCreated(null,null,id);
            Cache.getTheCache().put(result);
            return (PersistentNewCreated)PersistentProxi.createProxi(id, 130);
        }catch(SQLException se) {
            throw new PersistenceException(se.getMessage(), se.getErrorCode());
        }
    }
    
    public NewCreated getNewCreated(long NewCreatedId) throws PersistenceException{
        try{
            CallableStatement callable;
            callable = this.con.prepareCall("Begin ? := " + this.schemaName + ".NwCrtdFacade.getNwCrtd(?); end;");
            callable.registerOutParameter(1, oracle.jdbc.OracleTypes.CURSOR);
            callable.setLong(2, NewCreatedId);
            callable.execute();
            ResultSet obj = ((oracle.jdbc.OracleCallableStatement)callable).getCursor(1);
            if (!obj.next()) {
                obj.close();
                callable.close();
                return null;
            }
            SubjInterface subService = null;
            if (obj.getLong(2) != 0)
                subService = (SubjInterface)PersistentProxi.createProxi(obj.getLong(2), obj.getLong(3));
            PersistentArticleState This = null;
            if (obj.getLong(4) != 0)
                This = (PersistentArticleState)PersistentProxi.createProxi(obj.getLong(4), obj.getLong(5));
            NewCreated result = new NewCreated(subService,
                                               This,
                                               NewCreatedId);
            obj.close();
            callable.close();
            NewCreatedICProxi inCache = (NewCreatedICProxi)Cache.getTheCache().put(result);
            NewCreated objectInCache = (NewCreated)inCache.getTheObject();
            if (objectInCache == result)result.initializeOnInstantiation();
            return objectInCache;
        }catch(SQLException se) {
            throw new PersistenceException(se.getMessage(), se.getErrorCode());
        }
    }

}

