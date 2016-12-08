package persistence;

public class ReOrderQuantifiedArticleSearchList extends SearchListRoot<ReOrderQuantifiedArticle4Public> implements Iterable<ReOrderQuantifiedArticle4Public> {

	public ReOrderQuantifiedArticleSearchList(SearchListRoot<ReOrderQuantifiedArticle4Public> list){
		super(list);
	}
	public ReOrderQuantifiedArticleSearchList(){
		super();
	}
	
	public void add (ReOrderQuantifiedArticle4Public entry) {
		this.data.add(entry);
	}
	
	public void add(ReOrderQuantifiedArticleSearchList list) throws PersistenceException{
		java.util.Iterator<ReOrderQuantifiedArticle4Public> entries = list.iterator();
		while (entries.hasNext()){
			this.add(entries.next());
		}
	}
	public java.util.Iterator<ReOrderQuantifiedArticle4Public> iterator() {
		return this.data.iterator();
	}
  	public ReOrderQuantifiedArticleSearchList copy() throws PersistenceException {
  		ReOrderQuantifiedArticleSearchList result = new ReOrderQuantifiedArticleSearchList();
  		result.add(this);
  		return result;
  	}
}


