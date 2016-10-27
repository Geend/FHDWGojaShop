package persistence;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.CallableStatement;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Vector;

public class ConnectionHandler {

	private static final String AutoCommitName = "AUTO COMMIT (DEFAULT)";
	
	private static Hashtable<Thread,CommitConnectionHandler> connections = new Hashtable<Thread,CommitConnectionHandler>();
	
	private static ConnectionHandler theConnectionHandler;

	public static String openFile(File file) throws IOException {
		int size = (int) file.length();
		int chars_read = 0;
		FileReader in = new FileReader(file);
		char[] data = new char[size];
		while (in.ready()) {
			chars_read += in.read(data, chars_read, size - chars_read);
		}
		in.close();
		String raw = new String(data, 0, chars_read);
		return raw;
	}

	public static Vector<ConnectionHandler> getConnections(){
		Vector<ConnectionHandler> result = new Vector<ConnectionHandler>();
		Iterator<CommitConnectionHandler> committers = connections.values().iterator();
		while (committers.hasNext())result.add(committers.next());
		result.add(theConnectionHandler);
		return result;
	}
	public static void reinitialise() {
		connections = new Hashtable<Thread,CommitConnectionHandler>();
		theConnectionHandler = null;
	}
	
	public static void disconnect() throws PersistenceException{
		Iterator<CommitConnectionHandler> connectionIterator = connections.values().iterator();
		try {
			while (connectionIterator.hasNext()){
				ConnectionHandler current = (ConnectionHandler)connectionIterator.next();
				if(!current.con.isClosed())current.con.close();
			}
			if (theConnectionHandler != null && theConnectionHandler.con != null && !theConnectionHandler.con.isClosed()){
				theConnectionHandler.con.close();
			}
		}catch (SQLException sqlExc) {
			throw new PersistenceException(sqlExc.getMessage(), sqlExc.getErrorCode());
		}
	}

	public static CommitConnectionHandler getNewConnection(Thread thread) throws PersistenceException {
		CommitConnectionHandler result = new CommitConnectionHandler(thread.getName());
		connections.put(thread, result);
		return result;
	}

	public static void releaseConnection() throws PersistenceException {
		try {
			CommitConnectionHandler connection = connections.get(Thread.currentThread());
			if (connection != null && !connection.con.isClosed()){
				connection.con.close();
				connections.remove(Thread.currentThread());
			}
		}catch (SQLException sqlExc) {
			throw new PersistenceException(sqlExc.getMessage(), sqlExc.getErrorCode());
		}
	}
	public static boolean isCommitConnectionHandler() {
		CommitConnectionHandler handler = connections.get(Thread.currentThread());
		return handler != null && handler.isInTransaction();
	}

	public static ConnectionHandler getTheConnectionHandler() throws PersistenceException {
		ConnectionHandler result;
		CommitConnectionHandler commitHandler = connections.get(Thread.currentThread());
		if (commitHandler == null){
			if (theConnectionHandler == null) theConnectionHandler = new ConnectionHandler(AutoCommitName);
			result = theConnectionHandler;
		}else{
			result = commitHandler;
		}
		return result;
	}
	
	public static String asString (char[] pw) {
		String result = "";
		for (int i = 0; i < pw.length; i++) {
			result = result + pw[i];
		}
		return result;
	}

	public static final String DatabaseProtocol = "jdbc:oracle:thin:@";

	private String schemaName;
	protected Connection con;
	private String name;

    public OrderArticleWrapperFacade theOrderArticleWrapperFacade;
    public CreateSubProductGroupCommandFacade theCreateSubProductGroupCommandFacade;
    public ProductGroupFacade theProductGroupFacade;
    public RemainingStockFacade theRemainingStockFacade;
    public OrderQuantifiedArticleFacade theOrderQuantifiedArticleFacade;
    public ServerFacade theServerFacade;
    public ErrorDisplayFacade theErrorDisplayFacade;
    public ArticleFacade theArticleFacade;
    public PreOrderFacade thePreOrderFacade;
    public NotInSaleFacade theNotInSaleFacade;
    public ServerRootProductGroupFacade theServerRootProductGroupFacade;
    public CreateArticleCommandFacade theCreateArticleCommandFacade;
    public CustomerDeliveryTimeFacade theCustomerDeliveryTimeFacade;
    public CommandCoordinatorFacade theCommandCoordinatorFacade;
    public QuantifiedArticleFacade theQuantifiedArticleFacade;
    public ShoppingCartQuantifiedArticleFacade theShoppingCartQuantifiedArticleFacade;
    public NewCreatedFacade theNewCreatedFacade;
    public ComponentFacade theComponentFacade;
    public ShopArticleWrapperFacade theShopArticleWrapperFacade;
    public OrderFacade theOrderFacade;
    public CustomerAccountFacade theCustomerAccountFacade;
    public InSaleFacade theInSaleFacade;
    public SubjFacade theSubjFacade;
    public AbstractOrderFacade theAbstractOrderFacade;
    public ProducerFacade theProducerFacade;
    public ShoppingCartFacade theShoppingCartFacade;
    public ArticleStateFacade theArticleStateFacade;
    public CommonDateFacade theCommonDateFacade;
    public ArticleWrapperFacade theArticleWrapperFacade;
    public CommandExecuterFacade theCommandExecuterFacade;
    public ShoppingCartArticleWrapperFacade theShoppingCartArticleWrapperFacade;

	protected ConnectionHandler(String name) throws PersistenceException {
		this.name = name;
		try {
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		} catch (SQLException sqlExc) {
			throw new PersistenceException(sqlExc.getMessage(), sqlExc.getErrorCode());
		}
	}
	public String getName(){
		return this.name;
	}
	
	public void connect(String databaseName, String currentSchemaName, String user, char[] pw, boolean autoCommit) throws PersistenceException {
		try {
			this.schemaName = currentSchemaName;
			oracle.jdbc.driver.OracleConnection oracleConnection = (oracle.jdbc.driver.OracleConnection) DriverManager.getConnection(DatabaseProtocol + databaseName, user, asString(pw));
//			oracleConnection.setStatementCacheSize(1000);
//			oracleConnection.setImplicitCachingEnabled(true);
			this.con = new Connection(oracleConnection);
			this.con.setAutoCommit(autoCommit);
			CallableStatement callable = this.con.prepareCall("Begin " + this.schemaName + ".ClassFacade.initialize; end;");
			callable.execute();
			callable.close();
            this.theOrderArticleWrapperFacade= new OrderArticleWrapperFacade(this.schemaName, this.con);
            this.theCreateSubProductGroupCommandFacade= new CreateSubProductGroupCommandFacade(this.schemaName, this.con);
            this.theProductGroupFacade= new ProductGroupFacade(this.schemaName, this.con);
            this.theRemainingStockFacade= new RemainingStockFacade(this.schemaName, this.con);
            this.theOrderQuantifiedArticleFacade= new OrderQuantifiedArticleFacade(this.schemaName, this.con);
            this.theServerFacade= new ServerFacade(this.schemaName, this.con);
            this.theErrorDisplayFacade= new ErrorDisplayFacade();
            this.theArticleFacade= new ArticleFacade(this.schemaName, this.con);
            this.thePreOrderFacade= new PreOrderFacade(this.schemaName, this.con);
            this.theNotInSaleFacade= new NotInSaleFacade(this.schemaName, this.con);
            this.theServerRootProductGroupFacade= new ServerRootProductGroupFacade(this.schemaName, this.con);
            this.theCreateArticleCommandFacade= new CreateArticleCommandFacade(this.schemaName, this.con);
            this.theCustomerDeliveryTimeFacade= new CustomerDeliveryTimeFacade(this.schemaName, this.con);
            this.theCommandCoordinatorFacade= new CommandCoordinatorFacade(this.schemaName, this.con);
            this.theQuantifiedArticleFacade= new QuantifiedArticleFacade(this.schemaName, this.con);
            this.theShoppingCartQuantifiedArticleFacade= new ShoppingCartQuantifiedArticleFacade(this.schemaName, this.con);
            this.theNewCreatedFacade= new NewCreatedFacade(this.schemaName, this.con);
            this.theComponentFacade= new ComponentFacade(this.schemaName, this.con);
            this.theShopArticleWrapperFacade= new ShopArticleWrapperFacade(this.schemaName, this.con);
            this.theOrderFacade= new OrderFacade(this.schemaName, this.con);
            this.theCustomerAccountFacade= new CustomerAccountFacade(this.schemaName, this.con);
            this.theInSaleFacade= new InSaleFacade(this.schemaName, this.con);
            this.theSubjFacade= new SubjFacade(this.schemaName, this.con);
            this.theAbstractOrderFacade= new AbstractOrderFacade(this.schemaName, this.con);
            this.theProducerFacade= new ProducerFacade(this.schemaName, this.con);
            this.theShoppingCartFacade= new ShoppingCartFacade(this.schemaName, this.con);
            this.theArticleStateFacade= new ArticleStateFacade(this.schemaName, this.con);
            this.theCommonDateFacade= new CommonDateFacade(this.schemaName, this.con);
            this.theArticleWrapperFacade= new ArticleWrapperFacade(this.schemaName, this.con);
            this.theCommandExecuterFacade= new CommandExecuterFacade(this.schemaName, this.con);
            this.theShoppingCartArticleWrapperFacade= new ShoppingCartArticleWrapperFacade(this.schemaName, this.con);
		} catch (SQLException sqlExc) {
			throw new PersistenceException(sqlExc.getMessage(), sqlExc.getErrorCode());
		}
	}
	public static void initializeMapsForMappedFields() throws PersistenceException {
		
	}
	
	public void dltObjct(PersistentRoot object) throws PersistenceException{
		Connection con = this.getConnection();
		CallableStatement callable;
		try {
			callable = con.prepareCall("Begin " + this.schemaName + ".ClassFacade.deleteObject(?,?); end;");
            callable.setLong(1, object.getId());
            callable.setLong(2, object.getClassId());
			callable.execute();
			callable.close();
		} catch (SQLException se) {
	           throw new PersistenceException(se.getMessage(), se.getErrorCode());
	    }
	}

	
	public Connection getConnection(){
		return this.con;
	}
	
}
