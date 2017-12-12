package StudentDatabaseApp;
import java.util.Scanner;

public class Student {

	private String firstName;
	private String lastName;
	private int gradeYear;
	private int studentID;
	private String courses;
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
				courses = courses + "\n" + course;
				tuitionBalance += costOfcourse;
			}
			else {
				break;
			}
		} while (1 != 0);
		System.out.println("Enrolled in: " + courses);
		System.out.println("Tuition balance: " + tuitionBalance);
	}
	// View balance
	
	// Pay Tuition
	
	// Show status
}
