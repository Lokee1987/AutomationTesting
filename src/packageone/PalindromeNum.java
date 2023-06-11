package packageone;

import java.util.Scanner;

public class PalindromeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter the number");

		int rem;

		int sum = 0;

		int num = sc.nextInt();

		int total = num;

		while (num > 0) {

		rem = num % 10;

		sum = sum * 10 + rem;

		num = num / 10;
		
		System.out.println("Rem=" + rem + " Sum = " + sum + "  num = " +num);

		}

		if (sum == total) {

		System.out.println("The number is a Palindrome");

		} else {

		System.out.println("The number is not a Palindrome");

		}


	
	}

}
