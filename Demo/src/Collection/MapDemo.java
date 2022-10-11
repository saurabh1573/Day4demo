package Collection;
import java.util.*;
public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NavigableMap<Integer,String> map=new TreeMap<>();
		map.put(101,"Shyam");
		map.put(102,"Raju");
		map.put(10, "Babu Bhaiya");
		map.put(104, "Aman");
		map.put(104, "Manav");
		//NavigableMap<Integer,String>
		map=map.descendingMap();
		for(String x:map.values()) {
			System.out.println(x);
		}
		map.putIfAbsent(104,"Rahul");
		System.out.println(map.get(100));
		System.out.println(map.getOrDefault(105, "garbage"));
		map.replace(101,"Shyam","Sunder");
		
		Map<Integer,String> m=map.headMap(103, true);
		Map<Integer,String> m1=map.tailMap(103, true);
		Map<Integer,String> m3=map.subMap(103, 10);
		System.out.println(m1+"\n"+m3+"\n"+m);
		/*Iterator it=map.entrySet().iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}*/
		for(Map.Entry<Integer, String> e:map.entrySet()) {
			System.out.println(e.getKey()+" : "+e.getValue());
		}
		/*
		map.entrySet().stream()
		.sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
		.forEach(System.out::println);*/
	}

}
