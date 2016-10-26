package persistence;

import model.*;

import java.sql.*;
//import oracle.jdbc.*;

public class ShoppingCartQuantifiedArticleFacade{

	private String schemaName;
	private Connection con;

	public ShoppingCartQuantifiedArticleFacade(String schemaName, Connection con) {
		this.schemaName = schemaName;
		this.con = con;
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentShoppingCartQuantifiedArticle newShoppingCartQuantifiedArticle(long quantity,long idCreateIfLessZero) throws PersistenceException {
        oracle.jdbc.OracleCallableStatement callable;
        try{
            callable = (oracle.jdbc.OracleCallableStatement)this.con.prepareCall("Begin ? := " + this.schemaName + ".scqaFacade.newscqa(?,?); end;");
            callable.registerOutParameter(1, oracle.jdbc.OracleTypes.NUMBER);
            callable.setLong(2, quantity);
            callable.setLong(3, idCreateIfLessZero);
            callable.execute();
            long id = callable.getLong(1);
            callable.close();
            ShoppingCartQuantifiedArticle result = new ShoppingCartQuantifiedArticle(quantity,null,null,id);
            if (idCreateIfLessZero < 0)Cache.getTheCache().put(result);
            return (PersistentShoppingCartQuantifiedArticle)PersistentProxi.createProxi(id, 153);
        }catch(SQLException se) {
            throw new PersistenceException(se.getMessage(), se.getErrorCode());
        }
    }
    
    public PersistentShoppingCartQuantifiedArticle newDelayedShoppingCartQuantifiedArticle(long quantity) throws PersistenceException {
        oracle.jdbc.OracleCallableStatement callable;
        try{
            callable = (oracle.jdbc.OracleCallableStatement)this.con.prepareCall("Begin ? := " + this.schemaName + ".scqaFacade.newDelayedscqa(); end;");
            callable.registerOutParameter(1, oracle.jdbc.OracleTypes.NUMBER);
            callable.execute();
            long id = callable.getLong(1);
            callable.close();
            ShoppingCartQuantifiedArticle result = new ShoppingCartQuantifiedArticle(quantity,null,null,id);
            Cache.getTheCache().put(result);
            return (PersistentShoppingCartQuantifiedArticle)PersistentProxi.createProxi(id, 153);
        }catch(SQLException se) {
            throw new PersistenceException(se.getMessage(), se.getErrorCode());
        }
    }
    
    public ShoppingCartQuantifiedArticle getShoppingCartQuantifiedArticle(long ShoppingCartQuantifiedArticleId) throws PersistenceException{
        try{
            CallableStatement callable;
            callable = this.con.prepareCall("Begin ? := " + this.schemaName + ".scqaFacade.getscqa(?); end;");
            callable.registerOutParameter(1, oracle.jdbc.OracleTypes.CURSOR);
            callable.setLong(2, ShoppingCartQuantifiedArticleId);
            callable.execute();
            ResultSet obj = ((oracle.jdbc.OracleCallableStatement)callable).getCursor(1);
            if (!obj.next()) {
                obj.close();
                callable.close();
                return null;
            }
            PersistentQuantifiedArticle This = null;
            if (obj.getLong(3) != 0)
                This = (PersistentQuantifiedArticle)PersistentProxi.createProxi(obj.getLong(3), obj.getLong(4));
            PersistentShoppingCartArticleWrapper article = null;
            if (obj.getLong(5) != 0)
                article = (PersistentShoppingCartArticleWrapper)PersistentProxi.createProxi(obj.getLong(5), obj.getLong(6));
            ShoppingCartQuantifiedArticle result = new ShoppingCartQuantifiedArticle(obj.getLong(2),
                                                                                     This,
                                                                                     article,
                                                                                     ShoppingCartQuantifiedArticleId);
            obj.close();
            callable.close();
            ShoppingCartQuantifiedArticleICProxi inCache = (ShoppingCartQuantifiedArticleICProxi)Cache.getTheCache().put(result);
            ShoppingCartQuantifiedArticle objectInCache = (ShoppingCartQuantifiedArticle)inCache.getTheObject();
            if (objectInCache == result)result.initializeOnInstantiation();
            return objectInCache;
        }catch(SQLException se) {
            throw new PersistenceException(se.getMessage(), se.getErrorCode());
        }
    }
    public void articleSet(long ShoppingCartQuantifiedArticleId, PersistentShoppingCartArticleWrapper articleVal) throws PersistenceException {
        try{
            CallableStatement callable;
            callable = this.con.prepareCall("Begin " + this.schemaName + ".scqaFacade.artclSet(?, ?, ?); end;");
            callable.setLong(1, ShoppingCartQuantifiedArticleId);
            callable.setLong(2, articleVal.getId());
            callable.setLong(3, articleVal.getClassId());
            callable.execute();
            callable.close();
        }catch(SQLException se) {
            throw new PersistenceException(se.getMessage(), se.getErrorCode());
        }
    }

}

