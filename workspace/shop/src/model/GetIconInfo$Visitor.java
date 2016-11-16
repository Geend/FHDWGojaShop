package model;

import persistence.Anything;
import persistence.Article4Public;
import persistence.DefaultProductGroupWrapper4Public;
import persistence.NewSubProductGroupCommand4Public;
import persistence.OwnerArticleWrapper4Public;
import persistence.PersistenceException;
import persistence.Producer4Public;
import persistence.RootProductGroup4Public;
import persistence.StandardArticleWrapper4Public;
import persistence.SubProductGroup4Public;
import viewClient.IconManager;

public class GetIconInfo$Visitor extends model.visitor.AnythingStandardVisitor {

	int result = 0;
	
	@Override
	protected void standardHandling(Anything anything) throws PersistenceException {
		result = 0;	
	}

	public int getIconInfo(Anything anything) throws PersistenceException {
		anything.accept(this);
		return result;
	}

	@Override
	public void handleStandardArticleWrapper(StandardArticleWrapper4Public standardArticleWrapper) throws PersistenceException {
		result = IconManager.ARTICLE;
	}

	@Override
	public void handleDefaultProductGroupWrapper(DefaultProductGroupWrapper4Public defaultProductGroupWrapper) throws PersistenceException {
		result = IconManager.PRODUCT_GROUP;
	}

	@Override
	public void handleRootProductGroup(RootProductGroup4Public rootProductGroup) throws PersistenceException {
		result = IconManager.PRODUCT_GROUP;
	}

	@Override
	public void handleProducer(Producer4Public producer) throws PersistenceException {
		result = IconManager.PRODUCER;
	}


}
