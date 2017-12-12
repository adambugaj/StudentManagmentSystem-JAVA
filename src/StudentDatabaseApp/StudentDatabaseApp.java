package StudentDatabaseApp;

import java.util.Scanner;

public class StudentDatabaseApp {

	public static void main(String[] args) {
		
		// Ask user how many students he wish to add
		System.out.println("Enter number of students to enroll: ");
		Scanner in = new Scanner(System.in);
		int numberStudent = in.nextInt();
		Student[] students = new Student[numberStudent];
		
		for(int n = 0; n < numberStudent; n++) {
			// Ask how many new users we want to add
//			System.out.print(students[n]);
			students[n] = new Student();
			students[n].enroll();
			students[n].payTuition();
			students[n].showCourses();
		}
		
		for(int n = 0; n < numberStudent; n++) {
			System.out.println(students[n].showStatus());
		}
		
	}

}
