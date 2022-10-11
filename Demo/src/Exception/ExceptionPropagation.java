package Exception;

import java.io.IOException;

public class ExceptionPropagation {
	void training() {
		String x=null;
		System.out.println(x.length());
	}
	void part() {
		this.training();
	}
	void trainer() {
		try {
			part();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Throw t=new Throw();
		ExceptionPropagation exc=new ExceptionPropagation();
		exc.trainer();
		try {
		Throw.validate(546, 66773);
		}
		catch(Throw e) {
			System.out.println(e.getMessage());
		}
	}

}
