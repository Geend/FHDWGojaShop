package persistence;

import java.util.*;

public class ReturnQuantifiedArticleList {

	protected Vector<ReturnQuantifiedArticle4Public> data; //List of proxies
	protected ReturnQuantifiedArticleList() {
		this.data = new Vector<ReturnQuantifiedArticle4Public>();
	}
	public Iterator<ReturnQuantifiedArticle4Public> iterator(PersistentListProxi<ReturnQuantifiedArticle4Public> listProxi) {
		return new PersistentListIterator<ReturnQuantifiedArticle4Public>(listProxi, this.data);
	}
	public long getLength(){
		return this.data.size();
	}
	public void add (ReturnQuantifiedArticle4Public entry) {
		this.data.add(entry);
	}
	@SuppressWarnings("unchecked")
	public ReturnQuantifiedArticleList copy() {
		ReturnQuantifiedArticleList result = new ReturnQuantifiedArticleList();
		result.data = (Vector<ReturnQuantifiedArticle4Public>)this.data.clone();
		return result;
	}


}


