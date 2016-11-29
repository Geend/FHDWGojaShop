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
    public ProductGroupFacade theProductGroupFacade;
    public CustomerServiceFacade theCustomerServiceFacade;
    public RemainingStockFacade theRemainingStockFacade;
    public OrderQuantifiedArticleFacade theOrderQuantifiedArticleFacade;
    public ServerFacade theServerFacade;
    public ErrorDisplayFacade theErrorDisplayFacade;
    public ReduceStockCommandFacade theReduceStockCommandFacade;
    public NotInSaleFacade theNotInSaleFacade;
    public FinishedOrderFacade theFinishedOrderFacade;
    public CustomerRegisterServiceFacade theCustomerRegisterServiceFacade;
    public SubProductGroupFacade theSubProductGroupFacade;
    public NewPreOrderCommandFacade theNewPreOrderCommandFacade;
    public RegisterCommandFacade theRegisterCommandFacade;
    public CommandCoordinatorFacade theCommandCoordinatorFacade;
    public ActiveOrderFacade theActiveOrderFacade;
    public StopSellingCommandFacade theStopSellingCommandFacade;
    public MoveToCommandFacade theMoveToCommandFacade;
    public AddArticleCommandFacade theAddArticleCommandFacade;
    public CustomerDeliveryTimeManagerFacade theCustomerDeliveryTimeManagerFacade;
    public SettingsFacade theSettingsFacade;
    public DepositCommandFacade theDepositCommandFacade;
    public OrderFacade theOrderFacade;
    public RootProductGroupFacade theRootProductGroupFacade;
    public IncreaseStockCommandFacade theIncreaseStockCommandFacade;
    public CreateProducerCommandFacade theCreateProducerCommandFacade;
    public StartSellingCommandFacade theStartSellingCommandFacade;
    public RemoveArticleCommandFacade theRemoveArticleCommandFacade;
    public NewArticleCommandFacade theNewArticleCommandFacade;
    public CustomerAccountFacade theCustomerAccountFacade;
    public ProducerFacade theProducerFacade;
    public OrderStateFacade theOrderStateFacade;
    public CommonDateFacade theCommonDateFacade;
    public OrderManagerFacade theOrderManagerFacade;
    public ArticleWrapperFacade theArticleWrapperFacade;
    public CreateCustomerDeliveryTimeCommandFacade theCreateCustomerDeliveryTimeCommandFacade;
    public ArticleFacade theArticleFacade;
    public PreOrderFacade thePreOrderFacade;
    public ProductGroupComponentsFacade theProductGroupComponentsFacade;
    public CustomerDeliveryTimeFacade theCustomerDeliveryTimeFacade;
    public OwnerServiceFacade theOwnerServiceFacade;
    public QuantifiedArticleFacade theQuantifiedArticleFacade;
    public WithdrawCommandFacade theWithdrawCommandFacade;
    public ChangeArticleNameCommandFacade theChangeArticleNameCommandFacade;
    public CustomerArticleLstFacade theCustomerArticleLstFacade;
    public ShoppingCartQuantifiedArticleFacade theShoppingCartQuantifiedArticleFacade;
    public NewCreatedFacade theNewCreatedFacade;
    public ComponentFacade theComponentFacade;
    public CustomerServiceRootProductGroupFacade theCustomerServiceRootProductGroupFacade;
    public NewSubProductGroupCommandFacade theNewSubProductGroupCommandFacade;
    public ChangePriceCommandFacade theChangePriceCommandFacade;
    public ServiceFacade theServiceFacade;
    public InSaleFacade theInSaleFacade;
    public SubjFacade theSubjFacade;
    public ShoppingCartFacade theShoppingCartFacade;
    public ChangeArticleQuantityCommandFacade theChangeArticleQuantityCommandFacade;
    public ArticleStateFacade theArticleStateFacade;
    public CustomerOrderManagerFacade theCustomerOrderManagerFacade;
    public NewOrderCommandFacade theNewOrderCommandFacade;
    public CommandExecuterFacade theCommandExecuterFacade;

	protected ConnectionHandler() throws PersistenceException {
	}
	public void connect(String databaseName, String currentSchemaName, String user, char[] pw, boolean autoCommit) throws PersistenceException {
            this.theProducerLstFacade= new ProducerLstFacade();
            this.theProductGroupFacade= new ProductGroupFacade();
            this.theCustomerServiceFacade= new CustomerServiceFacade();
            this.theRemainingStockFacade= new RemainingStockFacade();
            this.theOrderQuantifiedArticleFacade= new OrderQuantifiedArticleFacade();
            this.theServerFacade= new ServerFacade();
            this.theErrorDisplayFacade= new ErrorDisplayFacade();
            this.theReduceStockCommandFacade= new ReduceStockCommandFacade();
            this.theNotInSaleFacade= new NotInSaleFacade();
            this.theFinishedOrderFacade= new FinishedOrderFacade();
            this.theCustomerRegisterServiceFacade= new CustomerRegisterServiceFacade();
            this.theSubProductGroupFacade= new SubProductGroupFacade();
            this.theNewPreOrderCommandFacade= new NewPreOrderCommandFacade();
            this.theRegisterCommandFacade= new RegisterCommandFacade();
            this.theCommandCoordinatorFacade= new CommandCoordinatorFacade();
            this.theActiveOrderFacade= new ActiveOrderFacade();
            this.theStopSellingCommandFacade= new StopSellingCommandFacade();
            this.theMoveToCommandFacade= new MoveToCommandFacade();
            this.theAddArticleCommandFacade= new AddArticleCommandFacade();
            this.theCustomerDeliveryTimeManagerFacade= new CustomerDeliveryTimeManagerFacade();
            this.theSettingsFacade= new SettingsFacade();
            this.theDepositCommandFacade= new DepositCommandFacade();
            this.theOrderFacade= new OrderFacade();
            this.theRootProductGroupFacade= new RootProductGroupFacade();
            this.theIncreaseStockCommandFacade= new IncreaseStockCommandFacade();
            this.theCreateProducerCommandFacade= new CreateProducerCommandFacade();
            this.theStartSellingCommandFacade= new StartSellingCommandFacade();
            this.theRemoveArticleCommandFacade= new RemoveArticleCommandFacade();
            this.theNewArticleCommandFacade= new NewArticleCommandFacade();
            this.theCustomerAccountFacade= new CustomerAccountFacade();
            this.theProducerFacade= new ProducerFacade();
            this.theOrderStateFacade= new OrderStateFacade();
            this.theCommonDateFacade= new CommonDateFacade();
            this.theOrderManagerFacade= new OrderManagerFacade();
            this.theArticleWrapperFacade= new ArticleWrapperFacade();
            this.theCreateCustomerDeliveryTimeCommandFacade= new CreateCustomerDeliveryTimeCommandFacade();
            this.theArticleFacade= new ArticleFacade();
            this.thePreOrderFacade= new PreOrderFacade();
            this.theProductGroupComponentsFacade= new ProductGroupComponentsFacade();
            this.theCustomerDeliveryTimeFacade= new CustomerDeliveryTimeFacade();
            this.theOwnerServiceFacade= new OwnerServiceFacade();
            this.theQuantifiedArticleFacade= new QuantifiedArticleFacade();
            this.theWithdrawCommandFacade= new WithdrawCommandFacade();
            this.theChangeArticleNameCommandFacade= new ChangeArticleNameCommandFacade();
            this.theCustomerArticleLstFacade= new CustomerArticleLstFacade();
            this.theShoppingCartQuantifiedArticleFacade= new ShoppingCartQuantifiedArticleFacade();
            this.theNewCreatedFacade= new NewCreatedFacade();
            this.theComponentFacade= new ComponentFacade();
            this.theCustomerServiceRootProductGroupFacade= new CustomerServiceRootProductGroupFacade();
            this.theNewSubProductGroupCommandFacade= new NewSubProductGroupCommandFacade();
            this.theChangePriceCommandFacade= new ChangePriceCommandFacade();
            this.theServiceFacade= new ServiceFacade();
            this.theInSaleFacade= new InSaleFacade();
            this.theSubjFacade= new SubjFacade();
            this.theShoppingCartFacade= new ShoppingCartFacade();
            this.theChangeArticleQuantityCommandFacade= new ChangeArticleQuantityCommandFacade();
            this.theArticleStateFacade= new ArticleStateFacade();
            this.theCustomerOrderManagerFacade= new CustomerOrderManagerFacade();
            this.theNewOrderCommandFacade= new NewOrderCommandFacade();
            this.theCommandExecuterFacade= new CommandExecuterFacade();
	}
	public static void initializeMapsForMappedFields() throws PersistenceException {
		
	}
	public void dltObjct(PersistentRoot object) throws PersistenceException{
		object.setDltd();
	}

}

