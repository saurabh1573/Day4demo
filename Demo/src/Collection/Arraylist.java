package Collection;
import java.util.*;
public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> names=new ArrayList<>();
		//Set<String> name=new HashSet<>();
		names.add("Ankit");
		names.add("Utpal");
		names.add("Varun");
		Iterator<String> it=names.iterator();
		System.out.println(names.size());
		//Iterator<String> itr=name.iterator();
		for(String a:names) {
			System.out.print(a);
		}
		names.forEach(System.out::println);
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		

		
	}

}
