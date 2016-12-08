package persistence;

import java.util.*;

public class ShoppingCartQuantifiedArticleList {

	protected Vector<ShoppingCartQuantifiedArticle4Public> data; //List of proxies
	protected ShoppingCartQuantifiedArticleList() {
		this.data = new Vector<ShoppingCartQuantifiedArticle4Public>();
	}
	public Iterator<ShoppingCartQuantifiedArticle4Public> iterator(PersistentListProxi<ShoppingCartQuantifiedArticle4Public> listProxi) {
		return new PersistentListIterator<ShoppingCartQuantifiedArticle4Public>(listProxi, this.data);
	}
	public long getLength(){
		return this.data.size();
	}
	public void add (ShoppingCartQuantifiedArticle4Public entry) {
		this.data.add(entry);
	}
	@SuppressWarnings("unchecked")
	public ShoppingCartQuantifiedArticleList copy() {
		ShoppingCartQuantifiedArticleList result = new ShoppingCartQuantifiedArticleList();
		result.data = (Vector<ShoppingCartQuantifiedArticle4Public>)this.data.clone();
		return result;
	}


}


