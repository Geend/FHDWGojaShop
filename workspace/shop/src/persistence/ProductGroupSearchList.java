package persistence;

public class ProductGroupSearchList extends SearchListRoot<ProductGroup4Public> implements Iterable<ProductGroup4Public> {

	public ProductGroupSearchList(SearchListRoot<ProductGroup4Public> list){
		super(list);
	}
	public ProductGroupSearchList(){
		super();
	}
	
	public void add (ProductGroup4Public entry) {
		this.data.add(entry);
	}
	
	public void add(ProductGroupSearchList list) throws PersistenceException{
		java.util.Iterator<ProductGroup4Public> entries = list.iterator();
		while (entries.hasNext()){
			this.add(entries.next());
		}
	}
	public java.util.Iterator<ProductGroup4Public> iterator() {
		return this.data.iterator();
	}
  	public ProductGroupSearchList copy() throws PersistenceException {
  		ProductGroupSearchList result = new ProductGroupSearchList();
  		result.add(this);
  		return result;
  	}
}


