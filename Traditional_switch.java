package semester_3;

public class Traditional_switch {
	public static void main(String[] args) {
		String grade = "A";
		
		switch (grade) {
			case "O":
				System.out.println("Outstanding Perfomance");
				break;
			case "A+":
				System.out.println("Excellent Perfomance");
				break;
			case "A":
				System.out.println("Very Good Perfomance");
				break;
			case "B+":
				System.out.println("Good Perfomance");
				break;
			case "B":
				System.out.println("Above average Perfomance");
				break;
			case "C":
				System.out.println("Average Perfomance");
				break;
			case "P":
				System.out.println("Pass");
				break;
			case "F":
				System.out.println("Fail");
				break;
			default :
				System.out.println("Invalid Grade");
				break;
		}
		
		System.out.println("Grade: "+ grade);
		
	}

}
