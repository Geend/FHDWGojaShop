package persistence;

public class ComponentSearchList extends SearchListRoot<Component4Public> implements Iterable<Component4Public> {

	public ComponentSearchList(SearchListRoot<Component4Public> list){
		super(list);
	}
	public ComponentSearchList(){
		super();
	}
	
	public void add (Component4Public entry) {
		this.data.add(entry);
	}
	
	public void add(ComponentSearchList list) throws PersistenceException{
		java.util.Iterator<Component4Public> entries = list.iterator();
		while (entries.hasNext()){
			this.add(entries.next());
		}
	}
	public java.util.Iterator<Component4Public> iterator() {
		return this.data.iterator();
	}
  	public ComponentSearchList copy() throws PersistenceException {
  		ComponentSearchList result = new ComponentSearchList();
  		result.add(this);
  		return result;
  	}
}


