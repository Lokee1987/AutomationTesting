package packageone;

public class ScannerReverseString {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "Arjun and Aryan are brothers";
		
		String [] arr = a.split(" ");
		 System.out.println(arr.length);
		 
		 for (int i=arr.length-1; i>=0; i--) {
			
			 System.out.print(arr[i]+" ");
		 }
		 }

		 
	}


