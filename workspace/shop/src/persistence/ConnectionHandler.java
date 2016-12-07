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
    public OrderQuantifiedArticleStateFacade theOrderQuantifiedArticleStateFacade;
    public CONCBackgroundTaskFacade theCONCBackgroundTaskFacade;
    public ProductGroupFacade theProductGroupFacade;
    public CustomerServiceFacade theCustomerServiceFacade;
    public RemainingStockFacade theRemainingStockFacade;
    public OrderQuantifiedArticleFacade theOrderQuantifiedArticleFacade;
    public ServerFacade theServerFacade;
    public ErrorDisplayFacade theErrorDisplayFacade;
    public ReOrderQuantifiedArticleFacade theReOrderQuantifiedArticleFacade;
    public ReduceStockCommandFacade theReduceStockCommandFacade;
    public NotInSaleFacade theNotInSaleFacade;
    public CustomerRegisterServiceFacade theCustomerRegisterServiceFacade;
    public SubProductGroupFacade theSubProductGroupFacade;
    public NewPreOrderCommandFacade theNewPreOrderCommandFacade;
    public RegisterCommandFacade theRegisterCommandFacade;
    public ProcessingOrderStateFacade theProcessingOrderStateFacade;
    public CommandCoordinatorFacade theCommandCoordinatorFacade;
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
    public OrderQuantifiedArticleNormalStateFacade theOrderQuantifiedArticleNormalStateFacade;
    public StartSellingCommandFacade theStartSellingCommandFacade;
    public RemoveArticleCommandFacade theRemoveArticleCommandFacade;
    public NewArticleCommandFacade theNewArticleCommandFacade;
    public CustomerAccountFacade theCustomerAccountFacade;
    public ReOrderCommandFacade theReOrderCommandFacade;
    public ReOrderManagerFacade theReOrderManagerFacade;
    public BackgroundTaskFacade theBackgroundTaskFacade;
    public InTransitOrderStateFacade theInTransitOrderStateFacade;
    public ProducerFacade theProducerFacade;
    public ArticleReturnFacade theArticleReturnFacade;
    public OrderQuantifiedArticleMarkedForReturnStateFacade theOrderQuantifiedArticleMarkedForReturnStateFacade;
    public OrderStateFacade theOrderStateFacade;
    public CommonDateFacade theCommonDateFacade;
    public OrderManagerFacade theOrderManagerFacade;
    public ArticleWrapperFacade theArticleWrapperFacade;
    public PreOrderStateFacade thePreOrderStateFacade;
    public ReturnManagerFacade theReturnManagerFacade;
    public CreateCustomerDeliveryTimeCommandFacade theCreateCustomerDeliveryTimeCommandFacade;
    public ArticleFacade theArticleFacade;
    public OwnerOrderManagerFacade theOwnerOrderManagerFacade;
    public ProductGroupComponentsFacade theProductGroupComponentsFacade;
    public CustomerDeliveryTimeFacade theCustomerDeliveryTimeFacade;
    public OwnerServiceFacade theOwnerServiceFacade;
    public QuantifiedArticleFacade theQuantifiedArticleFacade;
    public WithdrawCommandFacade theWithdrawCommandFacade;
    public ChangeArticleNameCommandFacade theChangeArticleNameCommandFacade;
    public FinishedOrderStateFacade theFinishedOrderStateFacade;
    public CustomerArticleLstFacade theCustomerArticleLstFacade;
    public ShoppingCartQuantifiedArticleFacade theShoppingCartQuantifiedArticleFacade;
    public NewCreatedFacade theNewCreatedFacade;
    public ComponentFacade theComponentFacade;
    public CustomerServiceRootProductGroupFacade theCustomerServiceRootProductGroupFacade;
    public DebitCommandFacade theDebitCommandFacade;
    public NewSubProductGroupCommandFacade theNewSubProductGroupCommandFacade;
    public BackgroundTaskManagerFacade theBackgroundTaskManagerFacade;
    public WaitingForAcceptOrderStateFacade theWaitingForAcceptOrderStateFacade;
    public ChangePriceCommandFacade theChangePriceCommandFacade;
    public AddArticleReturnCommandFacade theAddArticleReturnCommandFacade;
    public ServiceFacade theServiceFacade;
    public InSaleFacade theInSaleFacade;
    public ReturnQuantifiedArticleFacade theReturnQuantifiedArticleFacade;
    public SubjFacade theSubjFacade;
    public ReOrderForPreorderCommandFacade theReOrderForPreorderCommandFacade;
    public ShoppingCartFacade theShoppingCartFacade;
    public ArticlesInReturnOrderStateFacade theArticlesInReturnOrderStateFacade;
    public ChangeArticleQuantityCommandFacade theChangeArticleQuantityCommandFacade;
    public ArticleStateFacade theArticleStateFacade;
    public CustomerOrderManagerFacade theCustomerOrderManagerFacade;
    public NewOrderCommandFacade theNewOrderCommandFacade;
    public CommandExecuterFacade theCommandExecuterFacade;
    public AcceptOrderCommandFacade theAcceptOrderCommandFacade;

	protected ConnectionHandler() throws PersistenceException {
	}
	public void connect(String databaseName, String currentSchemaName, String user, char[] pw, boolean autoCommit) throws PersistenceException {
            this.theProducerLstFacade= new ProducerLstFacade();
            this.theOrderQuantifiedArticleStateFacade= new OrderQuantifiedArticleStateFacade();
            this.theCONCBackgroundTaskFacade= new CONCBackgroundTaskFacade();
            this.theProductGroupFacade= new ProductGroupFacade();
            this.theCustomerServiceFacade= new CustomerServiceFacade();
            this.theRemainingStockFacade= new RemainingStockFacade();
            this.theOrderQuantifiedArticleFacade= new OrderQuantifiedArticleFacade();
            this.theServerFacade= new ServerFacade();
            this.theErrorDisplayFacade= new ErrorDisplayFacade();
            this.theReOrderQuantifiedArticleFacade= new ReOrderQuantifiedArticleFacade();
            this.theReduceStockCommandFacade= new ReduceStockCommandFacade();
            this.theNotInSaleFacade= new NotInSaleFacade();
            this.theCustomerRegisterServiceFacade= new CustomerRegisterServiceFacade();
            this.theSubProductGroupFacade= new SubProductGroupFacade();
            this.theNewPreOrderCommandFacade= new NewPreOrderCommandFacade();
            this.theRegisterCommandFacade= new RegisterCommandFacade();
            this.theProcessingOrderStateFacade= new ProcessingOrderStateFacade();
            this.theCommandCoordinatorFacade= new CommandCoordinatorFacade();
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
            this.theOrderQuantifiedArticleNormalStateFacade= new OrderQuantifiedArticleNormalStateFacade();
            this.theStartSellingCommandFacade= new StartSellingCommandFacade();
            this.theRemoveArticleCommandFacade= new RemoveArticleCommandFacade();
            this.theNewArticleCommandFacade= new NewArticleCommandFacade();
            this.theCustomerAccountFacade= new CustomerAccountFacade();
            this.theReOrderCommandFacade= new ReOrderCommandFacade();
            this.theReOrderManagerFacade= new ReOrderManagerFacade();
            this.theBackgroundTaskFacade= new BackgroundTaskFacade();
            this.theInTransitOrderStateFacade= new InTransitOrderStateFacade();
            this.theProducerFacade= new ProducerFacade();
            this.theArticleReturnFacade= new ArticleReturnFacade();
            this.theOrderQuantifiedArticleMarkedForReturnStateFacade= new OrderQuantifiedArticleMarkedForReturnStateFacade();
            this.theOrderStateFacade= new OrderStateFacade();
            this.theCommonDateFacade= new CommonDateFacade();
            this.theOrderManagerFacade= new OrderManagerFacade();
            this.theArticleWrapperFacade= new ArticleWrapperFacade();
            this.thePreOrderStateFacade= new PreOrderStateFacade();
            this.theReturnManagerFacade= new ReturnManagerFacade();
            this.theCreateCustomerDeliveryTimeCommandFacade= new CreateCustomerDeliveryTimeCommandFacade();
            this.theArticleFacade= new ArticleFacade();
            this.theOwnerOrderManagerFacade= new OwnerOrderManagerFacade();
            this.theProductGroupComponentsFacade= new ProductGroupComponentsFacade();
            this.theCustomerDeliveryTimeFacade= new CustomerDeliveryTimeFacade();
            this.theOwnerServiceFacade= new OwnerServiceFacade();
            this.theQuantifiedArticleFacade= new QuantifiedArticleFacade();
            this.theWithdrawCommandFacade= new WithdrawCommandFacade();
            this.theChangeArticleNameCommandFacade= new ChangeArticleNameCommandFacade();
            this.theFinishedOrderStateFacade= new FinishedOrderStateFacade();
            this.theCustomerArticleLstFacade= new CustomerArticleLstFacade();
            this.theShoppingCartQuantifiedArticleFacade= new ShoppingCartQuantifiedArticleFacade();
            this.theNewCreatedFacade= new NewCreatedFacade();
            this.theComponentFacade= new ComponentFacade();
            this.theCustomerServiceRootProductGroupFacade= new CustomerServiceRootProductGroupFacade();
            this.theDebitCommandFacade= new DebitCommandFacade();
            this.theNewSubProductGroupCommandFacade= new NewSubProductGroupCommandFacade();
            this.theBackgroundTaskManagerFacade= new BackgroundTaskManagerFacade();
            this.theWaitingForAcceptOrderStateFacade= new WaitingForAcceptOrderStateFacade();
            this.theChangePriceCommandFacade= new ChangePriceCommandFacade();
            this.theAddArticleReturnCommandFacade= new AddArticleReturnCommandFacade();
            this.theServiceFacade= new ServiceFacade();
            this.theInSaleFacade= new InSaleFacade();
            this.theReturnQuantifiedArticleFacade= new ReturnQuantifiedArticleFacade();
            this.theSubjFacade= new SubjFacade();
            this.theReOrderForPreorderCommandFacade= new ReOrderForPreorderCommandFacade();
            this.theShoppingCartFacade= new ShoppingCartFacade();
            this.theArticlesInReturnOrderStateFacade= new ArticlesInReturnOrderStateFacade();
            this.theChangeArticleQuantityCommandFacade= new ChangeArticleQuantityCommandFacade();
            this.theArticleStateFacade= new ArticleStateFacade();
            this.theCustomerOrderManagerFacade= new CustomerOrderManagerFacade();
            this.theNewOrderCommandFacade= new NewOrderCommandFacade();
            this.theCommandExecuterFacade= new CommandExecuterFacade();
            this.theAcceptOrderCommandFacade= new AcceptOrderCommandFacade();
	}
	public static void initializeMapsForMappedFields() throws PersistenceException {
		
	}
	public void dltObjct(PersistentRoot object) throws PersistenceException{
		object.setDltd();
	}

}

