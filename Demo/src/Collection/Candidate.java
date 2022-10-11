package Collection;

public class Candidate {
	int eid;
	String stream;
	String company;
	public Candidate(int eid,String stream,String company) {
		this.eid=eid;
		this.stream=stream;
		this.company=company;
	}
	@Override
	public String toString() {
		return "Id :"+this.eid+" Stream :"+this.stream+" Company :"+this.company;
	}
}
