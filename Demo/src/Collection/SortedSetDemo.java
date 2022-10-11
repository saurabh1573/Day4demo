package Collection;
import java.util.*;
public class SortedSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> s=new TreeSet<>();
		s.add(46);
		s.add(12);
		s.add(4563);
		s.add(-45);
		s.add(-3);
		Spliterator<Integer> x=s.spliterator();
		x.forEachRemaining(System.out::println);
		System.out.println(x.getClass());
		System.out.println(x.getComparator());
		System.out.println(s);
		System.out.println(s.pollFirst());
		System.out.println(s);
		System.out.println(s.pollLast());
		System.out.println(s);
	}

}
