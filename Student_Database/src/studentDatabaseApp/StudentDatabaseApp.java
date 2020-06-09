package studentDatabaseApp;

import java.util.Scanner;

public class StudentDatabaseApp {

	public static void main(String[] args) {
		
		
		//Ask how many new users are to be added.
		System.out.println("Enter of new number of students to enroll: ");
		Scanner sc = new Scanner(System.in);
		int numberOfStudents = sc.nextInt();
		
		Student[] students = new Student[numberOfStudents];
		
		
		
		//Create 'n' number of new users
		for(int i= 0; i<numberOfStudents; i++) {
			students[i] = new Student();
			students[i].enroll();
			students[i].viewBalance();
			students[i].payTuition();
			System.out.println(students[i].toString());
		}

	}

}
