package semester_3;

class Main {
	public void Add (int a,int b) {
		int Add = a + b;
		System.out.println("Sum of two integers : " + Add);
	}
	public void Add (int a,int b,int c) {
		int Add = a + b + c;
		System.out.println("Sum of three integers : " + Add);
	}
	public void Add (double a,double b) {
		double Add = a + b;
		System.out.println("Sum of two double values : " + Add);
	}
	public void Add (String word,int a) {
		String Add = word + a;
		System.out.println("Concatenation of String and integer : " + Add);
	}
}
public class Calculator {
	public static void main(String [] args) {
		Main main = new Main();
		main.Add(5,50);
		main.Add(55,50,55);
		main.Add(5.5234,5.5345);
		main.Add("empuran",2);		
	}

}
