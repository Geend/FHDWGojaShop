package persistence;

import java.util.*;

public class ReOrderQuantifiedArticleList {

	protected Vector<ReOrderQuantifiedArticle4Public> data; //List of proxies
	protected ReOrderQuantifiedArticleList() {
		this.data = new Vector<ReOrderQuantifiedArticle4Public>();
	}
	public Iterator<ReOrderQuantifiedArticle4Public> iterator(PersistentListProxi<ReOrderQuantifiedArticle4Public> listProxi) {
		return new PersistentListIterator<ReOrderQuantifiedArticle4Public>(listProxi, this.data);
	}
	public long getLength(){
		return this.data.size();
	}
	public void add (ReOrderQuantifiedArticle4Public entry) {
		this.data.add(entry);
	}
	@SuppressWarnings("unchecked")
	public ReOrderQuantifiedArticleList copy() {
		ReOrderQuantifiedArticleList result = new ReOrderQuantifiedArticleList();
		result.data = (Vector<ReOrderQuantifiedArticle4Public>)this.data.clone();
		return result;
	}


}


