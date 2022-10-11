package Collection;
import java.util.*;
public class LinkedHashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> s=new HashSet<>();
		Set<Integer> s1=new TreeSet<>();
		//s.add(null);
		//s1.add(Integer.valueOf(null));
		s.add(-5);
		s.add(-5);
		s1.add(-5);
		s1.add(-5);
		s.add(-30);
		s1.add(-30);
		System.out.println(s);
		System.out.println(s1);
		
	}

}
