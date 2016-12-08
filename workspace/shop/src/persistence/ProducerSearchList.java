package persistence;

public class ProducerSearchList extends SearchListRoot<Producer4Public> implements Iterable<Producer4Public> {

	public ProducerSearchList(SearchListRoot<Producer4Public> list){
		super(list);
	}
	public ProducerSearchList(){
		super();
	}
	
	public void add (Producer4Public entry) {
		this.data.add(entry);
	}
	
	public void add(ProducerSearchList list) throws PersistenceException{
		java.util.Iterator<Producer4Public> entries = list.iterator();
		while (entries.hasNext()){
			this.add(entries.next());
		}
	}
	public java.util.Iterator<Producer4Public> iterator() {
		return this.data.iterator();
	}
  	public ProducerSearchList copy() throws PersistenceException {
  		ProducerSearchList result = new ProducerSearchList();
  		result.add(this);
  		return result;
  	}
}


