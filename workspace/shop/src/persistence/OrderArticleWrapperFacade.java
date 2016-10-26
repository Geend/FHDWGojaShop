package persistence;

import model.*;

import java.sql.*;
//import oracle.jdbc.*;

public class OrderArticleWrapperFacade{

	private String schemaName;
	private Connection con;

	public OrderArticleWrapperFacade(String schemaName, Connection con) {
		this.schemaName = schemaName;
		this.con = con;
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentOrderArticleWrapper newOrderArticleWrapper(common.Fraction priceAtOrder,long idCreateIfLessZero) throws PersistenceException {
        oracle.jdbc.OracleCallableStatement callable;
        try{
            callable = (oracle.jdbc.OracleCallableStatement)this.con.prepareCall("Begin ? := " + this.schemaName + ".oawFacade.newoaw(?,?); end;");
            callable.registerOutParameter(1, oracle.jdbc.OracleTypes.NUMBER);
            callable.setString(2, priceAtOrder.toString());
            callable.setLong(3, idCreateIfLessZero);
            callable.execute();
            long id = callable.getLong(1);
            callable.close();
            OrderArticleWrapper result = new OrderArticleWrapper(null,null,priceAtOrder,id);
            if (idCreateIfLessZero < 0)Cache.getTheCache().put(result);
            return (PersistentOrderArticleWrapper)PersistentProxi.createProxi(id, 167);
        }catch(SQLException se) {
            throw new PersistenceException(se.getMessage(), se.getErrorCode());
        }
    }
    
    public PersistentOrderArticleWrapper newDelayedOrderArticleWrapper(common.Fraction priceAtOrder) throws PersistenceException {
        oracle.jdbc.OracleCallableStatement callable;
        try{
            callable = (oracle.jdbc.OracleCallableStatement)this.con.prepareCall("Begin ? := " + this.schemaName + ".oawFacade.newDelayedoaw(); end;");
            callable.registerOutParameter(1, oracle.jdbc.OracleTypes.NUMBER);
            callable.execute();
            long id = callable.getLong(1);
            callable.close();
            OrderArticleWrapper result = new OrderArticleWrapper(null,null,priceAtOrder,id);
            Cache.getTheCache().put(result);
            return (PersistentOrderArticleWrapper)PersistentProxi.createProxi(id, 167);
        }catch(SQLException se) {
            throw new PersistenceException(se.getMessage(), se.getErrorCode());
        }
    }
    
    public OrderArticleWrapper getOrderArticleWrapper(long OrderArticleWrapperId) throws PersistenceException{
        try{
            CallableStatement callable;
            callable = this.con.prepareCall("Begin ? := " + this.schemaName + ".oawFacade.getoaw(?); end;");
            callable.registerOutParameter(1, oracle.jdbc.OracleTypes.CURSOR);
            callable.setLong(2, OrderArticleWrapperId);
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
            OrderArticleWrapper result = new OrderArticleWrapper(article,
                                                                 This,
                                                                 (obj.getString(6) == null ? common.Fraction.Null : common.Fraction.parse(obj.getString(6))),
                                                                 OrderArticleWrapperId);
            obj.close();
            callable.close();
            OrderArticleWrapperICProxi inCache = (OrderArticleWrapperICProxi)Cache.getTheCache().put(result);
            OrderArticleWrapper objectInCache = (OrderArticleWrapper)inCache.getTheObject();
            if (objectInCache == result)result.initializeOnInstantiation();
            return objectInCache;
        }catch(SQLException se) {
            throw new PersistenceException(se.getMessage(), se.getErrorCode());
        }
    }
    public void priceAtOrderSet(long OrderArticleWrapperId, common.Fraction priceAtOrderVal) throws PersistenceException {
        try{
            CallableStatement callable;
            callable = this.con.prepareCall("Begin " + this.schemaName + ".oawFacade.prcAtOrdrSet(?, ?); end;");
            callable.setLong(1, OrderArticleWrapperId);
            callable.setString(2, priceAtOrderVal.toString());
            callable.execute();
            callable.close();
        }catch(SQLException se) {
            throw new PersistenceException(se.getMessage(), se.getErrorCode());
        }
    }

}

