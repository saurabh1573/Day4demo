package Collection;
import java.util.*;
public class ArrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Candidate c1=new Candidate(1,"Java","Accenture");
		Candidate c2=new Candidate(2,"SAP","Accenture");
		Candidate c3=new Candidate(3,"Salesforce","Accenture");
		ArrayList<Candidate> details=new ArrayList<>();
		ArrayList<Candidate> detail=new ArrayList<>();
		details.add(c1);
		details.add(c2);
		detail.add(c3);
		detail.addAll(details);
		for(Candidate c:detail) {
			System.out.println(c);
		}
		detail.removeIf(Candidate -> Candidate.stream=="SAP");
		Iterator<Candidate> it=detail.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		//details.forEach(System.out::println);
	}

}
