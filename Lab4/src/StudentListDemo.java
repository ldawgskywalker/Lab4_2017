import java.util.Scanner;
public class StudentListDemo {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String fname, lname, email, major, fac, stuid;
		StudentList students = new StudentList();
		
		System.out.print("Input Student ID: ");
			stuid=kb.nextLine();
		System.out.print("Input First and Last names: ");
			fname = kb.nextLine();
			lname = kb.nextLine();
		System.out.print("Email: ");
			email = kb.nextLine();
		System.out.print("Major:");
			major = kb.nextLine();
		System.out.print("Faculty: ");
			fac = kb.nextLine();
		
		Student s = new Student(fname, lname, email, major, fac, stuid);
		students.add(s);
		students.add(s);
		students.sameMajor(major);
		
		kb.close();
		
	}
	
}
