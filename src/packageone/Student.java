package packageone;

public class Student {
	
	int a; int b;
	//Constructor with arguments
	
	 Student(int m1, int m2){
		
		a=m1; b=m2; }
	 void total()
	 { System.out.println(a+b); }
	 
	 void percentage()
	 {System.out.println((a+b)/2);
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student A = new Student(65,75);
		A.total();
		A.percentage();
		
		Student B = new Student (55, 65);
		B.total();
		B.percentage();
		
		

		}

}
