package test;

import model.DBConnectionConstants;
import persistence.ConnectionHandler;
import persistence.PersistenceException;

public class TestSupport {
	

	//Manual path start
	private static final String Password = "pg"; //TODO adjust password!
	//Manual path end

	
	private static java.sql.Connection connection;	
	
	private TestSupport(){}	
	
	public static void prepareSingletons(){
	}

	public static void prepareDatabase() throws PersistenceException{
		initializeConnectionHandler();
		resetDatabase();
	}
	public static void resetDatabase() throws PersistenceException{
		ConnectionHandler.disconnect();
		disconnect();
		initializeConnectionHandler();
	}
	public static void clearDatabase() throws PersistenceException{
		resetDatabase();
	}
	private static void disconnect() {
		if (connection != null) {
			connection = null;
		}		
	}
	private static void initializeConnectionHandler() throws PersistenceException{
		ConnectionHandler connection = ConnectionHandler.getTheConnectionHandler();
		connection.connect(DBConnectionConstants.DataBaseName,
			DBConnectionConstants.SchemaName,
			DBConnectionConstants.UserName,
			Password.toCharArray(),
			true);
		ConnectionHandler.initializeMapsForMappedFields();		
	}
}
