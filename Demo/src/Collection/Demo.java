package Collection;

import java.util.Comparator;

public class Demo implements Comparator<T> {
	private int busno;
	private String source;
	private String destination;
	private int runningtime;
	public int getBusno() {
		return busno;
	}
	public void setBusno(int busno) {
		this.busno = busno;
	}
	public String getSource() {
		return source;
	}
	public int getRunningtime() {
		return runningtime;
	}
	public void setRunningtime(int runningtime) {
		this.runningtime = runningtime;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	
	public Demo(int busno,String source,String destination,int runningtime) {
		this.busno=busno;
		this.source=source;
		this.destination=destination;
		this.runningtime=runningtime;
	}
}
