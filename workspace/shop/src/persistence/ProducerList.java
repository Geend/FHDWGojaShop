package persistence;

import java.util.*;

public class ProducerList {

	protected Vector<Producer4Public> data; //List of proxies
	protected ProducerList() {
		this.data = new Vector<Producer4Public>();
	}
	public Iterator<Producer4Public> iterator(PersistentListProxi<Producer4Public> listProxi) {
		return new PersistentListIterator<Producer4Public>(listProxi, this.data);
	}
	public long getLength(){
		return this.data.size();
	}
	public void add (Producer4Public entry) {
		this.data.add(entry);
	}
	@SuppressWarnings("unchecked")
	public ProducerList copy() {
		ProducerList result = new ProducerList();
		result.data = (Vector<Producer4Public>)this.data.clone();
		return result;
	}


}


