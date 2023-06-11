package packageone;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		
		System.out.println( " Enter first number");
		
		int num1 = sc.nextInt();
		
		System.out.println( " Enter second number ");
		
		
		int num2 = sc.nextInt();
		
		System.out.println( " Enter third number ");
		
		int num3 = sc.nextInt();
		
		System.out.println(" Multiplication is "+ (num1*num2*num3));
		
	}

}
