package Collection;
import java.util.*;
public class CompareDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> list=new ArrayList<>();
		list.add(new Employee(101,"Jatin",60000.00));
		list.add(new Employee(102,"Nitin",65000.00));
		list.add(new Employee(103,"Mahesh",6000.00));
		list.add(new Employee(104,"Jatin",60000.00));
		Collections.sort(list);
		list.forEach(System.out::println);
		Spliterator x=list.spliterator();
		x.forEachRemaining(System.out::println);
	}

}
