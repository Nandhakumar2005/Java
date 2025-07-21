package semester_3;

import java.util.Scanner;

public class New_switch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String grade = sc.next();
		String result = switch (grade) {
		case "O" -> "Outstanding Perfomance";
		default -> "Invalid score";
		};
		System.out.println("result:" + result);
		sc.close();
	}

}
