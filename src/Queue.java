
public class Queue<T> implements QueueADT<T> {
	
	private LinkedList<T> list;
	
	//Constructor
	public Queue()
	{
		this.list =  new LinkedList<T>();
	}
	
	public boolean isEmpty() {
		//return isEmpty method of list
		return list.isEmpty();
	}

	public void enqueue(T data) throws IllegalArgumentException {
		//Queue an item into a list
		list.add(data);
	}

	public T dequeue() throws EmptyQueueException {
		//Removes the item that was first entered in the list of items
		return list.remove(1);
	}

	public T element() throws EmptyQueueException {
		//Shows the next item that is meant to be removed in the list
		return list.get(1);
	}

}
