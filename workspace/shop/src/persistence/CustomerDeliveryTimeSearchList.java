package persistence;

public class CustomerDeliveryTimeSearchList extends SearchListRoot<CustomerDeliveryTime4Public> implements Iterable<CustomerDeliveryTime4Public> {

	public CustomerDeliveryTimeSearchList(SearchListRoot<CustomerDeliveryTime4Public> list){
		super(list);
	}
	public CustomerDeliveryTimeSearchList(){
		super();
	}
	
	public void add (CustomerDeliveryTime4Public entry) {
		this.data.add(entry);
	}
	
	public void add(CustomerDeliveryTimeSearchList list) throws PersistenceException{
		java.util.Iterator<CustomerDeliveryTime4Public> entries = list.iterator();
		while (entries.hasNext()){
			this.add(entries.next());
		}
	}
	public java.util.Iterator<CustomerDeliveryTime4Public> iterator() {
		return this.data.iterator();
	}
  	public CustomerDeliveryTimeSearchList copy() throws PersistenceException {
  		CustomerDeliveryTimeSearchList result = new CustomerDeliveryTimeSearchList();
  		result.add(this);
  		return result;
  	}
}


