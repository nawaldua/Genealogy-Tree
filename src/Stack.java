import java.util.EmptyStackException;
import java.util.List;

public class Stack<T> implements StackADT<T> {

	private LinkedList<T> list;
	//Constructor
	public Stack()
	{
		this.list =  new LinkedList<T>();
	}
	public boolean isEmpty() {
		//return isEmpty method of list
		return list.isEmpty();
	}

	public void push(T data) throws IllegalArgumentException {
		//Add data to the top of the stack
		if (list.isEmpty())
		{
			list.add(data);
		}
		else list.add(1,data);
	}

	public T peek() throws EmptyStackException {
		//Returns top item of the stack but doesn't remove it
		return list.get(1);
	}

	public T pop() throws EmptyStackException {
		//Remove the item that is the top of the stack
		return list.remove(1);
	}

	public StackADT reverse() {
		//Create new stack to store reversed items
		StackADT<T> revStack = new Stack<T>();
		//Call iterator from list
		LinkedListIterator<T> itr = list.iterator();
		//Check if iterator has next
		while (itr.hasNext())
		{
			//Add the next data to the new Stack
			revStack.push(itr.next());
		}
		return revStack;
	}

}
