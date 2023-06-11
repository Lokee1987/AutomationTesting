package packageone;

import java.util.Scanner;

public class ScannerFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		
		System.out.println(" Enter value ");
		
		int FactorialValue = 1;
		
		int value = sc.nextInt();
		 for (int i=0; i<=value; i--) {
			 FactorialValue = FactorialValue * i;
			 i--;
		 }
		 
		 
		
		System.out.println(" Factorial of the given value is " + FactorialValue);
		
	}

}
