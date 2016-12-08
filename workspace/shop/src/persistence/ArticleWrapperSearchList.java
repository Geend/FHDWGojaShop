package persistence;

public class ArticleWrapperSearchList extends SearchListRoot<ArticleWrapper4Public> implements Iterable<ArticleWrapper4Public> {

	public ArticleWrapperSearchList(SearchListRoot<ArticleWrapper4Public> list){
		super(list);
	}
	public ArticleWrapperSearchList(){
		super();
	}
	
	public void add (ArticleWrapper4Public entry) {
		this.data.add(entry);
	}
	
	public void add(ArticleWrapperSearchList list) throws PersistenceException{
		java.util.Iterator<ArticleWrapper4Public> entries = list.iterator();
		while (entries.hasNext()){
			this.add(entries.next());
		}
	}
	public java.util.Iterator<ArticleWrapper4Public> iterator() {
		return this.data.iterator();
	}
  	public ArticleWrapperSearchList copy() throws PersistenceException {
  		ArticleWrapperSearchList result = new ArticleWrapperSearchList();
  		result.add(this);
  		return result;
  	}
}


