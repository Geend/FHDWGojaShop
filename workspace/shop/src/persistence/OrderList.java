package persistence;

import java.util.*;

public class OrderList  extends OrderSearchList{

	protected OrderList() {
		super();
	}
	public Iterator<Order4Public> iterator(PersistentListProxi<Order4Public> listProxi) {
		return new PersistentListIterator<Order4Public>(listProxi, this.data);
	}
	public long getLength(){
		return this.data.size();
	}
	public void add (Order4Public entry) {
		this.data.add(entry);
	}
	@SuppressWarnings("unchecked")
	public OrderList copy() {
		OrderList result = new OrderList();
		result.data = (Vector<Order4Public>)this.data.clone();
		return result;
	}


}


