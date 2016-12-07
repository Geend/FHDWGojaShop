package persistence;

import java.util.*;

public class BackgroundTaskList {

	protected Vector<BackgroundTask4Public> data; //List of proxies
	protected BackgroundTaskList() {
		this.data = new Vector<BackgroundTask4Public>();
	}
	public Iterator<BackgroundTask4Public> iterator(PersistentListProxi<BackgroundTask4Public> listProxi) {
		return new PersistentListIterator<BackgroundTask4Public>(listProxi, this.data);
	}
	public long getLength(){
		return this.data.size();
	}
	public void add (BackgroundTask4Public entry) {
		this.data.add(entry);
	}
	@SuppressWarnings("unchecked")
	public BackgroundTaskList copy() {
		BackgroundTaskList result = new BackgroundTaskList();
		result.data = (Vector<BackgroundTask4Public>)this.data.clone();
		return result;
	}


}


