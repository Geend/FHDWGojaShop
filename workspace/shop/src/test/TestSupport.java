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
        model.ProducerLst.reset$For$Test = true;
        model.meta.CommandCoordinator.reset$For$Test = true;
        model.GlobalOrderArchive.reset$For$Test = true;
        model.CustomerDeliveryTimeManager.reset$For$Test = true;
        model.Settings.reset$For$Test = true;
        model.GlobalOrderManager.reset$For$Test = true;
        model.ReOrderManager.reset$For$Test = true;
        model.Shop.reset$For$Test = true;
        model.ReturnManager.reset$For$Test = true;
        model.ComponentManager.reset$For$Test = true;
        model.BackgroundTaskManager.reset$For$Test = true;

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
