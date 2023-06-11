package packageone;

public class ArrayReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "Good Morning Arjun";
		
		String [] arr = a.split(" ");
		
		System.out.println(arr.length);
		
		for (int i=arr.length-1; i>=0; i--)
		{
		System.out.println(arr[i]+ " ");
		}
	}

}
