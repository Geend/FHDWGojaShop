package persistence;

import model.*;

import java.sql.*;
//import oracle.jdbc.*;

public class ArticleFacade{

	private String schemaName;
	private Connection con;

	public ArticleFacade(String schemaName, Connection con) {
		this.schemaName = schemaName;
		this.con = con;
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentArticle newArticle(String name,common.Fraction price,long minStock,long maxStock,long currentStock,long producerDeliveryTime,long idCreateIfLessZero) throws PersistenceException {
        oracle.jdbc.OracleCallableStatement callable;
        try{
            callable = (oracle.jdbc.OracleCallableStatement)this.con.prepareCall("Begin ? := " + this.schemaName + ".ArtclFacade.newArtcl(?,?,?,?,?,?,?); end;");
            callable.registerOutParameter(1, oracle.jdbc.OracleTypes.NUMBER);
            callable.setString(2, name);
            callable.setString(3, price.toString());
            callable.setLong(4, minStock);
            callable.setLong(5, maxStock);
            callable.setLong(6, currentStock);
            callable.setLong(7, producerDeliveryTime);
            callable.setLong(8, idCreateIfLessZero);
            callable.execute();
            long id = callable.getLong(1);
            callable.close();
            Article result = new Article(name,null,null,price,minStock,maxStock,currentStock,producerDeliveryTime,null,null,id);
            if (idCreateIfLessZero < 0)Cache.getTheCache().put(result);
            return (PersistentArticle)PersistentProxi.createProxi(id, 123);
        }catch(SQLException se) {
            throw new PersistenceException(se.getMessage(), se.getErrorCode());
        }
    }
    
    public PersistentArticle newDelayedArticle(String name,common.Fraction price,long minStock,long maxStock,long currentStock,long producerDeliveryTime) throws PersistenceException {
        oracle.jdbc.OracleCallableStatement callable;
        try{
            callable = (oracle.jdbc.OracleCallableStatement)this.con.prepareCall("Begin ? := " + this.schemaName + ".ArtclFacade.newDelayedArtcl(); end;");
            callable.registerOutParameter(1, oracle.jdbc.OracleTypes.NUMBER);
            callable.execute();
            long id = callable.getLong(1);
            callable.close();
            Article result = new Article(name,null,null,price,minStock,maxStock,currentStock,producerDeliveryTime,null,null,id);
            Cache.getTheCache().put(result);
            return (PersistentArticle)PersistentProxi.createProxi(id, 123);
        }catch(SQLException se) {
            throw new PersistenceException(se.getMessage(), se.getErrorCode());
        }
    }
    
    public Article getArticle(long ArticleId) throws PersistenceException{
        try{
            CallableStatement callable;
            callable = this.con.prepareCall("Begin ? := " + this.schemaName + ".ArtclFacade.getArtcl(?); end;");
            callable.registerOutParameter(1, oracle.jdbc.OracleTypes.CURSOR);
            callable.setLong(2, ArticleId);
            callable.execute();
            ResultSet obj = ((oracle.jdbc.OracleCallableStatement)callable).getCursor(1);
            if (!obj.next()) {
                obj.close();
                callable.close();
                return null;
            }
            SubjInterface subService = null;
            if (obj.getLong(3) != 0)
                subService = (SubjInterface)PersistentProxi.createProxi(obj.getLong(3), obj.getLong(4));
            PersistentComponent This = null;
            if (obj.getLong(5) != 0)
                This = (PersistentComponent)PersistentProxi.createProxi(obj.getLong(5), obj.getLong(6));
            PersistentProducer producer = null;
            if (obj.getLong(12) != 0)
                producer = (PersistentProducer)PersistentProxi.createProxi(obj.getLong(12), obj.getLong(13));
            PersistentArticleState state = null;
            if (obj.getLong(14) != 0)
                state = (PersistentArticleState)PersistentProxi.createProxi(obj.getLong(14), obj.getLong(15));
            Article result = new Article(obj.getString(2) == null ? "" : obj.getString(2) /* In Oracle "" = null !!! */,
                                         subService,
                                         This,
                                         (obj.getString(7) == null ? common.Fraction.Null : common.Fraction.parse(obj.getString(7))),
                                         obj.getLong(8),
                                         obj.getLong(9),
                                         obj.getLong(10),
                                         obj.getLong(11),
                                         producer,
                                         state,
                                         ArticleId);
            obj.close();
            callable.close();
            ArticleICProxi inCache = (ArticleICProxi)Cache.getTheCache().put(result);
            Article objectInCache = (Article)inCache.getTheObject();
            if (objectInCache == result)result.initializeOnInstantiation();
            return objectInCache;
        }catch(SQLException se) {
            throw new PersistenceException(se.getMessage(), se.getErrorCode());
        }
    }
    public void priceSet(long ArticleId, common.Fraction priceVal) throws PersistenceException {
        try{
            CallableStatement callable;
            callable = this.con.prepareCall("Begin " + this.schemaName + ".ArtclFacade.prcSet(?, ?); end;");
            callable.setLong(1, ArticleId);
            callable.setString(2, priceVal.toString());
            callable.execute();
            callable.close();
        }catch(SQLException se) {
            throw new PersistenceException(se.getMessage(), se.getErrorCode());
        }
    }
    public void minStockSet(long ArticleId, long minStockVal) throws PersistenceException {
        try{
            CallableStatement callable;
            callable = this.con.prepareCall("Begin " + this.schemaName + ".ArtclFacade.mnStckSet(?, ?); end;");
            callable.setLong(1, ArticleId);
            callable.setLong(2, minStockVal);
            callable.execute();
            callable.close();
        }catch(SQLException se) {
            throw new PersistenceException(se.getMessage(), se.getErrorCode());
        }
    }
    public void maxStockSet(long ArticleId, long maxStockVal) throws PersistenceException {
        try{
            CallableStatement callable;
            callable = this.con.prepareCall("Begin " + this.schemaName + ".ArtclFacade.mxStckSet(?, ?); end;");
            callable.setLong(1, ArticleId);
            callable.setLong(2, maxStockVal);
            callable.execute();
            callable.close();
        }catch(SQLException se) {
            throw new PersistenceException(se.getMessage(), se.getErrorCode());
        }
    }
    public void currentStockSet(long ArticleId, long currentStockVal) throws PersistenceException {
        try{
            CallableStatement callable;
            callable = this.con.prepareCall("Begin " + this.schemaName + ".ArtclFacade.crrntStckSet(?, ?); end;");
            callable.setLong(1, ArticleId);
            callable.setLong(2, currentStockVal);
            callable.execute();
            callable.close();
        }catch(SQLException se) {
            throw new PersistenceException(se.getMessage(), se.getErrorCode());
        }
    }
    public void producerDeliveryTimeSet(long ArticleId, long producerDeliveryTimeVal) throws PersistenceException {
        try{
            CallableStatement callable;
            callable = this.con.prepareCall("Begin " + this.schemaName + ".ArtclFacade.prdcrDlvrTmSet(?, ?); end;");
            callable.setLong(1, ArticleId);
            callable.setLong(2, producerDeliveryTimeVal);
            callable.execute();
            callable.close();
        }catch(SQLException se) {
            throw new PersistenceException(se.getMessage(), se.getErrorCode());
        }
    }
    public void producerSet(long ArticleId, PersistentProducer producerVal) throws PersistenceException {
        try{
            CallableStatement callable;
            callable = this.con.prepareCall("Begin " + this.schemaName + ".ArtclFacade.prdcrSet(?, ?, ?); end;");
            callable.setLong(1, ArticleId);
            callable.setLong(2, producerVal.getId());
            callable.setLong(3, producerVal.getClassId());
            callable.execute();
            callable.close();
        }catch(SQLException se) {
            throw new PersistenceException(se.getMessage(), se.getErrorCode());
        }
    }
    public void stateSet(long ArticleId, PersistentArticleState stateVal) throws PersistenceException {
        try{
            CallableStatement callable;
            callable = this.con.prepareCall("Begin " + this.schemaName + ".ArtclFacade.sttSet(?, ?, ?); end;");
            callable.setLong(1, ArticleId);
            callable.setLong(2, stateVal.getId());
            callable.setLong(3, stateVal.getClassId());
            callable.execute();
            callable.close();
        }catch(SQLException se) {
            throw new PersistenceException(se.getMessage(), se.getErrorCode());
        }
    }

}

