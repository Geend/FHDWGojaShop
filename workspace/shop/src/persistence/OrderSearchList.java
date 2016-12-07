package persistence;

public class OrderSearchList extends SearchListRoot<Order4Public> implements Iterable<Order4Public> {

	public OrderSearchList(SearchListRoot<Order4Public> list){
		super(list);
	}
	public OrderSearchList(){
		super();
	}
	
	public void add (Order4Public entry) {
		this.data.add(entry);
	}
	
	public void add(OrderSearchList list) throws PersistenceException{
		java.util.Iterator<Order4Public> entries = list.iterator();
		while (entries.hasNext()){
			this.add(entries.next());
		}
	}
	public java.util.Iterator<Order4Public> iterator() {
		return this.data.iterator();
	}
  	public OrderSearchList copy() throws PersistenceException {
  		OrderSearchList result = new OrderSearchList();
  		result.add(this);
  		return result;
  	}
}


