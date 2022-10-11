package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FinallyClause1 {

	public static void input() {
		// TODO 1. close the scanner resource in finally clause
		int numbers[] = { 10, 20, 30, 40, 50 };
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter index to [1 - 6] to find the element stored at that index");
		try {
			int index = sc.nextInt();
			System.out.println(numbers[index]);
		} catch (IndexOutOfBoundsException | InputMismatchException e) {
			throw e;
		}
		finally {
			sc.close();
			System.out.println("in finally");
		}
	}

	public static void main(String[] args) {
		input();
	}
}

