import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StackTest {

	@Test
	void testPeek() {
		Stack <Integer> s = new ArrayStack<Integer>();
		s.push(2);
		s.push(3);
		s.peek();
		assertTrue(s.peek()== 3);
	}
	

	@Test
	void testPop() {
		Stack <Integer> s = new ArrayStack<Integer>();
		s.push(2);
		s.push(4);
		s.pop();
		assertTrue(s.pop()==2);
	}

	@Test
	void testPush() {
		Stack <Integer> s = new ArrayStack<Integer>();
		s.push(2);
		assertTrue(s.pop()==2);
	}

	@Test
	void testIsEmpty() {
		Stack <Integer> s = new ArrayStack<Integer>();
		s.isEmpty();
		assertTrue(s.isEmpty()==true);
	}

	@Test
	void testSize() {
		Stack <Integer> s = new ArrayStack<Integer>();
		s.push(1);
		s.push(100);
		s.push(7);
		assertTrue(s.size()==3);
	}
}
	