package persistence;

import java.util.*;

public class ArticleReturnList {

	protected Vector<ArticleReturn4Public> data; //List of proxies
	protected ArticleReturnList() {
		this.data = new Vector<ArticleReturn4Public>();
	}
	public Iterator<ArticleReturn4Public> iterator(PersistentListProxi<ArticleReturn4Public> listProxi) {
		return new PersistentListIterator<ArticleReturn4Public>(listProxi, this.data);
	}
	public long getLength(){
		return this.data.size();
	}
	public void add (ArticleReturn4Public entry) {
		this.data.add(entry);
	}
	@SuppressWarnings("unchecked")
	public ArticleReturnList copy() {
		ArticleReturnList result = new ArticleReturnList();
		result.data = (Vector<ArticleReturn4Public>)this.data.clone();
		return result;
	}


}


