package persistence;

public class ArticleReturnSearchList extends SearchListRoot<ArticleReturn4Public> implements Iterable<ArticleReturn4Public> {

	public ArticleReturnSearchList(SearchListRoot<ArticleReturn4Public> list){
		super(list);
	}
	public ArticleReturnSearchList(){
		super();
	}
	
	public void add (ArticleReturn4Public entry) {
		this.data.add(entry);
	}
	
	public void add(ArticleReturnSearchList list) throws PersistenceException{
		java.util.Iterator<ArticleReturn4Public> entries = list.iterator();
		while (entries.hasNext()){
			this.add(entries.next());
		}
	}
	public java.util.Iterator<ArticleReturn4Public> iterator() {
		return this.data.iterator();
	}
  	public ArticleReturnSearchList copy() throws PersistenceException {
  		ArticleReturnSearchList result = new ArticleReturnSearchList();
  		result.add(this);
  		return result;
  	}
}


