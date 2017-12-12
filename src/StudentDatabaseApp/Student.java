package StudentDatabaseApp;
import java.util.Scanner;

public class Student {

	private String firstName;
	private String lastName;
	private int gradeYear;
	private int studentID = 0;
	private String courses = "";
	private int studentPayment;
	private int tuitionBalance = 0;
	private static int costOfcourse = 600;
	private static int id = 1000;
	
	// Constructor: prompt user to enter student's name and year
	public Student() {	
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter student's first name: ");
		this.firstName = in.next();
		
		// Ask for student's last name
		System.out.print("Enter student's last name: ");
		this.lastName = in.next();
		
		// Ask for student's class level
		System.out.print("1 - New\n2 - Beginner\n3 - Junior \n4 - Mid\n5 - Senior\nEnter student's class level: ");
		this.gradeYear = in.nextInt();
		
		setStudentId();
		System.out.println("You added a new Student " + firstName + " " + lastName + " with level of " + gradeYear + ". " + "\nStudent's ID is " + studentID);
		
		
	}
	
	// Generate an ID
	public void setStudentId() {
		id++;
		this.studentID = id;
	}
	
	// Enroll in courses
	public void enroll() {
		// Get inside a loop, user hits 0
		do {
			System.out.print("Enter course to enroll (Q to quit): ");
			Scanner in = new Scanner(System.in);
			String course = in.nextLine();
			String quit = "q";
			quit.toUpperCase();
			
			if (!course.equals(quit)) {
				this.courses = courses + "\n" + course;
				tuitionBalance += costOfcourse;
			}
			else {
				break;
			}
		} while (1 != 0);
		System.out.println("Enrolled in " + courses);
		System.out.print("Tuition balance: " + tuitionBalance);
	}
	
	// View balance
	public void vewBalance() {
		System.out.print("Your balance is $" + tuitionBalance);
	}
	// Pay Tuition
	public void payTuition() {
		System.out.print("\nHow much would you like to pay now? $");
		Scanner in = new Scanner(System.in);
		this.studentPayment = in.nextInt();
		
		tuitionBalance -= studentPayment;
		System.out.println("Thank you for your payment of $" + studentPayment + ".");
		System.out.println("\nYour tuition balance is $" + tuitionBalance + ".");
	}
	// Show status of courses
	public void showCourses() {
		System.out.println("\nYou already enrolled in " + courses + "\n");
	}
	// Show status
	public String showStatus() {
		return firstName + " " + lastName + "\n" 
				+ "The ID of student: " + studentID
				+ "/nYour Balance: $" + tuitionBalance
				+ "/nYour courses: " + courses;
	}
}
