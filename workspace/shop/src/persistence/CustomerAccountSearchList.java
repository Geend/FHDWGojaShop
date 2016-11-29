package persistence;

public class CustomerAccountSearchList extends SearchListRoot<CustomerAccount4Public> implements Iterable<CustomerAccount4Public> {

	public CustomerAccountSearchList(SearchListRoot<CustomerAccount4Public> list){
		super(list);
	}
	public CustomerAccountSearchList(){
		super();
	}
	
	public void add (CustomerAccount4Public entry) {
		this.data.add(entry);
	}
	
	public void add(CustomerAccountSearchList list) throws PersistenceException{
		java.util.Iterator<CustomerAccount4Public> entries = list.iterator();
		while (entries.hasNext()){
			this.add(entries.next());
		}
	}
	public java.util.Iterator<CustomerAccount4Public> iterator() {
		return this.data.iterator();
	}
  	public CustomerAccountSearchList copy() throws PersistenceException {
  		CustomerAccountSearchList result = new CustomerAccountSearchList();
  		result.add(this);
  		return result;
  	}
}


