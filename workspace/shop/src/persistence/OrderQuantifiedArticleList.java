package persistence;

import java.util.*;

public class OrderQuantifiedArticleList {

	protected Vector<OrderQuantifiedArticle4Public> data; //List of proxies
	protected OrderQuantifiedArticleList() {
		this.data = new Vector<OrderQuantifiedArticle4Public>();
	}
	public Iterator<OrderQuantifiedArticle4Public> iterator(PersistentListProxi<OrderQuantifiedArticle4Public> listProxi) {
		return new PersistentListIterator<OrderQuantifiedArticle4Public>(listProxi, this.data);
	}
	public long getLength(){
		return this.data.size();
	}
	public void add (OrderQuantifiedArticle4Public entry) {
		this.data.add(entry);
	}
	@SuppressWarnings("unchecked")
	public OrderQuantifiedArticleList copy() {
		OrderQuantifiedArticleList result = new OrderQuantifiedArticleList();
		result.data = (Vector<OrderQuantifiedArticle4Public>)this.data.clone();
		return result;
	}


}


