package persistence;

import java.util.*;

public class OrderQuantifiedArticleList {

	protected Vector<PersistentOrderQuantifiedArticle> data; //List of proxies
	protected OrderQuantifiedArticleList() {
		this.data = new Vector<PersistentOrderQuantifiedArticle>();
	}
	public Iterator<PersistentOrderQuantifiedArticle> iterator(PersistentListProxi<PersistentOrderQuantifiedArticle> listProxi) {
		return new PersistentListIterator<PersistentOrderQuantifiedArticle>(listProxi, this.data);
	}
	public long getLength(){
		return this.data.size();
	}
	public void add (PersistentOrderQuantifiedArticle entry) {
		this.data.add(entry);
	}
	@SuppressWarnings("unchecked")
	public OrderQuantifiedArticleList copy() {
		OrderQuantifiedArticleList result = new OrderQuantifiedArticleList();
		result.data = (Vector<PersistentOrderQuantifiedArticle>)this.data.clone();
		return result;
	}


}


