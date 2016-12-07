package persistence;

import model.visitor.*;

/* Additional import section end */

public interface ComponentContainer extends  SubjInterface {
    
    
    public void addComponent(final Component4Public component) 
				throws model.CycleException, PersistenceException;
    public void fireComponentChanged(final model.meta.ComponentMssgs evnt) 
				throws PersistenceException;
    public ArticleWrapper4Public newArticle(final String name, final common.Fraction price, final long minStock, final long maxStock, final long producerDeliveryTime, final Producer4Public producer) 
				throws model.CycleException, PersistenceException;
    public void newArticle(final String name, final common.Fraction price, final long minStock, final long maxStock, final long producerDeliveryTime, final Producer4Public producer, final Invoker invoker) 
				throws PersistenceException;
    public ProductGroup4Public newProductGroup(final String name) 
				throws model.DoubleDefinitionException, model.CycleException, PersistenceException;
    public void newProductGroup(final String name, final Invoker invoker) 
				throws PersistenceException;
    public void removeComponent(final Component4Public component) 
				throws PersistenceException;
    public void addComponentImplementation(final Component4Public component) 
				throws model.CycleException, PersistenceException;
    public void fireComponentChangedImplementation(final model.meta.ComponentMssgs evnt) 
				throws PersistenceException;
    public ArticleWrapper4Public newArticleImplementation(final String name, final common.Fraction price, final long minStock, final long maxStock, final long producerDeliveryTime, final Producer4Public producer) 
				throws model.CycleException, PersistenceException;
    public ProductGroup4Public newProductGroupImplementation(final String name) 
				throws model.DoubleDefinitionException, model.CycleException, PersistenceException;
    public void removeComponentImplementation(final Component4Public component) 
				throws PersistenceException;

    public void accept(ComponentContainerVisitor visitor) throws PersistenceException;
    public <R> R accept(ComponentContainerReturnVisitor<R>  visitor) throws PersistenceException;
    public <E extends model.UserException>  void accept(ComponentContainerExceptionVisitor<E> visitor) throws PersistenceException, E;
    public <R, E extends model.UserException> R accept(ComponentContainerReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E;
}

