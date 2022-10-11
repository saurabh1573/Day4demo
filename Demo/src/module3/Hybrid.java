package module3;

public class Hybrid implements ParticipantA, ParticipantB {
	@Override 
	public String company() {
		return "Accenture";
	}

	/*@Override
	public void methodB(int eid, String stream, String project) {
		// TODO Auto-generated method stub
		System.out.println("Employee ID: "+eid+" Stream :"+stream+" Project Name :"+project);
	}*/

	@Override
	public void methodA(int eid, String stream, String project) {
		// TODO Auto-generated method stub
		System.out.println("Employee ID: "+eid+" Stream :"+stream+" Project Name :"+project);
	}
	//@Override

}
