package persistence;

import model.*;

import java.sql.*;
//import oracle.jdbc.*;

public class ServerRootProductGroupFacade{

	private String schemaName;
	private Connection con;

	public ServerRootProductGroupFacade(String schemaName, Connection con) {
		this.schemaName = schemaName;
		this.con = con;
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentServerRootProductGroup newServerRootProductGroup(long idCreateIfLessZero) throws PersistenceException {
        oracle.jdbc.OracleCallableStatement callable;
        try{
            callable = (oracle.jdbc.OracleCallableStatement)this.con.prepareCall("Begin ? := " + this.schemaName + ".SrvrRtPrdctGrpFacade.newSrvrRtPrdctGrp(?); end;");
            callable.registerOutParameter(1, oracle.jdbc.OracleTypes.NUMBER);
            callable.setLong(2, idCreateIfLessZero);
            callable.execute();
            long id = callable.getLong(1);
            callable.close();
            ServerRootProductGroup result = new ServerRootProductGroup(null,null,null,id);
            if (idCreateIfLessZero < 0)Cache.getTheCache().put(result);
            return (PersistentServerRootProductGroup)PersistentProxi.createProxi(id, 174);
        }catch(SQLException se) {
            throw new PersistenceException(se.getMessage(), se.getErrorCode());
        }
    }
    
    public PersistentServerRootProductGroup newDelayedServerRootProductGroup() throws PersistenceException {
        oracle.jdbc.OracleCallableStatement callable;
        try{
            callable = (oracle.jdbc.OracleCallableStatement)this.con.prepareCall("Begin ? := " + this.schemaName + ".SrvrRtPrdctGrpFacade.newDelayedSrvrRtPrdctGrp(); end;");
            callable.registerOutParameter(1, oracle.jdbc.OracleTypes.NUMBER);
            callable.execute();
            long id = callable.getLong(1);
            callable.close();
            ServerRootProductGroup result = new ServerRootProductGroup(null,null,null,id);
            Cache.getTheCache().put(result);
            return (PersistentServerRootProductGroup)PersistentProxi.createProxi(id, 174);
        }catch(SQLException se) {
            throw new PersistenceException(se.getMessage(), se.getErrorCode());
        }
    }
    
    public ServerRootProductGroup getServerRootProductGroup(long ServerRootProductGroupId) throws PersistenceException{
        try{
            CallableStatement callable;
            callable = this.con.prepareCall("Begin ? := " + this.schemaName + ".SrvrRtPrdctGrpFacade.getSrvrRtPrdctGrp(?); end;");
            callable.registerOutParameter(1, oracle.jdbc.OracleTypes.CURSOR);
            callable.setLong(2, ServerRootProductGroupId);
            callable.execute();
            ResultSet obj = ((oracle.jdbc.OracleCallableStatement)callable).getCursor(1);
            if (!obj.next()) {
                obj.close();
                callable.close();
                return null;
            }
            PersistentServer observer = null;
            if (obj.getLong(2) != 0)
                observer = (PersistentServer)PersistentProxi.createProxi(obj.getLong(2), obj.getLong(3));
            PersistentProductGroup observee = null;
            if (obj.getLong(4) != 0)
                observee = (PersistentProductGroup)PersistentProxi.createProxi(obj.getLong(4), obj.getLong(5));
            PersistentServerRootProductGroup This = null;
            if (obj.getLong(6) != 0)
                This = (PersistentServerRootProductGroup)PersistentProxi.createProxi(obj.getLong(6), obj.getLong(7));
            ServerRootProductGroup result = new ServerRootProductGroup(observer,
                                                                       observee,
                                                                       This,
                                                                       ServerRootProductGroupId);
            obj.close();
            callable.close();
            ServerRootProductGroupICProxi inCache = (ServerRootProductGroupICProxi)Cache.getTheCache().put(result);
            ServerRootProductGroup objectInCache = (ServerRootProductGroup)inCache.getTheObject();
            return objectInCache;
        }catch(SQLException se) {
            throw new PersistenceException(se.getMessage(), se.getErrorCode());
        }
    }
    public long getClass(long objectId) throws PersistenceException{
        try{
            CallableStatement callable;
            callable = this.con.prepareCall("Begin ? := " + this.schemaName + ".SrvrRtPrdctGrpFacade.getClass(?); end;");
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
    public void observerSet(long ServerRootProductGroupId, PersistentServer observerVal) throws PersistenceException {
        try{
            CallableStatement callable;
            callable = this.con.prepareCall("Begin " + this.schemaName + ".SrvrRtPrdctGrpFacade.mstrSet(?, ?, ?); end;");
            callable.setLong(1, ServerRootProductGroupId);
            callable.setLong(2, observerVal.getId());
            callable.setLong(3, observerVal.getClassId());
            callable.execute();
            callable.close();
        }catch(SQLException se) {
            throw new PersistenceException(se.getMessage(), se.getErrorCode());
        }
    }
    public void observeeSet(long ServerRootProductGroupId, PersistentProductGroup observeeVal) throws PersistenceException {
        try{
            CallableStatement callable;
            callable = this.con.prepareCall("Begin " + this.schemaName + ".SrvrRtPrdctGrpFacade.obsSet(?, ?, ?); end;");
            callable.setLong(1, ServerRootProductGroupId);
            callable.setLong(2, observeeVal.getId());
            callable.setLong(3, observeeVal.getClassId());
            callable.execute();
            callable.close();
        }catch(SQLException se) {
            throw new PersistenceException(se.getMessage(), se.getErrorCode());
        }
    }
    public void ThisSet(long ServerRootProductGroupId, PersistentServerRootProductGroup ThisVal) throws PersistenceException {
        try{
            CallableStatement callable;
            callable = this.con.prepareCall("Begin " + this.schemaName + ".SrvrRtPrdctGrpFacade.ThisSet(?, ?, ?); end;");
            callable.setLong(1, ServerRootProductGroupId);
            callable.setLong(2, ThisVal.getId());
            callable.setLong(3, ThisVal.getClassId());
            callable.execute();
            callable.close();
        }catch(SQLException se) {
            throw new PersistenceException(se.getMessage(), se.getErrorCode());
        }
    }

}

