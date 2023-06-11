package packageone;

import java.util.Scanner;

public class ScannerReverseNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num, rem;
		int sum =0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println( " Enter the Number ");
		
		num = sc.nextInt();
		
		while (num>0) {
		rem = num%10;
		sum=sum*10+rem;
		num=num/10;
		
		}
		System.out.println(" Reverse number is "+sum);
		
		
		
	}

}
