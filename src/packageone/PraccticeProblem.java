package packageone;

public class PraccticeProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a= "abcdef";
		String b= "xyz1234";
		String c= "abcxy";
		
		int length = a.length();
		System.out.println("The length of A variable is " + length);
        
		
		String bUpperCase = b.toUpperCase();
		
		if (bUpperCase.contains("Z"))
			System.out.println(" b variable contains Z ");
		else 
			System.out.println("b variable contains z");
		
	}

}
