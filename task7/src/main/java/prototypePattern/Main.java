package prototypePattern;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the student roll number");
		int rollNumber = sc.nextInt();
		System.out.println("Enter students first name");
		String firstName = sc.next();
		System.out.println("Enter the students last name");
		String lastName = sc.next();
		System.out.println("Enter the students marks out of 100");
		double marks = sc.nextDouble();
		UserDetails s1 = new UserDetails(rollNumber, firstName, lastName, marks);
		s1.showDetails();
		UserDetails s2 = (UserDetails)s1.getClone();
		s2.showDetails();
	}
}
