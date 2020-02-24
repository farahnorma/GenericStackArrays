public interface Stack <T> extends Iterable <T>
{
	public T peek(); 
	public T pop(); 
	public void push(T itm); 
	public boolean isEmpty(); 
	public int size(); 
	}