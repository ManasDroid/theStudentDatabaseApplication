package studentDatabaseApp;

import java.util.Scanner;

public class Student {
	
	private String firstname;
	private String lastname;
	private int gradeYear;
	private String courses = null;
	private String studentID;
	private int tuitionBalance;
	private static int costOfCourse = 600;
	private static int id = 1000;
	
	//Constructor : prompt user to enter the student's name and year
	public Student() {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter student first name:");
		this.firstname= in.nextLine();
		
		System.out.print("Enter student last name:");
		this.lastname= in.nextLine();
		
		System.out.print("1 - Freshman\n2- Sophomore\n3- Junior Year\n4 - Senior Year\nEnter student class level:  ");
		this.gradeYear= in.nextInt();
		setStudentID();
		
		
		
		
	}
	
	//Generate an Id
	private void setStudentID() {
		// Grade level + ID
		id++;
		this.studentID= gradeYear + "" + id;
		
	}
	
	//Enroll in  courses
	public void enroll() {
		 // Get inside a loop, user hits 0
		do {
		System.out.print("Enter course to enroll (Q to quit)");
		Scanner in = new Scanner(System.in);
		String course = in.nextLine();
		
		if(!course.equals("Q")) {
			courses = courses +"\n"+ course ;
		tuitionBalance = tuitionBalance + costOfCourse;
		}else {
			
			break;
			
		}
	}while( 1 !=0);
		
		
	}
	
	
	
	//View balance
	public void viewBalance() {
		System.out.println("Your Balance is : Rs"+tuitionBalance);
	}
	
	//Pay Tuition fees
	public void payTuition() {
		System.out.print("Enter your payment: Rs");
		Scanner sc = new Scanner(System.in);
		int payment = sc.nextInt();
		tuitionBalance = tuitionBalance - payment;
		System.out.println("Thank you for completing the payment of Rs:"+ payment);
		viewBalance();
	}
	
	//Show Status 
	public String toString() {
		return "Name: " + firstname + " " +lastname +
				"\nGrade level :"+gradeYear+
				"\nCourses Enrolled " + courses +
				"\nBalance :Rs"+tuitionBalance;
	}
	

}
