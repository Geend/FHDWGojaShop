package persistence;

import model.*;

import java.sql.*;
//import oracle.jdbc.*;

public class ShoppingCartArticleWrapperFacade{

	private String schemaName;
	private Connection con;

	public ShoppingCartArticleWrapperFacade(String schemaName, Connection con) {
		this.schemaName = schemaName;
		this.con = con;
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentShoppingCartArticleWrapper newShoppingCartArticleWrapper(long idCreateIfLessZero) throws PersistenceException {
        oracle.jdbc.OracleCallableStatement callable;
        try{
            callable = (oracle.jdbc.OracleCallableStatement)this.con.prepareCall("Begin ? := " + this.schemaName + ".scawFacade.newscaw(?); end;");
            callable.registerOutParameter(1, oracle.jdbc.OracleTypes.NUMBER);
            callable.setLong(2, idCreateIfLessZero);
            callable.execute();
            long id = callable.getLong(1);
            callable.close();
            ShoppingCartArticleWrapper result = new ShoppingCartArticleWrapper(null,null,id);
            if (idCreateIfLessZero < 0)Cache.getTheCache().put(result);
            return (PersistentShoppingCartArticleWrapper)PersistentProxi.createProxi(id, 163);
        }catch(SQLException se) {
            throw new PersistenceException(se.getMessage(), se.getErrorCode());
        }
    }
    
    public PersistentShoppingCartArticleWrapper newDelayedShoppingCartArticleWrapper() throws PersistenceException {
        oracle.jdbc.OracleCallableStatement callable;
        try{
            callable = (oracle.jdbc.OracleCallableStatement)this.con.prepareCall("Begin ? := " + this.schemaName + ".scawFacade.newDelayedscaw(); end;");
            callable.registerOutParameter(1, oracle.jdbc.OracleTypes.NUMBER);
            callable.execute();
            long id = callable.getLong(1);
            callable.close();
            ShoppingCartArticleWrapper result = new ShoppingCartArticleWrapper(null,null,id);
            Cache.getTheCache().put(result);
            return (PersistentShoppingCartArticleWrapper)PersistentProxi.createProxi(id, 163);
        }catch(SQLException se) {
            throw new PersistenceException(se.getMessage(), se.getErrorCode());
        }
    }
    
    public ShoppingCartArticleWrapper getShoppingCartArticleWrapper(long ShoppingCartArticleWrapperId) throws PersistenceException{
        try{
            CallableStatement callable;
            callable = this.con.prepareCall("Begin ? := " + this.schemaName + ".scawFacade.getscaw(?); end;");
            callable.registerOutParameter(1, oracle.jdbc.OracleTypes.CURSOR);
            callable.setLong(2, ShoppingCartArticleWrapperId);
            callable.execute();
            ResultSet obj = ((oracle.jdbc.OracleCallableStatement)callable).getCursor(1);
            if (!obj.next()) {
                obj.close();
                callable.close();
                return null;
            }
            PersistentArticle article = null;
            if (obj.getLong(2) != 0)
                article = (PersistentArticle)PersistentProxi.createProxi(obj.getLong(2), obj.getLong(3));
            PersistentArticleWrapper This = null;
            if (obj.getLong(4) != 0)
                This = (PersistentArticleWrapper)PersistentProxi.createProxi(obj.getLong(4), obj.getLong(5));
            ShoppingCartArticleWrapper result = new ShoppingCartArticleWrapper(article,
                                                                               This,
                                                                               ShoppingCartArticleWrapperId);
            obj.close();
            callable.close();
            ShoppingCartArticleWrapperICProxi inCache = (ShoppingCartArticleWrapperICProxi)Cache.getTheCache().put(result);
            ShoppingCartArticleWrapper objectInCache = (ShoppingCartArticleWrapper)inCache.getTheObject();
            if (objectInCache == result)result.initializeOnInstantiation();
            return objectInCache;
        }catch(SQLException se) {
            throw new PersistenceException(se.getMessage(), se.getErrorCode());
        }
    }

}

