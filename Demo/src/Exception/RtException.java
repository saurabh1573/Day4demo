package Exception;
import module3.TestMain;
public class RtException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int l=50/0;
		try {
			String x=null;
			x.charAt(0);
		try {
		int a[]=new int[9];
		System.out.println(" "+a[10]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e+" 89");
		}
		try {
		int z=Integer.parseInt("x");
		}
		catch(NumberFormatException e) {
			System.out.println(e);
		}
		}
		
		catch(NullPointerException e) {
			System.out.println(e);
		}
		
		catch(Exception e) {
			System.out.println(e);
		}
		finally{
					}
		
		
		//String x;
		
	}

}
