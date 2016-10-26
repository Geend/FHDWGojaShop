package persistence;

import model.*;

import java.sql.*;
//import oracle.jdbc.*;

public class OrderQuantifiedArticleFacade{

	private String schemaName;
	private Connection con;

	public OrderQuantifiedArticleFacade(String schemaName, Connection con) {
		this.schemaName = schemaName;
		this.con = con;
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentOrderQuantifiedArticle newOrderQuantifiedArticle(long quantity,long idCreateIfLessZero) throws PersistenceException {
        oracle.jdbc.OracleCallableStatement callable;
        try{
            callable = (oracle.jdbc.OracleCallableStatement)this.con.prepareCall("Begin ? := " + this.schemaName + ".oqaFacade.newoqa(?,?); end;");
            callable.registerOutParameter(1, oracle.jdbc.OracleTypes.NUMBER);
            callable.setLong(2, quantity);
            callable.setLong(3, idCreateIfLessZero);
            callable.execute();
            long id = callable.getLong(1);
            callable.close();
            OrderQuantifiedArticle result = new OrderQuantifiedArticle(quantity,null,null,id);
            if (idCreateIfLessZero < 0)Cache.getTheCache().put(result);
            return (PersistentOrderQuantifiedArticle)PersistentProxi.createProxi(id, 148);
        }catch(SQLException se) {
            throw new PersistenceException(se.getMessage(), se.getErrorCode());
        }
    }
    
    public PersistentOrderQuantifiedArticle newDelayedOrderQuantifiedArticle(long quantity) throws PersistenceException {
        oracle.jdbc.OracleCallableStatement callable;
        try{
            callable = (oracle.jdbc.OracleCallableStatement)this.con.prepareCall("Begin ? := " + this.schemaName + ".oqaFacade.newDelayedoqa(); end;");
            callable.registerOutParameter(1, oracle.jdbc.OracleTypes.NUMBER);
            callable.execute();
            long id = callable.getLong(1);
            callable.close();
            OrderQuantifiedArticle result = new OrderQuantifiedArticle(quantity,null,null,id);
            Cache.getTheCache().put(result);
            return (PersistentOrderQuantifiedArticle)PersistentProxi.createProxi(id, 148);
        }catch(SQLException se) {
            throw new PersistenceException(se.getMessage(), se.getErrorCode());
        }
    }
    
    public OrderQuantifiedArticle getOrderQuantifiedArticle(long OrderQuantifiedArticleId) throws PersistenceException{
        try{
            CallableStatement callable;
            callable = this.con.prepareCall("Begin ? := " + this.schemaName + ".oqaFacade.getoqa(?); end;");
            callable.registerOutParameter(1, oracle.jdbc.OracleTypes.CURSOR);
            callable.setLong(2, OrderQuantifiedArticleId);
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
            PersistentOrderArticleWrapper article = null;
            if (obj.getLong(5) != 0)
                article = (PersistentOrderArticleWrapper)PersistentProxi.createProxi(obj.getLong(5), obj.getLong(6));
            OrderQuantifiedArticle result = new OrderQuantifiedArticle(obj.getLong(2),
                                                                       This,
                                                                       article,
                                                                       OrderQuantifiedArticleId);
            obj.close();
            callable.close();
            OrderQuantifiedArticleICProxi inCache = (OrderQuantifiedArticleICProxi)Cache.getTheCache().put(result);
            OrderQuantifiedArticle objectInCache = (OrderQuantifiedArticle)inCache.getTheObject();
            if (objectInCache == result)result.initializeOnInstantiation();
            return objectInCache;
        }catch(SQLException se) {
            throw new PersistenceException(se.getMessage(), se.getErrorCode());
        }
    }
    public void articleSet(long OrderQuantifiedArticleId, PersistentOrderArticleWrapper articleVal) throws PersistenceException {
        try{
            CallableStatement callable;
            callable = this.con.prepareCall("Begin " + this.schemaName + ".oqaFacade.artclSet(?, ?, ?); end;");
            callable.setLong(1, OrderQuantifiedArticleId);
            callable.setLong(2, articleVal.getId());
            callable.setLong(3, articleVal.getClassId());
            callable.execute();
            callable.close();
        }catch(SQLException se) {
            throw new PersistenceException(se.getMessage(), se.getErrorCode());
        }
    }

}

