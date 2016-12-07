package model.meta;

public interface ShopMssgsVisitor extends ShopDOWNMssgsVisitor, ShopUPMssgsVisitor {}


interface ShopDOWNMssgsVisitor  {

    public void handleShopChangeArticleNameArticleWrapperStringMssg(ShopChangeArticleNameArticleWrapperStringMssg event) throws persistence.PersistenceException;
    public void handleShopChangeArticlePriceArticleWrapperFractionMssg(ShopChangeArticlePriceArticleWrapperFractionMssg event) throws persistence.PersistenceException;
    public void handleShopChangeCustomerDeliveryTimePriceCustomerDeliveryTimeFractionMssg(ShopChangeCustomerDeliveryTimePriceCustomerDeliveryTimeFractionMssg event) throws persistence.PersistenceException;
    public void handleShopChangeCustomerDeliveryTimeTimeCustomerDeliveryTimeIntegerMssg(ShopChangeCustomerDeliveryTimeTimeCustomerDeliveryTimeIntegerMssg event) throws persistence.PersistenceException;
    public void handleShopCreateCustomerDeliveryTimeStringFractionIntegerMssg(ShopCreateCustomerDeliveryTimeStringFractionIntegerMssg event) throws persistence.PersistenceException;
    public void handleShopCreateProducerStringMssg(ShopCreateProducerStringMssg event) throws persistence.PersistenceException;
    public void handleShopMoveToComponentComponentContainerMssg(ShopMoveToComponentComponentContainerMssg event) throws persistence.PersistenceException;
    public void handleShopNewArticleComponentContainerStringFractionIntegerIntegerIntegerProducerMssg(ShopNewArticleComponentContainerStringFractionIntegerIntegerIntegerProducerMssg event) throws persistence.PersistenceException;
    public void handleShopNewProductGroupComponentContainerStringMssg(ShopNewProductGroupComponentContainerStringMssg event) throws persistence.PersistenceException;
    public void handleShopNewProductGroupStringMssg(ShopNewProductGroupStringMssg event) throws persistence.PersistenceException;
    public void handleShopStartSellingArticleWrapperMssg(ShopStartSellingArticleWrapperMssg event) throws persistence.PersistenceException;
    public void handleShopStopSellingArticleWrapperMssg(ShopStopSellingArticleWrapperMssg event) throws persistence.PersistenceException;
    
}


interface ShopUPMssgsVisitor  {

    public void handleShopChangeArticleNameArticleWrapperStringMssg(ShopChangeArticleNameArticleWrapperStringMssg event) throws persistence.PersistenceException;
    public void handleShopChangeArticlePriceArticleWrapperFractionMssg(ShopChangeArticlePriceArticleWrapperFractionMssg event) throws persistence.PersistenceException;
    public void handleShopChangeCustomerDeliveryTimePriceCustomerDeliveryTimeFractionMssg(ShopChangeCustomerDeliveryTimePriceCustomerDeliveryTimeFractionMssg event) throws persistence.PersistenceException;
    public void handleShopChangeCustomerDeliveryTimeTimeCustomerDeliveryTimeIntegerMssg(ShopChangeCustomerDeliveryTimeTimeCustomerDeliveryTimeIntegerMssg event) throws persistence.PersistenceException;
    public void handleShopCreateCustomerDeliveryTimeStringFractionIntegerMssg(ShopCreateCustomerDeliveryTimeStringFractionIntegerMssg event) throws persistence.PersistenceException;
    public void handleShopCreateProducerStringMssg(ShopCreateProducerStringMssg event) throws persistence.PersistenceException;
    public void handleShopMoveToComponentComponentContainerMssg(ShopMoveToComponentComponentContainerMssg event) throws persistence.PersistenceException;
    public void handleShopNewArticleComponentContainerStringFractionIntegerIntegerIntegerProducerMssg(ShopNewArticleComponentContainerStringFractionIntegerIntegerIntegerProducerMssg event) throws persistence.PersistenceException;
    public void handleShopNewProductGroupComponentContainerStringMssg(ShopNewProductGroupComponentContainerStringMssg event) throws persistence.PersistenceException;
    public void handleShopNewProductGroupStringMssg(ShopNewProductGroupStringMssg event) throws persistence.PersistenceException;
    public void handleShopStartSellingArticleWrapperMssg(ShopStartSellingArticleWrapperMssg event) throws persistence.PersistenceException;
    public void handleShopStopSellingArticleWrapperMssg(ShopStopSellingArticleWrapperMssg event) throws persistence.PersistenceException;
    
}