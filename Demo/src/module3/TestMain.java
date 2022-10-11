package module3;

public class TestMain implements NestedInterface.NestedInterface2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParticipantA p1=new Hybrid();
		String company1=p1.company();
		System.out.println(company1);
		p1.methodA(1356245, "Java", "Apparel");
		ParticipantB p2=new Hybrid();
		String company2=p1.company();
		System.out.println(company2);
		p2.methodA(1356246, "SAP", "Medica");
		NestedInterface.NestedInterface2 tm=new TestMain();
		tm.call();
		//tm.NestedInterface2 t= new TestMain();
		//tm.N
		
	}

}
