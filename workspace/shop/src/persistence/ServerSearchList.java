package persistence;

public class ServerSearchList extends SearchListRoot<Server4Public> implements Iterable<Server4Public> {

	public ServerSearchList(SearchListRoot<Server4Public> list){
		super(list);
	}
	public ServerSearchList(){
		super();
	}
	
	public void add (Server4Public entry) {
		this.data.add(entry);
	}
	
	public void add(ServerSearchList list) throws PersistenceException{
		java.util.Iterator<Server4Public> entries = list.iterator();
		while (entries.hasNext()){
			this.add(entries.next());
		}
	}
	public java.util.Iterator<Server4Public> iterator() {
		return this.data.iterator();
	}
  	public ServerSearchList copy() throws PersistenceException {
  		ServerSearchList result = new ServerSearchList();
  		result.add(this);
  		return result;
  	}
}


