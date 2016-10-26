package persistence;

import java.util.*;

public class ComponentList {

	protected Vector<PersistentComponent> data; //List of proxies
	protected ComponentList() {
		this.data = new Vector<PersistentComponent>();
	}
	public Iterator<PersistentComponent> iterator(PersistentListProxi<PersistentComponent> listProxi) {
		return new PersistentListIterator<PersistentComponent>(listProxi, this.data);
	}
	public long getLength(){
		return this.data.size();
	}
	public void add (PersistentComponent entry) {
		this.data.add(entry);
	}
	@SuppressWarnings("unchecked")
	public ComponentList copy() {
		ComponentList result = new ComponentList();
		result.data = (Vector<PersistentComponent>)this.data.clone();
		return result;
	}


}


