package semester_3;

import java.util.Scanner;

public class Even_numbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a limit:");
		int num = sc.nextInt();
		System.out.println("The even numbers are: ");
		for (int i=0;i<=num;i+=2) {
				System.out.print(i + "\t");
		}
		sc.close();
	}

}
