package persistence;

public class ComponentWrapperSearchList extends SearchListRoot<ComponentWrapper4Public> implements Iterable<ComponentWrapper4Public> {

	public ComponentWrapperSearchList(SearchListRoot<ComponentWrapper4Public> list){
		super(list);
	}
	public ComponentWrapperSearchList(){
		super();
	}
	
	public void add (ComponentWrapper4Public entry) {
		this.data.add(entry);
	}
	
	public void add(ComponentWrapperSearchList list) throws PersistenceException{
		java.util.Iterator<ComponentWrapper4Public> entries = list.iterator();
		while (entries.hasNext()){
			this.add(entries.next());
		}
	}
	public java.util.Iterator<ComponentWrapper4Public> iterator() {
		return this.data.iterator();
	}
  	public ComponentWrapperSearchList copy() throws PersistenceException {
  		ComponentWrapperSearchList result = new ComponentWrapperSearchList();
  		result.add(this);
  		return result;
  	}
}


