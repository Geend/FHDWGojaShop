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



    public ProducerLstFacade theProducerLstFacade;
    public OrderArticleWrapperFacade theOrderArticleWrapperFacade;
    public ProductGroupFacade theProductGroupFacade;
    public CustomerServiceFacade theCustomerServiceFacade;
    public RemainingStockFacade theRemainingStockFacade;
    public OrderQuantifiedArticleFacade theOrderQuantifiedArticleFacade;
    public ServerFacade theServerFacade;
    public ErrorDisplayFacade theErrorDisplayFacade;
    public ReduceStockCommandFacade theReduceStockCommandFacade;
    public NotInSaleFacade theNotInSaleFacade;
    public CustomerRegisterServiceFacade theCustomerRegisterServiceFacade;
    public SubProductGroupFacade theSubProductGroupFacade;
    public RegisterCommandFacade theRegisterCommandFacade;
    public CommandCoordinatorFacade theCommandCoordinatorFacade;
    public StopSellingCommandFacade theStopSellingCommandFacade;
    public MoveToCommandFacade theMoveToCommandFacade;
    public CustomerShopArticleWrapperFacade theCustomerShopArticleWrapperFacade;
    public ShopArticleWrapperFacade theShopArticleWrapperFacade;
    public OrderFacade theOrderFacade;
    public RootProductGroupFacade theRootProductGroupFacade;
    public IncreaseStockCommandFacade theIncreaseStockCommandFacade;
    public CreateProducerCommandFacade theCreateProducerCommandFacade;
    public StartSellingCommandFacade theStartSellingCommandFacade;
    public NewArticleCommandFacade theNewArticleCommandFacade;
    public CustomerAccountFacade theCustomerAccountFacade;
    public AbstractOrderFacade theAbstractOrderFacade;
    public ServiceRootProductGroupFacade theServiceRootProductGroupFacade;
    public ProducerFacade theProducerFacade;
    public OwnerArticleWrapperFacade theOwnerArticleWrapperFacade;
    public CommonDateFacade theCommonDateFacade;
    public ArticleWrapperFacade theArticleWrapperFacade;
    public ShoppingCartArticleWrapperFacade theShoppingCartArticleWrapperFacade;
    public DefaultProductGroupWrapperFacade theDefaultProductGroupWrapperFacade;
    public ArticleFacade theArticleFacade;
    public PreOrderFacade thePreOrderFacade;
    public ProductGroupComponentsFacade theProductGroupComponentsFacade;
    public CustomerDeliveryTimeFacade theCustomerDeliveryTimeFacade;
    public ProductGroupWrapperFacade theProductGroupWrapperFacade;
    public OwnerServiceFacade theOwnerServiceFacade;
    public QuantifiedArticleFacade theQuantifiedArticleFacade;
    public ShoppingCartQuantifiedArticleFacade theShoppingCartQuantifiedArticleFacade;
    public NewCreatedFacade theNewCreatedFacade;
    public ComponentFacade theComponentFacade;
    public StandardArticleWrapperFacade theStandardArticleWrapperFacade;
    public NewSubProductGroupCommandFacade theNewSubProductGroupCommandFacade;
    public ServiceFacade theServiceFacade;
    public InSaleFacade theInSaleFacade;
    public SubjFacade theSubjFacade;
    public ComponentWrapperFacade theComponentWrapperFacade;
    public ShoppingCartFacade theShoppingCartFacade;
    public ArticleStateFacade theArticleStateFacade;
    public CommandExecuterFacade theCommandExecuterFacade;

	protected ConnectionHandler() throws PersistenceException {
	}
	public void connect(String databaseName, String currentSchemaName, String user, char[] pw, boolean autoCommit) throws PersistenceException {
            this.theProducerLstFacade= new ProducerLstFacade();
            this.theOrderArticleWrapperFacade= new OrderArticleWrapperFacade();
            this.theProductGroupFacade= new ProductGroupFacade();
            this.theCustomerServiceFacade= new CustomerServiceFacade();
            this.theRemainingStockFacade= new RemainingStockFacade();
            this.theOrderQuantifiedArticleFacade= new OrderQuantifiedArticleFacade();
            this.theServerFacade= new ServerFacade();
            this.theErrorDisplayFacade= new ErrorDisplayFacade();
            this.theReduceStockCommandFacade= new ReduceStockCommandFacade();
            this.theNotInSaleFacade= new NotInSaleFacade();
            this.theCustomerRegisterServiceFacade= new CustomerRegisterServiceFacade();
            this.theSubProductGroupFacade= new SubProductGroupFacade();
            this.theRegisterCommandFacade= new RegisterCommandFacade();
            this.theCommandCoordinatorFacade= new CommandCoordinatorFacade();
            this.theStopSellingCommandFacade= new StopSellingCommandFacade();
            this.theMoveToCommandFacade= new MoveToCommandFacade();
            this.theCustomerShopArticleWrapperFacade= new CustomerShopArticleWrapperFacade();
            this.theShopArticleWrapperFacade= new ShopArticleWrapperFacade();
            this.theOrderFacade= new OrderFacade();
            this.theRootProductGroupFacade= new RootProductGroupFacade();
            this.theIncreaseStockCommandFacade= new IncreaseStockCommandFacade();
            this.theCreateProducerCommandFacade= new CreateProducerCommandFacade();
            this.theStartSellingCommandFacade= new StartSellingCommandFacade();
            this.theNewArticleCommandFacade= new NewArticleCommandFacade();
            this.theCustomerAccountFacade= new CustomerAccountFacade();
            this.theAbstractOrderFacade= new AbstractOrderFacade();
            this.theServiceRootProductGroupFacade= new ServiceRootProductGroupFacade();
            this.theProducerFacade= new ProducerFacade();
            this.theOwnerArticleWrapperFacade= new OwnerArticleWrapperFacade();
            this.theCommonDateFacade= new CommonDateFacade();
            this.theArticleWrapperFacade= new ArticleWrapperFacade();
            this.theShoppingCartArticleWrapperFacade= new ShoppingCartArticleWrapperFacade();
            this.theDefaultProductGroupWrapperFacade= new DefaultProductGroupWrapperFacade();
            this.theArticleFacade= new ArticleFacade();
            this.thePreOrderFacade= new PreOrderFacade();
            this.theProductGroupComponentsFacade= new ProductGroupComponentsFacade();
            this.theCustomerDeliveryTimeFacade= new CustomerDeliveryTimeFacade();
            this.theProductGroupWrapperFacade= new ProductGroupWrapperFacade();
            this.theOwnerServiceFacade= new OwnerServiceFacade();
            this.theQuantifiedArticleFacade= new QuantifiedArticleFacade();
            this.theShoppingCartQuantifiedArticleFacade= new ShoppingCartQuantifiedArticleFacade();
            this.theNewCreatedFacade= new NewCreatedFacade();
            this.theComponentFacade= new ComponentFacade();
            this.theStandardArticleWrapperFacade= new StandardArticleWrapperFacade();
            this.theNewSubProductGroupCommandFacade= new NewSubProductGroupCommandFacade();
            this.theServiceFacade= new ServiceFacade();
            this.theInSaleFacade= new InSaleFacade();
            this.theSubjFacade= new SubjFacade();
            this.theComponentWrapperFacade= new ComponentWrapperFacade();
            this.theShoppingCartFacade= new ShoppingCartFacade();
            this.theArticleStateFacade= new ArticleStateFacade();
            this.theCommandExecuterFacade= new CommandExecuterFacade();
	}
	public static void initializeMapsForMappedFields() throws PersistenceException {
		
	}
	public void dltObjct(PersistentRoot object) throws PersistenceException{
		object.setDltd();
	}

}

