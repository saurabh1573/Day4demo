package Exception;
import java.io.IOException;
//import java.io.IOException;
import java.util.Scanner;


public class Throw extends Exception{
	public Throw() {
		super("Throws IOException ");
	}
	static void validate(long asset_id,long acess_id) throws Throw{
		Scanner sc=new Scanner(System.in);
		
		 String ch=sc.next();
		if(ch.equals("Y")) {
			throw new Throw();
			//System.out.println(asset_id+"  "+acess_id);
		}
		else {
			System.out.println("Not valid");
		}
	}
	
}
