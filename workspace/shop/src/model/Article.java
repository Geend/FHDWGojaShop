
package model;

import common.Fraction;
import persistence.*;
import model.visitor.*;

import java.text.MessageFormat;

/* Additional import section end */

public class Article extends model.Component implements PersistentArticle {

    public static Article4Public createArticle(String name, common.Fraction price, long minStock, long maxStock, long producerDeliveryTime, Producer4Public producer, ProductGroup4Public parent)
            throws PersistenceException {
        return createArticle(name, price, minStock, maxStock, producerDeliveryTime, producer, parent, false);
    }

    public static Article4Public createArticle(String name, common.Fraction price, long minStock, long maxStock, long producerDeliveryTime, Producer4Public producer, ProductGroup4Public parent,
            boolean delayed$Persistence) throws PersistenceException {
        PersistentArticle result = null;
        if (delayed$Persistence) {
            result = ConnectionHandler.getTheConnectionHandler().theArticleFacade.newDelayedArticle(name, price, minStock, maxStock, 0, producerDeliveryTime);
            result.setDelayed$Persistence(true);
        } else {
            result = ConnectionHandler.getTheConnectionHandler().theArticleFacade.newArticle(name, price, minStock, maxStock, 0, producerDeliveryTime, -1);
        }
        java.util.HashMap<String, Object> final$$Fields = new java.util.HashMap<String, Object>();
        final$$Fields.put("name", name);
        final$$Fields.put("price", price);
        final$$Fields.put("minStock", minStock);
        final$$Fields.put("maxStock", maxStock);
        final$$Fields.put("producerDeliveryTime", producerDeliveryTime);
        final$$Fields.put("producer", producer);
        final$$Fields.put("parent", parent);
        result.initialize(result, final$$Fields);
        result.initializeOnCreation();
        return result;
    }

    public static Article4Public createArticle(String name, common.Fraction price, long minStock, long maxStock, long producerDeliveryTime, Producer4Public producer, ProductGroup4Public parent,
            boolean delayed$Persistence, Article4Public This) throws PersistenceException {
        PersistentArticle result = null;
        if (delayed$Persistence) {
            result = ConnectionHandler.getTheConnectionHandler().theArticleFacade.newDelayedArticle(name, price, minStock, maxStock, 0, producerDeliveryTime);
            result.setDelayed$Persistence(true);
        } else {
            result = ConnectionHandler.getTheConnectionHandler().theArticleFacade.newArticle(name, price, minStock, maxStock, 0, producerDeliveryTime, -1);
        }
        java.util.HashMap<String, Object> final$$Fields = new java.util.HashMap<String, Object>();
        final$$Fields.put("name", name);
        final$$Fields.put("price", price);
        final$$Fields.put("minStock", minStock);
        final$$Fields.put("maxStock", maxStock);
        final$$Fields.put("producerDeliveryTime", producerDeliveryTime);
        final$$Fields.put("producer", producer);
        final$$Fields.put("parent", parent);
        result.initialize(This, final$$Fields);
        result.initializeOnCreation();
        return result;
    }

    public java.util.HashMap<String, Object> toHashtable(java.util.HashMap<String, Object> allResults, int depth, int essentialLevel, boolean forGUI, boolean leaf, TDObserver tdObserver)
            throws PersistenceException {
        java.util.HashMap<String, Object> result = null;
        if (depth > 0 && essentialLevel <= common.RPCConstantsAndServices.EssentialDepth) {
            result = super.toHashtable(allResults, depth, essentialLevel, forGUI, false, tdObserver);
            result.put("price", this.getPrice().toString());
            result.put("minStock", new Long(this.getMinStock()).toString());
            result.put("maxStock", new Long(this.getMaxStock()).toString());
            result.put("currentStock", new Long(this.getCurrentStock()).toString());
            result.put("producerDeliveryTime", new Long(this.getProducerDeliveryTime()).toString());
            AbstractPersistentRoot producer = (AbstractPersistentRoot) this.getProducer();
            if (producer != null) {
                result.put("producer", producer.createProxiInformation(false, essentialLevel <= 1));
                if (depth > 1) {
                    producer.toHashtable(allResults, depth - 1, essentialLevel, forGUI, true, tdObserver);
                } else {
                    if (forGUI && producer.hasEssentialFields())
                        producer.toHashtable(allResults, depth, essentialLevel + 1, false, true, tdObserver);
                }
            }
            result.put("producerName", this.getProducerName());
            AbstractPersistentRoot state = (AbstractPersistentRoot) this.getState();
            if (state != null) {
                result.put("state", state.createProxiInformation(false, essentialLevel <= 1));
                if (depth > 1) {
                    state.toHashtable(allResults, depth - 1, essentialLevel, forGUI, true, tdObserver);
                } else {
                    if (forGUI && state.hasEssentialFields())
                        state.toHashtable(allResults, depth, essentialLevel + 1, false, true, tdObserver);
                }
            }
            result.put("currentState", this.getCurrentState());
            AbstractPersistentRoot parent = (AbstractPersistentRoot) this.getParent();
            if (parent != null) {
                result.put("parent", parent.createProxiInformation(false, essentialLevel <= 1));
                if (depth > 1) {
                    parent.toHashtable(allResults, depth - 1, essentialLevel, forGUI, true, tdObserver);
                } else {
                    if (forGUI && parent.hasEssentialFields())
                        parent.toHashtable(allResults, depth, essentialLevel + 1, false, true, tdObserver);
                }
            }
            String uniqueKey = common.RPCConstantsAndServices.createHashtableKey(this.getClassId(), this.getId());
            if (leaf && !allResults.containsKey(uniqueKey))
                allResults.put(uniqueKey, result);
        }
        return result;
    }

    public Article provideCopy() throws PersistenceException {
        Article result = this;
        result = new Article(this.name, this.subService, this.This, this.price, this.minStock, this.maxStock, this.currentStock, this.producerDeliveryTime, this.producer, this.state, this.parent,
                this.getId());
        this.copyingPrivateUserAttributes(result);
        return result;
    }

    public boolean hasEssentialFields() throws PersistenceException {
        return false;
    }

    protected common.Fraction price;
    protected long minStock;
    protected long maxStock;
    protected long currentStock;
    protected long producerDeliveryTime;
    protected PersistentProducer producer;
    protected PersistentArticleState state;
    protected PersistentProductGroup parent;

    public Article(String name, SubjInterface subService, PersistentComponent This, common.Fraction price, long minStock, long maxStock, long currentStock, long producerDeliveryTime,
            PersistentProducer producer, PersistentArticleState state, PersistentProductGroup parent, long id) throws PersistenceException {
        /* Shall not be used by clients for object construction! Use static create operation instead! */
        super((String) name, (SubjInterface) subService, (PersistentComponent) This, id);
        this.price = price;
        this.minStock = minStock;
        this.maxStock = maxStock;
        this.currentStock = currentStock;
        this.producerDeliveryTime = producerDeliveryTime;
        this.producer = producer;
        this.state = state;
        this.parent = parent;
    }

    static public long getTypeId() {
        return 194;
    }

    public long getClassId() {
        return getTypeId();
    }

    public void store() throws PersistenceException {
        if (!this.isDelayed$Persistence())
            return;
        if (this.getClassId() == 194)
            ConnectionHandler.getTheConnectionHandler().theArticleFacade.newArticle(name, price, minStock, maxStock, currentStock, producerDeliveryTime, this.getId());
        super.store();
        if (this.getProducer() != null) {
            this.getProducer().store();
            ConnectionHandler.getTheConnectionHandler().theArticleFacade.producerSet(this.getId(), getProducer());
        }
        if (this.getState() != null) {
            this.getState().store();
            ConnectionHandler.getTheConnectionHandler().theArticleFacade.stateSet(this.getId(), getState());
        }
        if (this.getParent() != null) {
            this.getParent().store();
            ConnectionHandler.getTheConnectionHandler().theArticleFacade.parentSet(this.getId(), getParent());
        }

    }

    public common.Fraction getPrice() throws PersistenceException {
        return this.price;
    }

    public void setPrice(common.Fraction newValue) throws PersistenceException {
        if (!this.isDelayed$Persistence())
            ConnectionHandler.getTheConnectionHandler().theArticleFacade.priceSet(this.getId(), newValue);
        this.price = newValue;
    }

    public long getMinStock() throws PersistenceException {
        return this.minStock;
    }

    public void setMinStock(long newValue) throws PersistenceException {
        if (!this.isDelayed$Persistence())
            ConnectionHandler.getTheConnectionHandler().theArticleFacade.minStockSet(this.getId(), newValue);
        this.minStock = newValue;
    }

    public long getMaxStock() throws PersistenceException {
        return this.maxStock;
    }

    public void setMaxStock(long newValue) throws PersistenceException {
        if (!this.isDelayed$Persistence())
            ConnectionHandler.getTheConnectionHandler().theArticleFacade.maxStockSet(this.getId(), newValue);
        this.maxStock = newValue;
    }

    public long getCurrentStock() throws PersistenceException {
        return this.currentStock;
    }

    public void setCurrentStock(long newValue) throws PersistenceException {
        if (!this.isDelayed$Persistence())
            ConnectionHandler.getTheConnectionHandler().theArticleFacade.currentStockSet(this.getId(), newValue);
        this.currentStock = newValue;
    }

    public long getProducerDeliveryTime() throws PersistenceException {
        return this.producerDeliveryTime;
    }

    public void setProducerDeliveryTime(long newValue) throws PersistenceException {
        if (!this.isDelayed$Persistence())
            ConnectionHandler.getTheConnectionHandler().theArticleFacade.producerDeliveryTimeSet(this.getId(), newValue);
        this.producerDeliveryTime = newValue;
    }

    public Producer4Public getProducer() throws PersistenceException {
        return this.producer;
    }

    public void setProducer(Producer4Public newValue) throws PersistenceException {
        if (newValue == null)
            throw new PersistenceException("Null values not allowed!", 0);
        if (newValue.isTheSameAs(this.producer))
            return;
        long objectId = newValue.getId();
        long classId = newValue.getClassId();
        this.producer = (PersistentProducer) PersistentProxi.createProxi(objectId, classId);
        if (!this.isDelayed$Persistence()) {
            newValue.store();
            ConnectionHandler.getTheConnectionHandler().theArticleFacade.producerSet(this.getId(), newValue);
        }
    }

    public ArticleState4Public getState() throws PersistenceException {
        return this.state;
    }

    public void setState(ArticleState4Public newValue) throws PersistenceException {
        if (newValue == null)
            throw new PersistenceException("Null values not allowed!", 0);
        if (newValue.isTheSameAs(this.state))
            return;
        long objectId = newValue.getId();
        long classId = newValue.getClassId();
        this.state = (PersistentArticleState) PersistentProxi.createProxi(objectId, classId);
        if (!this.isDelayed$Persistence()) {
            newValue.store();
            ConnectionHandler.getTheConnectionHandler().theArticleFacade.stateSet(this.getId(), newValue);
        }
    }

    public ProductGroup4Public getParent() throws PersistenceException {
        return this.parent;
    }

    public void setParent(ProductGroup4Public newValue) throws PersistenceException {
        if (newValue == null)
            throw new PersistenceException("Null values not allowed!", 0);
        if (newValue.isTheSameAs(this.parent))
            return;
        long objectId = newValue.getId();
        long classId = newValue.getClassId();
        this.parent = (PersistentProductGroup) PersistentProxi.createProxi(objectId, classId);
        if (!this.isDelayed$Persistence()) {
            newValue.store();
            ConnectionHandler.getTheConnectionHandler().theArticleFacade.parentSet(this.getId(), newValue);
        }
    }

    public PersistentArticle getThis() throws PersistenceException {
        if (this.This == null) {
            PersistentArticle result = (PersistentArticle) PersistentProxi.createProxi(this.getId(), this.getClassId());
            result.getTheObject();
            return result;
        }
        return (PersistentArticle) this.This;
    }

    public void accept(ComponentVisitor visitor) throws PersistenceException {
        visitor.handleArticle(this);
    }

    public <R> R accept(ComponentReturnVisitor<R> visitor) throws PersistenceException {
        return visitor.handleArticle(this);
    }

    public <E extends model.UserException> void accept(ComponentExceptionVisitor<E> visitor) throws PersistenceException, E {
        visitor.handleArticle(this);
    }

    public <R, E extends model.UserException> R accept(ComponentReturnExceptionVisitor<R, E> visitor) throws PersistenceException, E {
        return visitor.handleArticle(this);
    }

    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleArticle(this);
    }

    public <R> R accept(AnythingReturnVisitor<R> visitor) throws PersistenceException {
        return visitor.handleArticle(this);
    }

    public <E extends model.UserException> void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
        visitor.handleArticle(this);
    }

    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E> visitor) throws PersistenceException, E {
        return visitor.handleArticle(this);
    }

    public void accept(CompHierarchyHIERARCHYVisitor visitor) throws PersistenceException {
        visitor.handleArticle(this);
    }

    public <R> R accept(CompHierarchyHIERARCHYReturnVisitor<R> visitor) throws PersistenceException {
        return visitor.handleArticle(this);
    }

    public <E extends model.UserException> void accept(CompHierarchyHIERARCHYExceptionVisitor<E> visitor) throws PersistenceException, E {
        visitor.handleArticle(this);
    }

    public <R, E extends model.UserException> R accept(CompHierarchyHIERARCHYReturnExceptionVisitor<R, E> visitor) throws PersistenceException, E {
        return visitor.handleArticle(this);
    }

    public void accept(SubjInterfaceVisitor visitor) throws PersistenceException {
        visitor.handleArticle(this);
    }

    public <R> R accept(SubjInterfaceReturnVisitor<R> visitor) throws PersistenceException {
        return visitor.handleArticle(this);
    }

    public <E extends model.UserException> void accept(SubjInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E {
        visitor.handleArticle(this);
    }

    public <R, E extends model.UserException> R accept(SubjInterfaceReturnExceptionVisitor<R, E> visitor) throws PersistenceException, E {
        return visitor.handleArticle(this);
    }

    public void accept(SubComponentVisitor visitor) throws PersistenceException {
        visitor.handleArticle(this);
    }

    public <R> R accept(SubComponentReturnVisitor<R> visitor) throws PersistenceException {
        return visitor.handleArticle(this);
    }

    public <E extends model.UserException> void accept(SubComponentExceptionVisitor<E> visitor) throws PersistenceException, E {
        visitor.handleArticle(this);
    }

    public <R, E extends model.UserException> R accept(SubComponentReturnExceptionVisitor<R, E> visitor) throws PersistenceException, E {
        return visitor.handleArticle(this);
    }

    public int getLeafInfo() throws PersistenceException {
        return 0;
    }

    public boolean containsCompHierarchy(final CompHierarchyHIERARCHY part) throws PersistenceException {
        return getThis().containsCompHierarchy(part, new java.util.HashSet<CompHierarchyHIERARCHY>());
    }

    public boolean containsCompHierarchy(final CompHierarchyHIERARCHY part, final java.util.HashSet<CompHierarchyHIERARCHY> visited) throws PersistenceException {
        if (getThis().equals(part))
            return true;
        if (visited.contains(getThis()))
            return false;
        visited.add(getThis());
        return false;
    }

    public synchronized void deregister(final ObsInterface observee) throws PersistenceException {
        SubjInterface subService = getThis().getSubService();
        if (subService == null) {
            subService = model.Subj.createSubj(this.isDelayed$Persistence());
            getThis().setSubService(subService);
        }
        subService.deregister(observee);
    }

    public void increaseStock(final long quantity, final Invoker invoker) throws PersistenceException {
        java.sql.Date now = new java.sql.Date(new java.util.Date().getTime());
        IncreaseStockCommand4Public command = model.meta.IncreaseStockCommand.createIncreaseStockCommand(quantity, now, now);
        command.setInvoker(invoker);
        command.setCommandReceiver(getThis());
        model.meta.CommandCoordinator.getTheCommandCoordinator().coordinate(command);
    }

    public void initialize(final Anything This, final java.util.HashMap<String, Object> final$$Fields) throws PersistenceException {
        this.setThis((PersistentArticle) This);
        if (this.isTheSameAs(This)) {
            this.setName((String) final$$Fields.get("name"));
            this.setPrice((common.Fraction) final$$Fields.get("price"));
            this.setMinStock((Long) final$$Fields.get("minStock"));
            this.setMaxStock((Long) final$$Fields.get("maxStock"));
            this.setProducerDeliveryTime((Long) final$$Fields.get("producerDeliveryTime"));
            this.setProducer((PersistentProducer) final$$Fields.get("producer"));
            this.setParent((PersistentProductGroup) final$$Fields.get("parent"));
        }
    }

    public void moveTo(final ProductGroup4Public productGroup) throws model.CycleException, PersistenceException {
        model.meta.SubComponentMoveToProductGroupMssg event = new model.meta.SubComponentMoveToProductGroupMssg(productGroup, getThis());
        event.execute();
        getThis().updateObservers(event);
        event.getResult();
    }

    public void moveTo(final ProductGroup4Public productGroup, final Invoker invoker) throws PersistenceException {
        java.sql.Date now = new java.sql.Date(new java.util.Date().getTime());
        MoveToCommand4Public command = model.meta.MoveToCommand.createMoveToCommand(now, now);
        command.setProductGroup(productGroup);
        command.setInvoker(invoker);
        command.setCommandReceiver(getThis());
        model.meta.CommandCoordinator.getTheCommandCoordinator().coordinate(command);
    }

    public void reduceStock(final long quantity, final Invoker invoker) throws PersistenceException {
        java.sql.Date now = new java.sql.Date(new java.util.Date().getTime());
        ReduceStockCommand4Public command = model.meta.ReduceStockCommand.createReduceStockCommand(quantity, now, now);
        command.setInvoker(invoker);
        command.setCommandReceiver(getThis());
        model.meta.CommandCoordinator.getTheCommandCoordinator().coordinate(command);
    }

    public synchronized void register(final ObsInterface observee) throws PersistenceException {
        SubjInterface subService = getThis().getSubService();
        if (subService == null) {
            subService = model.Subj.createSubj(this.isDelayed$Persistence());
            getThis().setSubService(subService);
        }
        subService.register(observee);
    }

    public void startSelling(final Invoker invoker) throws PersistenceException {
        java.sql.Date now = new java.sql.Date(new java.util.Date().getTime());
        StartSellingCommand4Public command = model.meta.StartSellingCommand.createStartSellingCommand(now, now);
        command.setInvoker(invoker);
        command.setCommandReceiver(getThis());
        model.meta.CommandCoordinator.getTheCommandCoordinator().coordinate(command);
    }

    public void stopSelling(final Invoker invoker) throws PersistenceException {
        java.sql.Date now = new java.sql.Date(new java.util.Date().getTime());
        StopSellingCommand4Public command = model.meta.StopSellingCommand.createStopSellingCommand(now, now);
        command.setInvoker(invoker);
        command.setCommandReceiver(getThis());
        model.meta.CommandCoordinator.getTheCommandCoordinator().coordinate(command);
    }

    public <T> T strategyCompHierarchy(final CompHierarchyHIERARCHYStrategy<T> strategy) throws PersistenceException {
        return getThis().strategyCompHierarchy(strategy, new java.util.HashMap<CompHierarchyHIERARCHY, T>());
    }

    public <T> T strategyCompHierarchy(final CompHierarchyHIERARCHYStrategy<T> strategy, final java.util.HashMap<CompHierarchyHIERARCHY, T> visited) throws PersistenceException {
        if (visited.containsKey(getThis()))
            return visited.get(getThis());
        T result = strategy.Article$$finalize(getThis());
        visited.put(getThis(), result);
        return result;
    }

    public synchronized void updateObservers(final model.meta.Mssgs event) throws PersistenceException {
        SubjInterface subService = getThis().getSubService();
        if (subService == null) {
            subService = model.Subj.createSubj(this.isDelayed$Persistence());
            getThis().setSubService(subService);
        }
        subService.updateObservers(event);
    }

    // Start of section that contains operations that must be implemented.

    public void copyingPrivateUserAttributes(final Anything copy) throws PersistenceException {
    }

    public String getCurrentState() throws PersistenceException {
        return getThis().getState().toString();
    }

    public String getProducerName() throws PersistenceException {
        return getThis().getProducer().getName();
    }

    public void increaseStock(final long quantity) throws PersistenceException {
        getThis().setCurrentStock(getThis().getCurrentStock() + quantity);

        getThis().getState().accept(new ArticleStateVisitor() {
            @Override
            public void handleInSale(InSale4Public inSale) throws PersistenceException {
                // Nothing special
            }

            @Override
            public void handleNewCreated(NewCreated4Public newCreated) throws PersistenceException {
                // Should not happen
            }

            @Override
            public void handleNotInSale(NotInSale4Public notInSale) throws PersistenceException {
                getThis().setState(RemainingStock.createRemainingStock());
            }

            @Override
            public void handleRemainingStock(RemainingStock4Public remainingStock) throws PersistenceException {
                // Should not happen
            }
        });

    }

    public void initializeOnCreation() throws PersistenceException {
        super.initializeOnCreation();
        getThis().setState(NewCreated.createNewCreated());
    }

    public void initializeOnInstantiation() throws PersistenceException {
        super.initializeOnInstantiation();
        getThis().setState(NewCreated.createNewCreated());

    }

    public void moveToImplementation(final ProductGroup4Public productGroup) throws model.CycleException, PersistenceException {
        // TODO! Make SubComponent a class?
        getThis().getParent().removeComponent(getThis());
        productGroup.addComponent(getThis());
        getThis().setParent(productGroup);
    }

    public void reduceStock(final long quantity) throws model.NotEnoughStockException, PersistenceException {

        if (getThis().getCurrentStock() >= quantity) {
            getThis().setCurrentStock(getThis().getCurrentStock() - quantity);

            if (getThis().getCurrentStock() < getThis().getMinStock()) {

                getThis().getState().accept(new ArticleStateVisitor() {
                    @Override
                    public void handleInSale(InSale4Public inSale) throws PersistenceException {
                        // TODO! Nachbestellen
                    }

                    @Override
                    public void handleNewCreated(NewCreated4Public newCreated) throws PersistenceException {
                        // TODO! Call not possible
                    }

                    @Override
                    public void handleNotInSale(NotInSale4Public notInSale) throws PersistenceException {
                        // TODO! Call not possible
                    }

                    @Override
                    public void handleRemainingStock(RemainingStock4Public remainingStock) throws PersistenceException {
                        if (getThis().getCurrentStock() == 0) {
                            getThis().setState(NotInSale.createNotInSale());
                        }
                    }
                });

            }
        } else {
            throw new NotEnoughStockException(MessageFormat.format("Tried to reduce stock by {0}, but only {1} in stock", quantity, getThis().getCurrentStock()));
        }

    }

    public void startSelling() throws PersistenceException {
        getThis().setState(getThis().getState().accept(new ArticleStateReturnVisitor<ArticleState4Public>() {
            @Override
            public ArticleState4Public handleInSale(InSale4Public inSale) throws PersistenceException {
                return null;
                // Should not happen
                // TODO! Throw a "ArticleAlreadyInSaleException"?
            }

            @Override
            public ArticleState4Public handleNewCreated(NewCreated4Public newCreated) throws PersistenceException {
                return InSale.createInSale();
            }

            @Override
            public ArticleState4Public handleNotInSale(NotInSale4Public notInSale) throws PersistenceException {
                return InSale.createInSale();
            }

            @Override
            public ArticleState4Public handleRemainingStock(RemainingStock4Public remainingStock) throws PersistenceException {
                return InSale.createInSale();
            }
        }));
    }

    public void stopSelling() throws PersistenceException {
        getThis().setState(getThis().getState().accept(new ArticleStateReturnVisitor<ArticleState4Public>() {
            @Override
            public ArticleState4Public handleInSale(InSale4Public inSale) throws PersistenceException {
                if(getThis().getCurrentStock() == 0)
                    return NotInSale.createNotInSale();
                else
                    return RemainingStock.createRemainingStock();
            }

            @Override
            public ArticleState4Public handleNewCreated(NewCreated4Public newCreated) throws PersistenceException {
                // Should not happen
                // TODO! Throw a "ArticleNotInSaleException"?
                return null;
            }

            @Override
            public ArticleState4Public handleNotInSale(NotInSale4Public notInSale) throws PersistenceException {
                // Should not happen
                // TODO! Throw a "ArticleNotInSaleException"?
                return null;
            }

            @Override
            public ArticleState4Public handleRemainingStock(RemainingStock4Public remainingStock) throws PersistenceException {
                // Should not happen
                // TODO! Throw a "ArticleNotInSaleException"?
                return null;
            }
        }));

    }

    // Start of section that contains overridden operations only.

    /* Start of protected part that is not overridden by persistence generator */

    /* End of protected part that is not overridden by persistence generator */

}
