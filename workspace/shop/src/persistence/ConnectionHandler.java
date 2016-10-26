package persistence;

import java.util.Hashtable;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ConnectionHandler {

	private static Hashtable<Thread,CommitConnectionHandler> connections = new Hashtable<Thread,CommitConnectionHandler>();

	private static ConnectionHandler theConnectionHandler;

	public static void disconnect() throws PersistenceException {
	}
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

	public static CommitConnectionHandler getNewConnection(Thread thread) throws PersistenceException {
		CommitConnectionHandler result = new CommitConnectionHandler();
		connections.put(thread, result);
		return result;
	}

	public static void releaseConnection() throws PersistenceException {
		connections.remove(Thread.currentThread());
	}

	protected static ConnectionHandler getDefaultConnectionHandler() throws PersistenceException{
		if (theConnectionHandler == null) theConnectionHandler = new ConnectionHandler();
		return theConnectionHandler;
	}
	
	public static ConnectionHandler getTheConnectionHandler() throws PersistenceException {
		ConnectionHandler result;
		CommitConnectionHandler commitHandler = connections.get(Thread.currentThread());
		if (commitHandler == null){
			if (theConnectionHandler == null) theConnectionHandler = new ConnectionHandler();
			result = theConnectionHandler;
		}else{
			result = commitHandler;
		}
		return result;
	}

	public static boolean isCommitConnectionHandler() {
		CommitConnectionHandler handler = connections.get(Thread.currentThread());
		return handler != null && handler.isInTransaction();
	}



    public OrderArticleWrapperFacade theOrderArticleWrapperFacade;
    public ProductGroupFacade theProductGroupFacade;
    public RemainingStockFacade theRemainingStockFacade;
    public OrderQuantifiedArticleFacade theOrderQuantifiedArticleFacade;
    public ServerFacade theServerFacade;
    public ErrorDisplayFacade theErrorDisplayFacade;
    public ArticleFacade theArticleFacade;
    public PreOrderFacade thePreOrderFacade;
    public NotInSaleFacade theNotInSaleFacade;
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
    public AbstractOrderFacade theAbstractOrderFacade;
    public ProducerFacade theProducerFacade;
    public ShoppingCartFacade theShoppingCartFacade;
    public ArticleStateFacade theArticleStateFacade;
    public CommonDateFacade theCommonDateFacade;
    public ArticleWrapperFacade theArticleWrapperFacade;
    public CommandExecuterFacade theCommandExecuterFacade;
    public ShoppingCartArticleWrapperFacade theShoppingCartArticleWrapperFacade;

	protected ConnectionHandler() throws PersistenceException {
	}
	public void connect(String databaseName, String currentSchemaName, String user, char[] pw, boolean autoCommit) throws PersistenceException {
            this.theOrderArticleWrapperFacade= new OrderArticleWrapperFacade();
            this.theProductGroupFacade= new ProductGroupFacade();
            this.theRemainingStockFacade= new RemainingStockFacade();
            this.theOrderQuantifiedArticleFacade= new OrderQuantifiedArticleFacade();
            this.theServerFacade= new ServerFacade();
            this.theErrorDisplayFacade= new ErrorDisplayFacade();
            this.theArticleFacade= new ArticleFacade();
            this.thePreOrderFacade= new PreOrderFacade();
            this.theNotInSaleFacade= new NotInSaleFacade();
            this.theCustomerDeliveryTimeFacade= new CustomerDeliveryTimeFacade();
            this.theCommandCoordinatorFacade= new CommandCoordinatorFacade();
            this.theQuantifiedArticleFacade= new QuantifiedArticleFacade();
            this.theShoppingCartQuantifiedArticleFacade= new ShoppingCartQuantifiedArticleFacade();
            this.theNewCreatedFacade= new NewCreatedFacade();
            this.theComponentFacade= new ComponentFacade();
            this.theShopArticleWrapperFacade= new ShopArticleWrapperFacade();
            this.theOrderFacade= new OrderFacade();
            this.theCustomerAccountFacade= new CustomerAccountFacade();
            this.theInSaleFacade= new InSaleFacade();
            this.theAbstractOrderFacade= new AbstractOrderFacade();
            this.theProducerFacade= new ProducerFacade();
            this.theShoppingCartFacade= new ShoppingCartFacade();
            this.theArticleStateFacade= new ArticleStateFacade();
            this.theCommonDateFacade= new CommonDateFacade();
            this.theArticleWrapperFacade= new ArticleWrapperFacade();
            this.theCommandExecuterFacade= new CommandExecuterFacade();
            this.theShoppingCartArticleWrapperFacade= new ShoppingCartArticleWrapperFacade();
	}
	public static void initializeMapsForMappedFields() throws PersistenceException {
		
	}
	public void dltObjct(PersistentRoot object) throws PersistenceException{
		object.setDltd();
	}

}

