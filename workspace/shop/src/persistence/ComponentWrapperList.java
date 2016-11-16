package persistence;

import java.util.*;

public class ComponentWrapperList  extends ComponentWrapperSearchList{

	protected ComponentWrapperList() {
		super();
	}
	public Iterator<ComponentWrapper4Public> iterator(PersistentListProxi<ComponentWrapper4Public> listProxi) {
		return new PersistentListIterator<ComponentWrapper4Public>(listProxi, this.data);
	}
	public long getLength(){
		return this.data.size();
	}
	public void add (ComponentWrapper4Public entry) {
		this.data.add(entry);
	}
	@SuppressWarnings("unchecked")
	public ComponentWrapperList copy() {
		ComponentWrapperList result = new ComponentWrapperList();
		result.data = (Vector<ComponentWrapper4Public>)this.data.clone();
		return result;
	}


}


