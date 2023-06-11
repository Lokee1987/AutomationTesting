package packageone;

public class SumOfArray {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {10, 25,15,20,40,12};
	
	
		int add=0;
		for (int s : arr) {
			add = add+s;			
		}

		System.out.println("Sum = " +add);
	}

}
