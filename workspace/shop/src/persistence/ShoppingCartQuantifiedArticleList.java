package persistence;

import java.util.*;

public class ShoppingCartQuantifiedArticleList {

	protected Vector<PersistentShoppingCartQuantifiedArticle> data; //List of proxies
	protected ShoppingCartQuantifiedArticleList() {
		this.data = new Vector<PersistentShoppingCartQuantifiedArticle>();
	}
	public Iterator<PersistentShoppingCartQuantifiedArticle> iterator(PersistentListProxi<PersistentShoppingCartQuantifiedArticle> listProxi) {
		return new PersistentListIterator<PersistentShoppingCartQuantifiedArticle>(listProxi, this.data);
	}
	public long getLength(){
		return this.data.size();
	}
	public void add (PersistentShoppingCartQuantifiedArticle entry) {
		this.data.add(entry);
	}
	@SuppressWarnings("unchecked")
	public ShoppingCartQuantifiedArticleList copy() {
		ShoppingCartQuantifiedArticleList result = new ShoppingCartQuantifiedArticleList();
		result.data = (Vector<PersistentShoppingCartQuantifiedArticle>)this.data.clone();
		return result;
	}


}


