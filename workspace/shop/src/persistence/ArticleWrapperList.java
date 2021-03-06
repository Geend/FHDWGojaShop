package persistence;

import java.util.*;

public class ArticleWrapperList  extends ArticleWrapperSearchList{

	protected ArticleWrapperList() {
		super();
	}
	public Iterator<ArticleWrapper4Public> iterator(PersistentListProxi<ArticleWrapper4Public> listProxi) {
		return new PersistentListIterator<ArticleWrapper4Public>(listProxi, this.data);
	}
	public long getLength(){
		return this.data.size();
	}
	public void add (ArticleWrapper4Public entry) {
		this.data.add(entry);
	}
	@SuppressWarnings("unchecked")
	public ArticleWrapperList copy() {
		ArticleWrapperList result = new ArticleWrapperList();
		result.data = (Vector<ArticleWrapper4Public>)this.data.clone();
		return result;
	}


}


