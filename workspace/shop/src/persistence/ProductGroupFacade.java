package persistence;

import model.*;

import java.sql.*;
//import oracle.jdbc.*;

public class ProductGroupFacade{

	private String schemaName;
	private Connection con;

	public ProductGroupFacade(String schemaName, Connection con) {
		this.schemaName = schemaName;
		this.con = con;
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentProductGroup newProductGroup(long idCreateIfLessZero) throws PersistenceException {
        oracle.jdbc.OracleCallableStatement callable;
        try{
            callable = (oracle.jdbc.OracleCallableStatement)this.con.prepareCall("Begin ? := " + this.schemaName + ".PrdctGrpFacade.newPrdctGrp(?); end;");
            callable.registerOutParameter(1, oracle.jdbc.OracleTypes.NUMBER);
            callable.setLong(2, idCreateIfLessZero);
            callable.execute();
            long id = callable.getLong(1);
            callable.close();
            ProductGroup result = new ProductGroup(null,id);
            if (idCreateIfLessZero < 0)Cache.getTheCache().put(result);
            return (PersistentProductGroup)PersistentProxi.createProxi(id, 121);
        }catch(SQLException se) {
            throw new PersistenceException(se.getMessage(), se.getErrorCode());
        }
    }
    
    public PersistentProductGroup newDelayedProductGroup() throws PersistenceException {
        oracle.jdbc.OracleCallableStatement callable;
        try{
            callable = (oracle.jdbc.OracleCallableStatement)this.con.prepareCall("Begin ? := " + this.schemaName + ".PrdctGrpFacade.newDelayedPrdctGrp(); end;");
            callable.registerOutParameter(1, oracle.jdbc.OracleTypes.NUMBER);
            callable.execute();
            long id = callable.getLong(1);
            callable.close();
            ProductGroup result = new ProductGroup(null,id);
            Cache.getTheCache().put(result);
            return (PersistentProductGroup)PersistentProxi.createProxi(id, 121);
        }catch(SQLException se) {
            throw new PersistenceException(se.getMessage(), se.getErrorCode());
        }
    }
    
    public ProductGroup getProductGroup(long ProductGroupId) throws PersistenceException{
        try{
            CallableStatement callable;
            callable = this.con.prepareCall("Begin ? := " + this.schemaName + ".PrdctGrpFacade.getPrdctGrp(?); end;");
            callable.registerOutParameter(1, oracle.jdbc.OracleTypes.CURSOR);
            callable.setLong(2, ProductGroupId);
            callable.execute();
            ResultSet obj = ((oracle.jdbc.OracleCallableStatement)callable).getCursor(1);
            if (!obj.next()) {
                obj.close();
                callable.close();
                return null;
            }
            PersistentComponent This = null;
            if (obj.getLong(2) != 0)
                This = (PersistentComponent)PersistentProxi.createProxi(obj.getLong(2), obj.getLong(3));
            ProductGroup result = new ProductGroup(This,
                                                   ProductGroupId);
            obj.close();
            callable.close();
            ProductGroupICProxi inCache = (ProductGroupICProxi)Cache.getTheCache().put(result);
            ProductGroup objectInCache = (ProductGroup)inCache.getTheObject();
            if (objectInCache == result)result.initializeOnInstantiation();
            return objectInCache;
        }catch(SQLException se) {
            throw new PersistenceException(se.getMessage(), se.getErrorCode());
        }
    }
    public long componentsAdd(long ProductGroupId, PersistentComponent componentsVal) throws PersistenceException {
        try{
            CallableStatement callable;
            callable = this.con.prepareCall("Begin ? := " + this.schemaName + ".PrdctGrpFacade.cmpnntsAdd(?, ?, ?); end;");
            callable.registerOutParameter(1, oracle.jdbc.OracleTypes.NUMBER);
            callable.setLong(2, ProductGroupId);
            callable.setLong(3, componentsVal.getId());
            callable.setLong(4, componentsVal.getClassId());
            callable.execute();
            long result = callable.getLong(1);
            callable.close();
            return result;
        }catch(SQLException se) {
            throw new PersistenceException(se.getMessage(), se.getErrorCode());
        }
    }
    public void componentsRem(long componentsId) throws PersistenceException {
        try{
            CallableStatement callable;
            callable = this.con.prepareCall("Begin " + this.schemaName + ".PrdctGrpFacade.cmpnntsRem(?); end;");
            callable.setLong(1, componentsId);
            callable.execute();
            callable.close();
        }catch(SQLException se) {
            throw new PersistenceException(se.getMessage(), se.getErrorCode());
        }
    }
    public ComponentList componentsGet(long ProductGroupId) throws PersistenceException {
        try{
            CallableStatement callable;
            callable = this.con.prepareCall("Begin ? := " + this.schemaName + ".PrdctGrpFacade.cmpnntsGet(?); end;");
            callable.registerOutParameter(1, oracle.jdbc.OracleTypes.CURSOR);
            callable.setLong(2, ProductGroupId);
            callable.execute();
            ResultSet list = ((oracle.jdbc.OracleCallableStatement)callable).getCursor(1);
            ComponentList result = new ComponentList();
            while (list.next()) {
                result.add((PersistentComponent)PersistentProxi.createListEntryProxi(list.getLong(1), list.getLong(2), list.getLong(3)));
            }
            list.close();
            callable.close();
            return result;
        }catch(SQLException se) {
            throw new PersistenceException(se.getMessage(), se.getErrorCode());
        }
    }

}

