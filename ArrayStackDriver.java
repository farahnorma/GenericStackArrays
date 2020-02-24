import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.*;
import java.io.*;
public class ArrayStackDriver
{

public static void main (String a[]) throws FileNotFoundException

{
	long startTime = System.currentTimeMillis();
	Scanner sc = new Scanner(new File("TestNumbers.txt"));
	Stack <Integer> t = new ArrayStack<Integer>();
	while(sc.hasNextInt()){
		  t.push(sc.nextInt());
		}
	System.out.println("The following items pushed to Stack as of now:");
		for (Integer i : t)
			System.out.println(i);
	System.out.println("The array has grown " +ArrayStack.count+ " times.");	
	System.out.println(+t.pop()+ " was removed from the stack.");
	System.out.println(+t.pop()+ " was removed from the stack.");
	System.out.println(+t.pop()+ " was removed from the stack.");
	System.out.println(+t.pop()+ " was removed from the stack.");
	System.out.println(+t.pop()+ " was removed from the stack.");
	System.out.println("Peeking into the stack shows " +t.peek()+ " at the top.");
	t.push(121);
	t.push(122);
	t.push(123);
	t.pop();
	System.out.println("The last item popped in question 4f is "+t.pop());
	System.out.println("Peeking into the stack now shows "+t.peek()+ " is at the top.");
	
	
	/*Scanner scanner = new Scanner(new File("TestAddresses.txt"));
	Stack <String> s = new ArrayStack<String>();
	while(scanner.hasNextLine()){
	   s.push(scanner.nextLine());
	}
	System.out.println("The following items pushed to Stack as of now:");
	for (String i : s)
		System.out.println(i);*/
	Stack <Address> s = new ArrayStack<Address>();
	s.push(new Address("2802 Brittany Ln", "Opelika", "Alabama(AL)", "36804"));
	s.push(new Address("14515 N Custer Ct", "Mead", "Washington(WA)", "99021"));
	s.push(new Address("638 SW Dexter Cir #204", "Lake City", "Florida(FL)", "32025"));
	s.push(new Address("120 32nd St #APT 3J", "Union City", "New Jersey(NJ)", "07087"));
	s.push(new Address("466 Bamboo Ln", "Jesup", "Georgia(GA)", "31546"));
	s.push(new Address("4009 Euclid Rd", "Interlochen", "Michigan(MI)", "49643"));
	s.push(new Address("973 Finn Way", "Brentwood", "California(CA)", "94513"));
	s.push(new Address("665 E 1275th", "N Shelley", "Idaho(ID)", "83274"));
	s.push(new Address("323 Carr St", "Hillsboro", "Texas(TX)", "76645"));
	
	System.out.println("The following items pushed to Stack as of now: " );
	for (Address i : s)
		System.out.println(i);
	System.out.println("The array has grown " +ArrayStack.count+ " times.");
	s.pop();
	s.pop();
	System.out.println("The last object to be popped in question 6 is: " +s.pop());
	System.out.println("A peek into the stack shows " +s.peek()+ " is currently at the top of the stack.");
	

		
		long endTime = System.currentTimeMillis();
		System.out.println("The program took "+(endTime - startTime) + " ms to complete");
		System.out.println("The stack is size: "+s.size());
		}
	
}


		
		