package persistence;

import model.*;

import java.sql.*;
//import oracle.jdbc.*;

public class RemainingStockFacade{

	private String schemaName;
	private Connection con;

	public RemainingStockFacade(String schemaName, Connection con) {
		this.schemaName = schemaName;
		this.con = con;
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentRemainingStock newRemainingStock(long idCreateIfLessZero) throws PersistenceException {
        oracle.jdbc.OracleCallableStatement callable;
        try{
            callable = (oracle.jdbc.OracleCallableStatement)this.con.prepareCall("Begin ? := " + this.schemaName + ".RmnngStckFacade.newRmnngStck(?); end;");
            callable.registerOutParameter(1, oracle.jdbc.OracleTypes.NUMBER);
            callable.setLong(2, idCreateIfLessZero);
            callable.execute();
            long id = callable.getLong(1);
            callable.close();
            RemainingStock result = new RemainingStock(null,id);
            if (idCreateIfLessZero < 0)Cache.getTheCache().put(result);
            return (PersistentRemainingStock)PersistentProxi.createProxi(id, 122);
        }catch(SQLException se) {
            throw new PersistenceException(se.getMessage(), se.getErrorCode());
        }
    }
    
    public PersistentRemainingStock newDelayedRemainingStock() throws PersistenceException {
        oracle.jdbc.OracleCallableStatement callable;
        try{
            callable = (oracle.jdbc.OracleCallableStatement)this.con.prepareCall("Begin ? := " + this.schemaName + ".RmnngStckFacade.newDelayedRmnngStck(); end;");
            callable.registerOutParameter(1, oracle.jdbc.OracleTypes.NUMBER);
            callable.execute();
            long id = callable.getLong(1);
            callable.close();
            RemainingStock result = new RemainingStock(null,id);
            Cache.getTheCache().put(result);
            return (PersistentRemainingStock)PersistentProxi.createProxi(id, 122);
        }catch(SQLException se) {
            throw new PersistenceException(se.getMessage(), se.getErrorCode());
        }
    }
    
    public RemainingStock getRemainingStock(long RemainingStockId) throws PersistenceException{
        try{
            CallableStatement callable;
            callable = this.con.prepareCall("Begin ? := " + this.schemaName + ".RmnngStckFacade.getRmnngStck(?); end;");
            callable.registerOutParameter(1, oracle.jdbc.OracleTypes.CURSOR);
            callable.setLong(2, RemainingStockId);
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
            RemainingStock result = new RemainingStock(This,
                                                       RemainingStockId);
            obj.close();
            callable.close();
            RemainingStockICProxi inCache = (RemainingStockICProxi)Cache.getTheCache().put(result);
            RemainingStock objectInCache = (RemainingStock)inCache.getTheObject();
            if (objectInCache == result)result.initializeOnInstantiation();
            return objectInCache;
        }catch(SQLException se) {
            throw new PersistenceException(se.getMessage(), se.getErrorCode());
        }
    }

}

