package persistence;

import model.*;

import java.sql.*;
//import oracle.jdbc.*;

public class ShopArticleWrapperFacade{

	private String schemaName;
	private Connection con;

	public ShopArticleWrapperFacade(String schemaName, Connection con) {
		this.schemaName = schemaName;
		this.con = con;
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentShopArticleWrapper newShopArticleWrapper(long idCreateIfLessZero) throws PersistenceException {
        oracle.jdbc.OracleCallableStatement callable;
        try{
            callable = (oracle.jdbc.OracleCallableStatement)this.con.prepareCall("Begin ? := " + this.schemaName + ".sawFacade.newsaw(?); end;");
            callable.registerOutParameter(1, oracle.jdbc.OracleTypes.NUMBER);
            callable.setLong(2, idCreateIfLessZero);
            callable.execute();
            long id = callable.getLong(1);
            callable.close();
            ShopArticleWrapper result = new ShopArticleWrapper(null,null,null,id);
            if (idCreateIfLessZero < 0)Cache.getTheCache().put(result);
            return (PersistentShopArticleWrapper)PersistentProxi.createProxi(id, 161);
        }catch(SQLException se) {
            throw new PersistenceException(se.getMessage(), se.getErrorCode());
        }
    }
    
    public PersistentShopArticleWrapper newDelayedShopArticleWrapper() throws PersistenceException {
        oracle.jdbc.OracleCallableStatement callable;
        try{
            callable = (oracle.jdbc.OracleCallableStatement)this.con.prepareCall("Begin ? := " + this.schemaName + ".sawFacade.newDelayedsaw(); end;");
            callable.registerOutParameter(1, oracle.jdbc.OracleTypes.NUMBER);
            callable.execute();
            long id = callable.getLong(1);
            callable.close();
            ShopArticleWrapper result = new ShopArticleWrapper(null,null,null,id);
            Cache.getTheCache().put(result);
            return (PersistentShopArticleWrapper)PersistentProxi.createProxi(id, 161);
        }catch(SQLException se) {
            throw new PersistenceException(se.getMessage(), se.getErrorCode());
        }
    }
    
    public ShopArticleWrapper getShopArticleWrapper(long ShopArticleWrapperId) throws PersistenceException{
        try{
            CallableStatement callable;
            callable = this.con.prepareCall("Begin ? := " + this.schemaName + ".sawFacade.getsaw(?); end;");
            callable.registerOutParameter(1, oracle.jdbc.OracleTypes.CURSOR);
            callable.setLong(2, ShopArticleWrapperId);
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
            SubjInterface subService = null;
            if (obj.getLong(4) != 0)
                subService = (SubjInterface)PersistentProxi.createProxi(obj.getLong(4), obj.getLong(5));
            PersistentArticleWrapper This = null;
            if (obj.getLong(6) != 0)
                This = (PersistentArticleWrapper)PersistentProxi.createProxi(obj.getLong(6), obj.getLong(7));
            ShopArticleWrapper result = new ShopArticleWrapper(article,
                                                               subService,
                                                               This,
                                                               ShopArticleWrapperId);
            obj.close();
            callable.close();
            ShopArticleWrapperICProxi inCache = (ShopArticleWrapperICProxi)Cache.getTheCache().put(result);
            ShopArticleWrapper objectInCache = (ShopArticleWrapper)inCache.getTheObject();
            if (objectInCache == result)result.initializeOnInstantiation();
            return objectInCache;
        }catch(SQLException se) {
            throw new PersistenceException(se.getMessage(), se.getErrorCode());
        }
    }

}

