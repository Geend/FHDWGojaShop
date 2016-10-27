package persistence;

import model.meta.*;

import java.sql.*;
//import oracle.jdbc.*;

public class CreateArticleCommandFacade{

	private String schemaName;
	private Connection con;

	public CreateArticleCommandFacade(String schemaName, Connection con) {
		this.schemaName = schemaName;
		this.con = con;
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentCreateArticleCommand newCreateArticleCommand(String name,common.Fraction price,long minStock,long maxStock,long producerDeliveryTime,long idCreateIfLessZero) throws PersistenceException {
        oracle.jdbc.OracleCallableStatement callable;
        try{
            callable = (oracle.jdbc.OracleCallableStatement)this.con.prepareCall("Begin ? := " + this.schemaName + ".CrtArtclCMDFacade.newCrtArtclCMD(?,?,?,?,?,?); end;");
            callable.registerOutParameter(1, oracle.jdbc.OracleTypes.NUMBER);
            callable.setString(2, name);
            callable.setString(3, price.toString());
            callable.setLong(4, minStock);
            callable.setLong(5, maxStock);
            callable.setLong(6, producerDeliveryTime);
            callable.setLong(7, idCreateIfLessZero);
            callable.execute();
            long id = callable.getLong(1);
            callable.close();
            CreateArticleCommand result = new CreateArticleCommand(name,price,minStock,maxStock,producerDeliveryTime,null,null,null,null,null,id);
            if (idCreateIfLessZero < 0)Cache.getTheCache().put(result);
            return (PersistentCreateArticleCommand)PersistentProxi.createProxi(id, 172);
        }catch(SQLException se) {
            throw new PersistenceException(se.getMessage(), se.getErrorCode());
        }
    }
    
    public PersistentCreateArticleCommand newDelayedCreateArticleCommand(String name,common.Fraction price,long minStock,long maxStock,long producerDeliveryTime) throws PersistenceException {
        oracle.jdbc.OracleCallableStatement callable;
        try{
            callable = (oracle.jdbc.OracleCallableStatement)this.con.prepareCall("Begin ? := " + this.schemaName + ".CrtArtclCMDFacade.newDelayedCrtArtclCMD(); end;");
            callable.registerOutParameter(1, oracle.jdbc.OracleTypes.NUMBER);
            callable.execute();
            long id = callable.getLong(1);
            callable.close();
            CreateArticleCommand result = new CreateArticleCommand(name,price,minStock,maxStock,producerDeliveryTime,null,null,null,null,null,id);
            Cache.getTheCache().put(result);
            return (PersistentCreateArticleCommand)PersistentProxi.createProxi(id, 172);
        }catch(SQLException se) {
            throw new PersistenceException(se.getMessage(), se.getErrorCode());
        }
    }
    
    public CreateArticleCommand getCreateArticleCommand(long CreateArticleCommandId) throws PersistenceException{
        try{
            CallableStatement callable;
            callable = this.con.prepareCall("Begin ? := " + this.schemaName + ".CrtArtclCMDFacade.getCrtArtclCMD(?); end;");
            callable.registerOutParameter(1, oracle.jdbc.OracleTypes.CURSOR);
            callable.setLong(2, CreateArticleCommandId);
            callable.execute();
            ResultSet obj = ((oracle.jdbc.OracleCallableStatement)callable).getCursor(1);
            if (!obj.next()) {
                obj.close();
                callable.close();
                return null;
            }
            PersistentProducer producer = null;
            if (obj.getLong(7) != 0)
                producer = (PersistentProducer)PersistentProxi.createProxi(obj.getLong(7), obj.getLong(8));
            Invoker invoker = null;
            if (obj.getLong(9) != 0)
                invoker = (Invoker)PersistentProxi.createProxi(obj.getLong(9), obj.getLong(10));
            PersistentProductGroup commandReceiver = null;
            if (obj.getLong(11) != 0)
                commandReceiver = (PersistentProductGroup)PersistentProxi.createProxi(obj.getLong(11), obj.getLong(12));
            PersistentArticle commandResult = null;
            if (obj.getLong(13) != 0)
                commandResult = (PersistentArticle)PersistentProxi.createProxi(obj.getLong(13), obj.getLong(14));
            PersistentCommonDate myCommonDate = null;
            if (obj.getLong(15) != 0)
                myCommonDate = (PersistentCommonDate)PersistentProxi.createProxi(obj.getLong(15), obj.getLong(16));
            CreateArticleCommand result = new CreateArticleCommand(obj.getString(2) == null ? "" : obj.getString(2) /* In Oracle "" = null !!! */,
                                                                   (obj.getString(3) == null ? common.Fraction.Null : common.Fraction.parse(obj.getString(3))),
                                                                   obj.getLong(4),
                                                                   obj.getLong(5),
                                                                   obj.getLong(6),
                                                                   producer,
                                                                   invoker,
                                                                   commandReceiver,
                                                                   commandResult,
                                                                   myCommonDate,
                                                                   CreateArticleCommandId);
            obj.close();
            callable.close();
            CreateArticleCommandICProxi inCache = (CreateArticleCommandICProxi)Cache.getTheCache().put(result);
            CreateArticleCommand objectInCache = (CreateArticleCommand)inCache.getTheObject();
            return objectInCache;
        }catch(SQLException se) {
            throw new PersistenceException(se.getMessage(), se.getErrorCode());
        }
    }
    public long getClass(long objectId) throws PersistenceException{
        try{
            CallableStatement callable;
            callable = this.con.prepareCall("Begin ? := " + this.schemaName + ".CrtArtclCMDFacade.getClass(?); end;");
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
    public void nameSet(long CreateArticleCommandId, String nameVal) throws PersistenceException {
        try{
            CallableStatement callable;
            callable = this.con.prepareCall("Begin " + this.schemaName + ".CrtArtclCMDFacade.nmSet(?, ?); end;");
            callable.setLong(1, CreateArticleCommandId);
            callable.setString(2, nameVal);
            callable.execute();
            callable.close();
        }catch(SQLException se) {
            throw new PersistenceException(se.getMessage(), se.getErrorCode());
        }
    }
    public void priceSet(long CreateArticleCommandId, common.Fraction priceVal) throws PersistenceException {
        try{
            CallableStatement callable;
            callable = this.con.prepareCall("Begin " + this.schemaName + ".CrtArtclCMDFacade.prcSet(?, ?); end;");
            callable.setLong(1, CreateArticleCommandId);
            callable.setString(2, priceVal.toString());
            callable.execute();
            callable.close();
        }catch(SQLException se) {
            throw new PersistenceException(se.getMessage(), se.getErrorCode());
        }
    }
    public void minStockSet(long CreateArticleCommandId, long minStockVal) throws PersistenceException {
        try{
            CallableStatement callable;
            callable = this.con.prepareCall("Begin " + this.schemaName + ".CrtArtclCMDFacade.mnStckSet(?, ?); end;");
            callable.setLong(1, CreateArticleCommandId);
            callable.setLong(2, minStockVal);
            callable.execute();
            callable.close();
        }catch(SQLException se) {
            throw new PersistenceException(se.getMessage(), se.getErrorCode());
        }
    }
    public void maxStockSet(long CreateArticleCommandId, long maxStockVal) throws PersistenceException {
        try{
            CallableStatement callable;
            callable = this.con.prepareCall("Begin " + this.schemaName + ".CrtArtclCMDFacade.mxStckSet(?, ?); end;");
            callable.setLong(1, CreateArticleCommandId);
            callable.setLong(2, maxStockVal);
            callable.execute();
            callable.close();
        }catch(SQLException se) {
            throw new PersistenceException(se.getMessage(), se.getErrorCode());
        }
    }
    public void producerDeliveryTimeSet(long CreateArticleCommandId, long producerDeliveryTimeVal) throws PersistenceException {
        try{
            CallableStatement callable;
            callable = this.con.prepareCall("Begin " + this.schemaName + ".CrtArtclCMDFacade.prdcrDlvrTmSet(?, ?); end;");
            callable.setLong(1, CreateArticleCommandId);
            callable.setLong(2, producerDeliveryTimeVal);
            callable.execute();
            callable.close();
        }catch(SQLException se) {
            throw new PersistenceException(se.getMessage(), se.getErrorCode());
        }
    }
    public void producerSet(long CreateArticleCommandId, PersistentProducer producerVal) throws PersistenceException {
        try{
            CallableStatement callable;
            callable = this.con.prepareCall("Begin " + this.schemaName + ".CrtArtclCMDFacade.prdcrSet(?, ?, ?); end;");
            callable.setLong(1, CreateArticleCommandId);
            callable.setLong(2, producerVal.getId());
            callable.setLong(3, producerVal.getClassId());
            callable.execute();
            callable.close();
        }catch(SQLException se) {
            throw new PersistenceException(se.getMessage(), se.getErrorCode());
        }
    }
    public void invokerSet(long CreateArticleCommandId, Invoker invokerVal) throws PersistenceException {
        try{
            CallableStatement callable;
            callable = this.con.prepareCall("Begin " + this.schemaName + ".CrtArtclCMDFacade.invokerSet(?, ?, ?); end;");
            callable.setLong(1, CreateArticleCommandId);
            callable.setLong(2, invokerVal.getId());
            callable.setLong(3, invokerVal.getClassId());
            callable.execute();
            callable.close();
        }catch(SQLException se) {
            throw new PersistenceException(se.getMessage(), se.getErrorCode());
        }
    }
    public void commandReceiverSet(long CreateArticleCommandId, PersistentProductGroup commandReceiverVal) throws PersistenceException {
        try{
            CallableStatement callable;
            callable = this.con.prepareCall("Begin " + this.schemaName + ".CrtArtclCMDFacade.cReceiverSet(?, ?, ?); end;");
            callable.setLong(1, CreateArticleCommandId);
            callable.setLong(2, commandReceiverVal.getId());
            callable.setLong(3, commandReceiverVal.getClassId());
            callable.execute();
            callable.close();
        }catch(SQLException se) {
            throw new PersistenceException(se.getMessage(), se.getErrorCode());
        }
    }
    public void commandResultSet(long CreateArticleCommandId, PersistentArticle commandResultVal) throws PersistenceException {
        try{
            CallableStatement callable;
            callable = this.con.prepareCall("Begin " + this.schemaName + ".CrtArtclCMDFacade.cResultSet(?, ?, ?); end;");
            callable.setLong(1, CreateArticleCommandId);
            callable.setLong(2, commandResultVal.getId());
            callable.setLong(3, commandResultVal.getClassId());
            callable.execute();
            callable.close();
        }catch(SQLException se) {
            throw new PersistenceException(se.getMessage(), se.getErrorCode());
        }
    }
    public void myCommonDateSet(long CreateArticleCommandId, PersistentCommonDate myCommonDateVal) throws PersistenceException {
        try{
            CallableStatement callable;
            callable = this.con.prepareCall("Begin " + this.schemaName + ".CrtArtclCMDFacade.myCmmnDtSet(?, ?, ?); end;");
            callable.setLong(1, CreateArticleCommandId);
            callable.setLong(2, myCommonDateVal.getId());
            callable.setLong(3, myCommonDateVal.getClassId());
            callable.execute();
            callable.close();
        }catch(SQLException se) {
            throw new PersistenceException(se.getMessage(), se.getErrorCode());
        }
    }

}

