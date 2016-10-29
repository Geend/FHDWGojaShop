package persistence;

import model.meta.*;

import java.sql.*;
//import oracle.jdbc.*;

public class AddArticleCommandFacade{

	private String schemaName;
	private Connection con;

	public AddArticleCommandFacade(String schemaName, Connection con) {
		this.schemaName = schemaName;
		this.con = con;
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentAddArticleCommand newAddArticleCommand(String name,common.Fraction price,long minStock,long maxStock,long producerDeliveryTime,long idCreateIfLessZero) throws PersistenceException {
        oracle.jdbc.OracleCallableStatement callable;
        try{
            callable = (oracle.jdbc.OracleCallableStatement)this.con.prepareCall("Begin ? := " + this.schemaName + ".AddArtclCMDFacade.newAddArtclCMD(?,?,?,?,?,?); end;");
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
            AddArticleCommand result = new AddArticleCommand(name,price,minStock,maxStock,producerDeliveryTime,null,null,null,null,id);
            if (idCreateIfLessZero < 0)Cache.getTheCache().put(result);
            return (PersistentAddArticleCommand)PersistentProxi.createProxi(id, 208);
        }catch(SQLException se) {
            throw new PersistenceException(se.getMessage(), se.getErrorCode());
        }
    }
    
    public PersistentAddArticleCommand newDelayedAddArticleCommand(String name,common.Fraction price,long minStock,long maxStock,long producerDeliveryTime) throws PersistenceException {
        oracle.jdbc.OracleCallableStatement callable;
        try{
            callable = (oracle.jdbc.OracleCallableStatement)this.con.prepareCall("Begin ? := " + this.schemaName + ".AddArtclCMDFacade.newDelayedAddArtclCMD(); end;");
            callable.registerOutParameter(1, oracle.jdbc.OracleTypes.NUMBER);
            callable.execute();
            long id = callable.getLong(1);
            callable.close();
            AddArticleCommand result = new AddArticleCommand(name,price,minStock,maxStock,producerDeliveryTime,null,null,null,null,id);
            Cache.getTheCache().put(result);
            return (PersistentAddArticleCommand)PersistentProxi.createProxi(id, 208);
        }catch(SQLException se) {
            throw new PersistenceException(se.getMessage(), se.getErrorCode());
        }
    }
    
    public AddArticleCommand getAddArticleCommand(long AddArticleCommandId) throws PersistenceException{
        try{
            CallableStatement callable;
            callable = this.con.prepareCall("Begin ? := " + this.schemaName + ".AddArtclCMDFacade.getAddArtclCMD(?); end;");
            callable.registerOutParameter(1, oracle.jdbc.OracleTypes.CURSOR);
            callable.setLong(2, AddArticleCommandId);
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
            PersistentCommonDate myCommonDate = null;
            if (obj.getLong(13) != 0)
                myCommonDate = (PersistentCommonDate)PersistentProxi.createProxi(obj.getLong(13), obj.getLong(14));
            AddArticleCommand result = new AddArticleCommand(obj.getString(2) == null ? "" : obj.getString(2) /* In Oracle "" = null !!! */,
                                                             (obj.getString(3) == null ? common.Fraction.Null : common.Fraction.parse(obj.getString(3))),
                                                             obj.getLong(4),
                                                             obj.getLong(5),
                                                             obj.getLong(6),
                                                             producer,
                                                             invoker,
                                                             commandReceiver,
                                                             myCommonDate,
                                                             AddArticleCommandId);
            obj.close();
            callable.close();
            AddArticleCommandICProxi inCache = (AddArticleCommandICProxi)Cache.getTheCache().put(result);
            AddArticleCommand objectInCache = (AddArticleCommand)inCache.getTheObject();
            return objectInCache;
        }catch(SQLException se) {
            throw new PersistenceException(se.getMessage(), se.getErrorCode());
        }
    }
    public long getClass(long objectId) throws PersistenceException{
        try{
            CallableStatement callable;
            callable = this.con.prepareCall("Begin ? := " + this.schemaName + ".AddArtclCMDFacade.getClass(?); end;");
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
    public void nameSet(long AddArticleCommandId, String nameVal) throws PersistenceException {
        try{
            CallableStatement callable;
            callable = this.con.prepareCall("Begin " + this.schemaName + ".AddArtclCMDFacade.nmSet(?, ?); end;");
            callable.setLong(1, AddArticleCommandId);
            callable.setString(2, nameVal);
            callable.execute();
            callable.close();
        }catch(SQLException se) {
            throw new PersistenceException(se.getMessage(), se.getErrorCode());
        }
    }
    public void priceSet(long AddArticleCommandId, common.Fraction priceVal) throws PersistenceException {
        try{
            CallableStatement callable;
            callable = this.con.prepareCall("Begin " + this.schemaName + ".AddArtclCMDFacade.prcSet(?, ?); end;");
            callable.setLong(1, AddArticleCommandId);
            callable.setString(2, priceVal.toString());
            callable.execute();
            callable.close();
        }catch(SQLException se) {
            throw new PersistenceException(se.getMessage(), se.getErrorCode());
        }
    }
    public void minStockSet(long AddArticleCommandId, long minStockVal) throws PersistenceException {
        try{
            CallableStatement callable;
            callable = this.con.prepareCall("Begin " + this.schemaName + ".AddArtclCMDFacade.mnStckSet(?, ?); end;");
            callable.setLong(1, AddArticleCommandId);
            callable.setLong(2, minStockVal);
            callable.execute();
            callable.close();
        }catch(SQLException se) {
            throw new PersistenceException(se.getMessage(), se.getErrorCode());
        }
    }
    public void maxStockSet(long AddArticleCommandId, long maxStockVal) throws PersistenceException {
        try{
            CallableStatement callable;
            callable = this.con.prepareCall("Begin " + this.schemaName + ".AddArtclCMDFacade.mxStckSet(?, ?); end;");
            callable.setLong(1, AddArticleCommandId);
            callable.setLong(2, maxStockVal);
            callable.execute();
            callable.close();
        }catch(SQLException se) {
            throw new PersistenceException(se.getMessage(), se.getErrorCode());
        }
    }
    public void producerDeliveryTimeSet(long AddArticleCommandId, long producerDeliveryTimeVal) throws PersistenceException {
        try{
            CallableStatement callable;
            callable = this.con.prepareCall("Begin " + this.schemaName + ".AddArtclCMDFacade.prdcrDlvrTmSet(?, ?); end;");
            callable.setLong(1, AddArticleCommandId);
            callable.setLong(2, producerDeliveryTimeVal);
            callable.execute();
            callable.close();
        }catch(SQLException se) {
            throw new PersistenceException(se.getMessage(), se.getErrorCode());
        }
    }
    public void producerSet(long AddArticleCommandId, Producer4Public producerVal) throws PersistenceException {
        try{
            CallableStatement callable;
            callable = this.con.prepareCall("Begin " + this.schemaName + ".AddArtclCMDFacade.prdcrSet(?, ?, ?); end;");
            callable.setLong(1, AddArticleCommandId);
            callable.setLong(2, producerVal.getId());
            callable.setLong(3, producerVal.getClassId());
            callable.execute();
            callable.close();
        }catch(SQLException se) {
            throw new PersistenceException(se.getMessage(), se.getErrorCode());
        }
    }
    public void invokerSet(long AddArticleCommandId, Invoker invokerVal) throws PersistenceException {
        try{
            CallableStatement callable;
            callable = this.con.prepareCall("Begin " + this.schemaName + ".AddArtclCMDFacade.invokerSet(?, ?, ?); end;");
            callable.setLong(1, AddArticleCommandId);
            callable.setLong(2, invokerVal.getId());
            callable.setLong(3, invokerVal.getClassId());
            callable.execute();
            callable.close();
        }catch(SQLException se) {
            throw new PersistenceException(se.getMessage(), se.getErrorCode());
        }
    }
    public void commandReceiverSet(long AddArticleCommandId, ProductGroup4Public commandReceiverVal) throws PersistenceException {
        try{
            CallableStatement callable;
            callable = this.con.prepareCall("Begin " + this.schemaName + ".AddArtclCMDFacade.cReceiverSet(?, ?, ?); end;");
            callable.setLong(1, AddArticleCommandId);
            callable.setLong(2, commandReceiverVal.getId());
            callable.setLong(3, commandReceiverVal.getClassId());
            callable.execute();
            callable.close();
        }catch(SQLException se) {
            throw new PersistenceException(se.getMessage(), se.getErrorCode());
        }
    }
    public void myCommonDateSet(long AddArticleCommandId, CommonDate4Public myCommonDateVal) throws PersistenceException {
        try{
            CallableStatement callable;
            callable = this.con.prepareCall("Begin " + this.schemaName + ".AddArtclCMDFacade.myCmmnDtSet(?, ?, ?); end;");
            callable.setLong(1, AddArticleCommandId);
            callable.setLong(2, myCommonDateVal.getId());
            callable.setLong(3, myCommonDateVal.getClassId());
            callable.execute();
            callable.close();
        }catch(SQLException se) {
            throw new PersistenceException(se.getMessage(), se.getErrorCode());
        }
    }

}

