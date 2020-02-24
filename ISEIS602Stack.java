import java.util.*;
import java.util.EmptyStackException;
public interface ISEIS602Stack<T>
{
	public void push(T element);	
	public T pop() throws EmptyStackException;	 
	public T peek() throws EmptyStackException;	
	public boolean isEmpty();
	public int size();
}

