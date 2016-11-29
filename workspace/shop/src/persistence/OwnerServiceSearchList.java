package persistence;

public class OwnerServiceSearchList extends SearchListRoot<OwnerService4Public> implements Iterable<OwnerService4Public> {

	public OwnerServiceSearchList(SearchListRoot<OwnerService4Public> list){
		super(list);
	}
	public OwnerServiceSearchList(){
		super();
	}
	
	public void add (OwnerService4Public entry) {
		this.data.add(entry);
	}
	
	public void add(OwnerServiceSearchList list) throws PersistenceException{
		java.util.Iterator<OwnerService4Public> entries = list.iterator();
		while (entries.hasNext()){
			this.add(entries.next());
		}
	}
	public java.util.Iterator<OwnerService4Public> iterator() {
		return this.data.iterator();
	}
  	public OwnerServiceSearchList copy() throws PersistenceException {
  		OwnerServiceSearchList result = new OwnerServiceSearchList();
  		result.add(this);
  		return result;
  	}
}


