import java.util.EmptyStackException;
import java.lang.Iterable;
import java.util.*;
public class ArrayStack <T> implements Stack <T>
{
	public static double count = 0;
	private T container[];
	private int top;
	private final static int DEFAULT_SIZE = 1;
	public ArrayStack ()
	{
		this(DEFAULT_SIZE);
		}
	public ArrayStack (int initSize)
	{
		container = (T[]) new Object [initSize];
		top = -1;
		}
	public T peek()
	{
		if (top == -1)
			throw new EmptyStackException();
		return container[top];
		}
	public boolean isEmpty()
	{
		return (top == -1);
		}
	
	public T pop()
	{
		if (top == -1)
			throw new EmptyStackException();
		T itm = container[top];
		container[top--] = null;
		if(top > 0 && top == container.length / 4)
			resize (container.length/2);
		return itm;
		}
	
	public void push(T itm)
	{
		if (top == container.length - 1)
			resize(2* container.length);
		container[++top] = itm;
	}

	public int size()
	{
		return (top + 1);
	}

	private void resize (int newSize)
	{
		T t[] = (T[]) new Object[newSize];
		for (int i = 0; i <= top; i++)
			t[i] = container[i];
		container = t;
		count++;
	}

	public Iterator<T> iterator()
	{
		return new ArrayStackIterator();
	}
private class ArrayStackIterator implements Iterator <T>
{
	private int i = top;
	public boolean hasNext()
{
		return (i > -1);
}
	public T next()
{
		return container[i--];
		}
	}
}