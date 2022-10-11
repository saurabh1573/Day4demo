package Collection;
import java.util.*;
public class QueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> q=new TreeSet<>();
		int[] a= {1,2,6,9};
		q.add(4);
		q.add(55);
		q.add(16);
		q.add(4);
		//q.addAll(a);
		q.pollFirst();
		q.pollLast();
		System.out.println(q);
		
	}

}
