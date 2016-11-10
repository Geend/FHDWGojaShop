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
    public RemainingStockFacade theRemainingStockFacade;
    public ServerFacade theServerFacade;
    public CreateProductGroupCommandFacade theCreateProductGroupCommandFacade;
    public CreateProducerCommandFacade theCreateProducerCommandFacade;
    public ErrorDisplayFacade theErrorDisplayFacade;
    public ArticleFacade theArticleFacade;
    public NotInSaleFacade theNotInSaleFacade;
    public AddSubProductGroupCommandFacade theAddSubProductGroupCommandFacade;
    public InSaleFacade theInSaleFacade;
    public CommandCoordinatorFacade theCommandCoordinatorFacade;
    public ProducerFacade theProducerFacade;
    public AddArticleCommandFacade theAddArticleCommandFacade;
    public ArticleStateFacade theArticleStateFacade;
    public ComponentLstFacade theComponentLstFacade;
    public NewCreatedFacade theNewCreatedFacade;
    public ComponentFacade theComponentFacade;
    public CommonDateFacade theCommonDateFacade;
    public CommandExecuterFacade theCommandExecuterFacade;

	protected ConnectionHandler() throws PersistenceException {
	}
	public void connect(String databaseName, String currentSchemaName, String user, char[] pw, boolean autoCommit) throws PersistenceException {
            this.theProducerLstFacade= new ProducerLstFacade();
            this.theProductGroupFacade= new ProductGroupFacade();
            this.theRemainingStockFacade= new RemainingStockFacade();
            this.theServerFacade= new ServerFacade();
            this.theCreateProductGroupCommandFacade= new CreateProductGroupCommandFacade();
            this.theCreateProducerCommandFacade= new CreateProducerCommandFacade();
            this.theErrorDisplayFacade= new ErrorDisplayFacade();
            this.theArticleFacade= new ArticleFacade();
            this.theNotInSaleFacade= new NotInSaleFacade();
            this.theAddSubProductGroupCommandFacade= new AddSubProductGroupCommandFacade();
            this.theInSaleFacade= new InSaleFacade();
            this.theCommandCoordinatorFacade= new CommandCoordinatorFacade();
            this.theProducerFacade= new ProducerFacade();
            this.theAddArticleCommandFacade= new AddArticleCommandFacade();
            this.theArticleStateFacade= new ArticleStateFacade();
            this.theComponentLstFacade= new ComponentLstFacade();
            this.theNewCreatedFacade= new NewCreatedFacade();
            this.theComponentFacade= new ComponentFacade();
            this.theCommonDateFacade= new CommonDateFacade();
            this.theCommandExecuterFacade= new CommandExecuterFacade();
	}
	public static void initializeMapsForMappedFields() throws PersistenceException {
		
	}
	public void dltObjct(PersistentRoot object) throws PersistenceException{
		object.setDltd();
	}

}

