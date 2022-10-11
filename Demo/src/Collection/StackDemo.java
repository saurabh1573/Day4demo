package Collection;
import java.util.*;
public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Candidate  c1=new Candidate(1,"a","c");
		Candidate  c2=new Candidate(2,"b","c");
		Candidate  c3=new Candidate(3,"d","c");
		Stack<Candidate> stack=new Stack<>();
		stack.push(c1);
		stack.push(c1);
		stack.push(c1);
		//stack.forEach(System.out::println);
		System.out.println(stack.pop());
	}

}
