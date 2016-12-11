package persistence;

import java.util.HashMap;

import common.ProxiInformation;
import common.RPCConstantsAndServices;

abstract class ProxiFactory {
	  abstract AbstractPersistentRoot create(long objectId);
}
abstract class ListProxiFactory {
	  abstract AbstractPersistentRoot create(long objectId, long entryId);
}

public abstract class PersistentProxi extends PersistentRoot implements PersistentProxiInterface {

  private static ProxiFactory [] proxiFactories;
  private static ListProxiFactory [] listProxiFactories;
	
  private static ListProxiFactory [] getTheListProxiFactories(){
	if (listProxiFactories == null){
		listProxiFactories = new ListProxiFactory[353];
        listProxiFactories[109] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new ProducerLstListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[266] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new CONCBackgroundTaskListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[20] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new ProductGroupListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[177] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new CustomerServiceListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[92] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new RemainingStockListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[131] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new OrderQuantifiedArticleListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[1] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new ServerListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[2] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new ErrorDisplayListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[225] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new ReOrderQuantifiedArticleListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[94] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new NotInSaleListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[308] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new NewProductGroupCommandListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[124] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new CustomerRegisterServiceListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[166] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new RegisterCommandListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[234] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new ProcessingOrderStateListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[294] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new ComponentContainerImplementationListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[0] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new CommandCoordinatorListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[186] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new StopSellingCommandListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[168] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new MoveToCommandListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[191] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new AddArticleCommandListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[309] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new ChangeCustomerDeliveryTimeTimeCommandListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[335] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new GlobalOrderArchiveListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[195] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new CustomerDeliveryTimeManagerListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[217] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new SettingsListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[199] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new DepositCommandListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[137] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new OrderListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[108] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new CreateProducerCommandListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[255] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new OrderQuantifiedArticleNormalStateListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[188] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new StartSellingCommandListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[192] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new RemoveArticleCommandListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[171] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new NewArticleCommandListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[138] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new CustomerAccountListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[242] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new GlobalOrderManagerListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[325] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new OwnerServiceShopListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[226] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new ReOrderManagerListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[235] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new InTransitOrderStateListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[327] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new ShopListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[97] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new ProducerListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[248] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new ArticleReturnListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[254] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new OrderQuantifiedArticleMarkedForReturnStateListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[3] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new CommonDateListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[141] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new ArticleWrapperListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[236] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new PreOrderStateListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[250] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new ReturnManagerListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[194] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new CreateCustomerDeliveryTimeCommandListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[93] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new ArticleListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[333] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new OrderCartCommandListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[133] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new CustomerDeliveryTimeListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[175] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new OwnerServiceListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[200] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new WithdrawCommandListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[329] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new ChangeArticleNameCommandListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[237] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new FinishedOrderStateListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[278] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new ComponentManagerListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[223] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new CustomerArticleLstListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[135] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new ShoppingCartQuantifiedArticleListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[99] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new NewCreatedListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[330] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new ChangeArticlePriceCommandListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[233] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new DebitCommandListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[262] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new BackgroundTaskManagerListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[231] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new WaitingForAcceptOrderStateListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[347] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new CustomerServiceOrderManagerListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[95] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new InSaleListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[245] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new ReturnQuantifiedArticleListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[343] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new OwnerServiceOrderManagerListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[157] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new SubjListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[306] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new CustomerServiceShopListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[334] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new PreOrderCartCommandListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[140] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new ShoppingCartListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[341] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new OwnerServiceReOrderManagerListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[260] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new ArticlesInReturnOrderStateListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[193] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new ChangeArticleQuantityCommandListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[350] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new OrderQuantifiedArticlePreOrderListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[207] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new CustomerOrderManagerListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[310] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new ChangeCustomerDeliveryTimePriceCommandListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[4] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new CommandExecuterListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[259] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new AcceptOrderCommandListEntryProxi(objectId, entryId);
            }
        };
	}
	return listProxiFactories;
  }
  private static ProxiFactory [] getTheProxiFactories(){
	if (proxiFactories == null){
		proxiFactories = new ProxiFactory [353];
        proxiFactories[109] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new ProducerLstProxi(objectId);
            }
        };
        proxiFactories[266] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new CONCBackgroundTaskProxi(objectId);
            }
        };
        proxiFactories[20] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new ProductGroupProxi(objectId);
            }
        };
        proxiFactories[177] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new CustomerServiceProxi(objectId);
            }
        };
        proxiFactories[92] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new RemainingStockProxi(objectId);
            }
        };
        proxiFactories[131] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new OrderQuantifiedArticleProxi(objectId);
            }
        };
        proxiFactories[1] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new ServerProxi(objectId);
            }
        };
        proxiFactories[2] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new ErrorDisplayProxi(objectId);
            }
        };
        proxiFactories[225] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new ReOrderQuantifiedArticleProxi(objectId);
            }
        };
        proxiFactories[94] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new NotInSaleProxi(objectId);
            }
        };
        proxiFactories[308] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new NewProductGroupCommandProxi(objectId);
            }
        };
        proxiFactories[124] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new CustomerRegisterServiceProxi(objectId);
            }
        };
        proxiFactories[166] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new RegisterCommandProxi(objectId);
            }
        };
        proxiFactories[234] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new ProcessingOrderStateProxi(objectId);
            }
        };
        proxiFactories[294] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new ComponentContainerImplementationProxi(objectId);
            }
        };
        proxiFactories[0] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new CommandCoordinatorProxi(objectId);
            }
        };
        proxiFactories[186] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new StopSellingCommandProxi(objectId);
            }
        };
        proxiFactories[168] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new MoveToCommandProxi(objectId);
            }
        };
        proxiFactories[191] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new AddArticleCommandProxi(objectId);
            }
        };
        proxiFactories[309] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new ChangeCustomerDeliveryTimeTimeCommandProxi(objectId);
            }
        };
        proxiFactories[335] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new GlobalOrderArchiveProxi(objectId);
            }
        };
        proxiFactories[195] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new CustomerDeliveryTimeManagerProxi(objectId);
            }
        };
        proxiFactories[217] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new SettingsProxi(objectId);
            }
        };
        proxiFactories[199] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new DepositCommandProxi(objectId);
            }
        };
        proxiFactories[137] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new OrderProxi(objectId);
            }
        };
        proxiFactories[108] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new CreateProducerCommandProxi(objectId);
            }
        };
        proxiFactories[255] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new OrderQuantifiedArticleNormalStateProxi(objectId);
            }
        };
        proxiFactories[188] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new StartSellingCommandProxi(objectId);
            }
        };
        proxiFactories[192] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new RemoveArticleCommandProxi(objectId);
            }
        };
        proxiFactories[171] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new NewArticleCommandProxi(objectId);
            }
        };
        proxiFactories[138] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new CustomerAccountProxi(objectId);
            }
        };
        proxiFactories[242] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new GlobalOrderManagerProxi(objectId);
            }
        };
        proxiFactories[325] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new OwnerServiceShopProxi(objectId);
            }
        };
        proxiFactories[226] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new ReOrderManagerProxi(objectId);
            }
        };
        proxiFactories[235] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new InTransitOrderStateProxi(objectId);
            }
        };
        proxiFactories[327] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new ShopProxi(objectId);
            }
        };
        proxiFactories[97] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new ProducerProxi(objectId);
            }
        };
        proxiFactories[248] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new ArticleReturnProxi(objectId);
            }
        };
        proxiFactories[254] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new OrderQuantifiedArticleMarkedForReturnStateProxi(objectId);
            }
        };
        proxiFactories[3] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new CommonDateProxi(objectId);
            }
        };
        proxiFactories[141] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new ArticleWrapperProxi(objectId);
            }
        };
        proxiFactories[236] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new PreOrderStateProxi(objectId);
            }
        };
        proxiFactories[250] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new ReturnManagerProxi(objectId);
            }
        };
        proxiFactories[194] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new CreateCustomerDeliveryTimeCommandProxi(objectId);
            }
        };
        proxiFactories[93] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new ArticleProxi(objectId);
            }
        };
        proxiFactories[333] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new OrderCartCommandProxi(objectId);
            }
        };
        proxiFactories[133] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new CustomerDeliveryTimeProxi(objectId);
            }
        };
        proxiFactories[175] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new OwnerServiceProxi(objectId);
            }
        };
        proxiFactories[200] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new WithdrawCommandProxi(objectId);
            }
        };
        proxiFactories[329] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new ChangeArticleNameCommandProxi(objectId);
            }
        };
        proxiFactories[237] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new FinishedOrderStateProxi(objectId);
            }
        };
        proxiFactories[278] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new ComponentManagerProxi(objectId);
            }
        };
        proxiFactories[223] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new CustomerArticleLstProxi(objectId);
            }
        };
        proxiFactories[135] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new ShoppingCartQuantifiedArticleProxi(objectId);
            }
        };
        proxiFactories[99] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new NewCreatedProxi(objectId);
            }
        };
        proxiFactories[330] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new ChangeArticlePriceCommandProxi(objectId);
            }
        };
        proxiFactories[233] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new DebitCommandProxi(objectId);
            }
        };
        proxiFactories[262] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new BackgroundTaskManagerProxi(objectId);
            }
        };
        proxiFactories[231] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new WaitingForAcceptOrderStateProxi(objectId);
            }
        };
        proxiFactories[347] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new CustomerServiceOrderManagerProxi(objectId);
            }
        };
        proxiFactories[95] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new InSaleProxi(objectId);
            }
        };
        proxiFactories[245] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new ReturnQuantifiedArticleProxi(objectId);
            }
        };
        proxiFactories[343] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new OwnerServiceOrderManagerProxi(objectId);
            }
        };
        proxiFactories[157] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new SubjProxi(objectId);
            }
        };
        proxiFactories[306] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new CustomerServiceShopProxi(objectId);
            }
        };
        proxiFactories[334] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new PreOrderCartCommandProxi(objectId);
            }
        };
        proxiFactories[140] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new ShoppingCartProxi(objectId);
            }
        };
        proxiFactories[341] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new OwnerServiceReOrderManagerProxi(objectId);
            }
        };
        proxiFactories[260] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new ArticlesInReturnOrderStateProxi(objectId);
            }
        };
        proxiFactories[193] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new ChangeArticleQuantityCommandProxi(objectId);
            }
        };
        proxiFactories[350] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new OrderQuantifiedArticlePreOrderProxi(objectId);
            }
        };
        proxiFactories[207] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new CustomerOrderManagerProxi(objectId);
            }
        };
        proxiFactories[310] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new ChangeCustomerDeliveryTimePriceCommandProxi(objectId);
            }
        };
        proxiFactories[4] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new CommandExecuterProxi(objectId);
            }
        };
        proxiFactories[259] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new AcceptOrderCommandProxi(objectId);
            }
        };
	}
	return proxiFactories;
  }

  public static PersistentProxiInterface createProxi(ProxiInformation proxi) throws PersistenceException{
	  if (proxi.isDecorator()){
		  Decoratees resultDecoratee = (Decoratees) createProxi(proxi.getDecorateeObjectId(), proxi.getDecorateeClassId());
		  PersistentProxiInterface resultDecorator = (PersistentProxiInterface) resultDecoratee.createDecorator();
		  resultDecorator.setId(proxi.getObjectId());
		  return resultDecorator;
	  } else {
		  return createProxi(proxi.getObjectId(), proxi.getClassId());
	  }
  }

  public static PersistentProxiInterface createProxi(long objectId, long classId) throws PersistenceException {
    int index = (int) classId;
    if (classId == RPCConstantsAndServices.NullClassID) return null; 
	if (index < 0) index = index * -1;
    index = index - 101;
    if (index > getTheProxiFactories().length) throw new PersistenceException("Unknown class :" + Long.toString(classId),0);
    ProxiFactory factory = getTheProxiFactories()[index];
    if (factory == null)  throw new PersistenceException("Unknown class :" + Long.toString(classId),0);
    PersistentProxiInterface result =  (PersistentProxiInterface)factory.create(objectId);
    result.getTheObject();
    return result;
  }
  public static PersistentListEntryProxi createListEntryProxi(long objectId, long classId, long entryId) throws PersistenceException {
    int index = (int) classId;
	if (index < 0) index = index * -1;
    index = index - 101;
    if (index > getTheListProxiFactories().length) throw new PersistenceException("Unknown class :" + Long.toString(classId),0);
    ListProxiFactory factory = getTheListProxiFactories()[index];
    if (factory == null)  throw new PersistenceException("Unknown class :" + Long.toString(classId),0);
    PersistentListEntryProxi result =  (PersistentListEntryProxi)factory.create(objectId,entryId);
    result.getTheObject();
    return result;
  }

	private PersistentInCacheProxi object;

	protected PersistentProxi(long id) {
		super(id);
		this.object = null;
	}

	protected PersistentProxi(PersistentInCacheProxi object) {
		//TODO (GOJA) Still needed for Decorator???
		super(object.getId());
		this.object = object;
		this.object.incrementUserCount();
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

	public void setObject(PersistentRoot object) {
		if (this.object == null)
			this.object = (PersistentInCacheProxi)object;
	}

	public HashMap<String,Object> toHashtable(int depth, int essentialLevel, boolean forGUI, TDObserver tdObserver) throws PersistenceException {
		PersistentRoot iCRroxi = this.getTheObject();
		if (iCRroxi == null) return null;
		return iCRroxi.toHashtable(depth, essentialLevel, forGUI, tdObserver);
	}
	public HashMap<String, Object> toHashtable(HashMap<String, Object> allResults, int depth, int essentialLevel, boolean forGUI, boolean leaf, TDObserver tdObserver) throws PersistenceException {
		PersistentRoot iCRroxi = this.getTheObject();
		if (iCRroxi == null) return null;
		return iCRroxi.toHashtable(allResults, depth, essentialLevel, forGUI, leaf, tdObserver);
	}

	public PersistentRoot getTheObject() throws PersistenceException {
		if (this.object == null) {
			this.object = Cache.getTheCache().get(this);
			this.object.incrementUserCount();
		}
		return this.object;
	}
	public boolean hasEssentialFields() throws PersistenceException{
		return this.getTheObject().hasEssentialFields();
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
	public void delete$Me() throws PersistenceException {
		this.getTheObject().delete$Me();
	}
	public Anything getThis() throws PersistenceException {
		return this.getTheObject().getThis();
	}
	
	
    protected void setDltd() throws PersistenceException{
        this.getTheObject().setDltd();
    }
    public boolean isDltd() throws PersistenceException {
        return this.getTheObject().isDltd();
    }
	
	
//	public void finalize(){
//		if (this.object != null)this.object.decrementUserCount();
//	}
}
