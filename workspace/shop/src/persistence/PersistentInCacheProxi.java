package persistence;

import java.util.HashMap;

abstract class ICProxiFactory {
	  abstract PersistentInCacheProxi create(long objectId);
}

public abstract class PersistentInCacheProxi extends PersistentRoot {

	  private static ICProxiFactory [] iCProxiFactories;
		
	  private static ICProxiFactory [] getTheICProxiFactories(){
		if (iCProxiFactories == null){
			iCProxiFactories = new ICProxiFactory[270];
        iCProxiFactories[109] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new ProducerLstICProxi(objectId);
            }
        };
        iCProxiFactories[266] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new CONCBackgroundTaskICProxi(objectId);
            }
        };
        iCProxiFactories[177] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new CustomerServiceICProxi(objectId);
            }
        };
        iCProxiFactories[92] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new RemainingStockICProxi(objectId);
            }
        };
        iCProxiFactories[131] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new OrderQuantifiedArticleICProxi(objectId);
            }
        };
        iCProxiFactories[1] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new ServerICProxi(objectId);
            }
        };
        iCProxiFactories[2] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new ErrorDisplayICProxi(objectId);
            }
        };
        iCProxiFactories[225] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new ReOrderQuantifiedArticleICProxi(objectId);
            }
        };
        iCProxiFactories[185] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new ReduceStockCommandICProxi(objectId);
            }
        };
        iCProxiFactories[94] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new NotInSaleICProxi(objectId);
            }
        };
        iCProxiFactories[124] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new CustomerRegisterServiceICProxi(objectId);
            }
        };
        iCProxiFactories[113] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new SubProductGroupICProxi(objectId);
            }
        };
        iCProxiFactories[215] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new NewPreOrderCommandICProxi(objectId);
            }
        };
        iCProxiFactories[166] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new RegisterCommandICProxi(objectId);
            }
        };
        iCProxiFactories[234] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new ProcessingOrderStateICProxi(objectId);
            }
        };
        iCProxiFactories[0] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new CommandCoordinatorICProxi(objectId);
            }
        };
        iCProxiFactories[186] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new StopSellingCommandICProxi(objectId);
            }
        };
        iCProxiFactories[168] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new MoveToCommandICProxi(objectId);
            }
        };
        iCProxiFactories[191] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new AddArticleCommandICProxi(objectId);
            }
        };
        iCProxiFactories[195] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new CustomerDeliveryTimeManagerICProxi(objectId);
            }
        };
        iCProxiFactories[217] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new SettingsICProxi(objectId);
            }
        };
        iCProxiFactories[199] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new DepositCommandICProxi(objectId);
            }
        };
        iCProxiFactories[137] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new OrderICProxi(objectId);
            }
        };
        iCProxiFactories[112] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new RootProductGroupICProxi(objectId);
            }
        };
        iCProxiFactories[187] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new IncreaseStockCommandICProxi(objectId);
            }
        };
        iCProxiFactories[108] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new CreateProducerCommandICProxi(objectId);
            }
        };
        iCProxiFactories[255] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new OrderQuantifiedArticleNormalStateICProxi(objectId);
            }
        };
        iCProxiFactories[188] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new StartSellingCommandICProxi(objectId);
            }
        };
        iCProxiFactories[192] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new RemoveArticleCommandICProxi(objectId);
            }
        };
        iCProxiFactories[171] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new NewArticleCommandICProxi(objectId);
            }
        };
        iCProxiFactories[138] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new CustomerAccountICProxi(objectId);
            }
        };
        iCProxiFactories[229] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new ReOrderCommandICProxi(objectId);
            }
        };
        iCProxiFactories[226] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new ReOrderManagerICProxi(objectId);
            }
        };
        iCProxiFactories[235] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new InTransitOrderStateICProxi(objectId);
            }
        };
        iCProxiFactories[97] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new ProducerICProxi(objectId);
            }
        };
        iCProxiFactories[248] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new ArticleReturnICProxi(objectId);
            }
        };
        iCProxiFactories[254] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new OrderQuantifiedArticleMarkedForReturnStateICProxi(objectId);
            }
        };
        iCProxiFactories[3] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new CommonDateICProxi(objectId);
            }
        };
        iCProxiFactories[141] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new ArticleWrapperICProxi(objectId);
            }
        };
        iCProxiFactories[236] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new PreOrderStateICProxi(objectId);
            }
        };
        iCProxiFactories[250] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new ReturnManagerICProxi(objectId);
            }
        };
        iCProxiFactories[194] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new CreateCustomerDeliveryTimeCommandICProxi(objectId);
            }
        };
        iCProxiFactories[93] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new ArticleICProxi(objectId);
            }
        };
        iCProxiFactories[242] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new OwnerOrderManagerICProxi(objectId);
            }
        };
        iCProxiFactories[219] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new ProductGroupComponentsICProxi(objectId);
            }
        };
        iCProxiFactories[133] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new CustomerDeliveryTimeICProxi(objectId);
            }
        };
        iCProxiFactories[175] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new OwnerServiceICProxi(objectId);
            }
        };
        iCProxiFactories[200] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new WithdrawCommandICProxi(objectId);
            }
        };
        iCProxiFactories[189] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new ChangeArticleNameCommandICProxi(objectId);
            }
        };
        iCProxiFactories[237] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new FinishedOrderStateICProxi(objectId);
            }
        };
        iCProxiFactories[223] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new CustomerArticleLstICProxi(objectId);
            }
        };
        iCProxiFactories[135] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new ShoppingCartQuantifiedArticleICProxi(objectId);
            }
        };
        iCProxiFactories[99] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new NewCreatedICProxi(objectId);
            }
        };
        iCProxiFactories[221] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new CustomerServiceRootProductGroupICProxi(objectId);
            }
        };
        iCProxiFactories[233] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new DebitCommandICProxi(objectId);
            }
        };
        iCProxiFactories[91] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new NewSubProductGroupCommandICProxi(objectId);
            }
        };
        iCProxiFactories[262] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new BackgroundTaskManagerICProxi(objectId);
            }
        };
        iCProxiFactories[231] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new WaitingForAcceptOrderStateICProxi(objectId);
            }
        };
        iCProxiFactories[190] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new ChangePriceCommandICProxi(objectId);
            }
        };
        iCProxiFactories[251] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new AddArticleReturnCommandICProxi(objectId);
            }
        };
        iCProxiFactories[95] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new InSaleICProxi(objectId);
            }
        };
        iCProxiFactories[245] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new ReturnQuantifiedArticleICProxi(objectId);
            }
        };
        iCProxiFactories[157] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new SubjICProxi(objectId);
            }
        };
        iCProxiFactories[267] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new ReOrderForPreorderCommandICProxi(objectId);
            }
        };
        iCProxiFactories[140] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new ShoppingCartICProxi(objectId);
            }
        };
        iCProxiFactories[260] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new ArticlesInReturnOrderStateICProxi(objectId);
            }
        };
        iCProxiFactories[193] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new ChangeArticleQuantityCommandICProxi(objectId);
            }
        };
        iCProxiFactories[207] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new CustomerOrderManagerICProxi(objectId);
            }
        };
        iCProxiFactories[216] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new NewOrderCommandICProxi(objectId);
            }
        };
        iCProxiFactories[4] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new CommandExecuterICProxi(objectId);
            }
        };
        iCProxiFactories[259] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new AcceptOrderCommandICProxi(objectId);
            }
        };
		}
		return iCProxiFactories;
	  }

	public static PersistentInCacheProxi createInCacheProxi(long objectId, long classId) throws PersistenceException {
	    int index = (int) classId;
		if (index < 0) index = index * -1;
	    index = index - 101;
	    if (index > getTheICProxiFactories().length) throw new PersistenceException("Unknown class :" + Long.toString(classId),0);
	    ICProxiFactory factory = getTheICProxiFactories()[index];
	    if (factory == null)  throw new PersistenceException("Unknown class :" + Long.toString(classId),0);
	    PersistentInCacheProxi result =  factory.create(objectId);
	    return result;
	}

	protected PersistentObject object;
  	public int userCount;
	
	protected PersistentInCacheProxi(long id) {
		super(id);
		this.userCount = 0;
	}

	public PersistentInCacheProxi(PersistentObject object) {
		this(object.getId());
	}
	
	public boolean isDelayed$Persistence() throws PersistenceException {
		return this.getTheObject().isDelayed$Persistence();
	}

	public void setDelayed$Persistence(boolean b) throws PersistenceException {
		this.getTheObject().setDelayed$Persistence(b);
	}
	public void store() throws PersistenceException{
		this.getTheObject().store();
	}

	public void setId(long id) {
		super.setId(id);
		try {
			this.getTheObject().setId(id);
		} catch (PersistenceException e) {
			throw new PersistenceError(e);
		}
	}
	public HashMap<String,Object> toHashtable(int depth, int essentialLevel, boolean forGUI, TDObserver tdObserver) throws PersistenceException {
		PersistentRoot object = this.getTheObject();
		if (object == null) return null;
		return object.toHashtable(depth, essentialLevel, forGUI, tdObserver);
	}
	public HashMap<String, Object> toHashtable(HashMap<String, Object> allResults, int depth, int essentialLevel, boolean forGUI, boolean leaf, TDObserver tdObserver) throws PersistenceException {
		PersistentRoot object = this.getTheObject();
		if (object == null) return null;
		return object.toHashtable(allResults, depth, essentialLevel, forGUI, leaf, tdObserver);
	}

	protected abstract PersistentObject getRemote() throws PersistenceException;

	public synchronized PersistentRoot getTheObject() throws PersistenceException {
		if (this.object == null) this.object = getRemote();
		return this.object;
	}		
	protected synchronized void setObject(PersistentObject object) throws PersistenceException {
		this.object = object;
	}
	protected synchronized void clear() throws PersistenceException {
		this.object = null;
	}
	public int getIconInfo() throws PersistenceException {
		return this.getTheObject().getIconInfo();
	}
	public int getLeafInfo() throws PersistenceException {
		return this.getTheObject().getLeafInfo();
	}
	public String toString() {
		try {
			return this.getTheObject().toString();
		} catch (PersistenceException pe) {
			throw new PersistenceError(pe);
		}
	}
	public String toString(boolean inner)throws PersistenceException{
		try {
			return this.getTheObject().toString(inner);
		} catch (PersistenceException pe) {
			throw new PersistenceError(pe);
		}		
	}

	public synchronized void incrementUserCount() {
		this.userCount++;
	}

	public static long recycleCounter = 0;
	public synchronized void decrementUserCount() {
		this.userCount--;
		if (this.isRemovable()){
			Cache.getTheCache().remove(this);
			PersistentInCacheProxi.recycleCounter ++;
		}
	}

	protected boolean isRemovable() {
		return this.userCount <= 0 ;
	}
	public synchronized void tryBreak() {
		try {
			if (!this.isDelayed$Persistence())this.object = null;
		} catch (PersistenceException e) {
			return;
		}
	}

	public boolean hasEssentialFields() throws PersistenceException{
		return this.getTheObject().hasEssentialFields();
	}
	public void delete$Me() throws PersistenceException {
		this.getTheObject().delete$Me();
	}
	public Anything getThis() throws PersistenceException {
		return this.getTheObject().getThis();
	}
	
    protected void setDltd() throws PersistenceException {
        this.getTheObject().setDltd();
    }
    public boolean isDltd() throws PersistenceException {
        return this.getTheObject().isDltd();
    }

}
