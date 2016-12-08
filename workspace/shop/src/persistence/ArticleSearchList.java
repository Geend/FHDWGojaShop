package persistence;

public class ArticleSearchList extends SearchListRoot<Article4Public> implements Iterable<Article4Public> {

	public ArticleSearchList(SearchListRoot<Article4Public> list){
		super(list);
	}
	public ArticleSearchList(){
		super();
	}
	
	public void add (Article4Public entry) {
		this.data.add(entry);
	}
	
	public void add(ArticleSearchList list) throws PersistenceException{
		java.util.Iterator<Article4Public> entries = list.iterator();
		while (entries.hasNext()){
			this.add(entries.next());
		}
	}
	public java.util.Iterator<Article4Public> iterator() {
		return this.data.iterator();
	}
  	public ArticleSearchList copy() throws PersistenceException {
  		ArticleSearchList result = new ArticleSearchList();
  		result.add(this);
  		return result;
  	}
}


