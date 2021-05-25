package Day8;
import java.util.Scanner;
/*
 WAP to demonstrate
-class obj
-array of obj
-diffnt method
-constructor
-constructor/method overloading
 */

class Classroom{
	
	private byte rollNo;
	private String name;
	private int marks ;
	
	public Classroom(byte rollNo, String name, int marks) {					//parameterized constructor
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
	}
	
	void getData() {
		System.out.println("Name of Student : "+name);
		System.out.println("Roll no : "+rollNo);
		System.out.println("Obtained marks : "+marks);
		}
}

class Helper{
	static Scanner sc = new Scanner(System.in);
	
	byte setRollno() {
		System.out.print("Enter the Roll no :");
		byte rollNo = sc.nextByte();
		return rollNo;
	}
	
	String setName() {
		System.out.print("Enter the Name :");
		sc.nextLine();
		String name = sc.nextLine();
		return name;
	}
	
	int setMarks() {
		System.out.print("Enter Marks : ");
		int marks = sc.nextInt();
		return marks;
	}
	
}


public class testMain {

	public static void main(String[] args) {
		Classroom student[] = new Classroom[3];
		Helper hlp = new Helper();
		
		for (int i = 0 ; i < 3 ; i++) {
			if(i == 0)
				System.out.println("Enter 1st Student Data :");
			if(i == 1)
				System.out.println("Enter 2nd Student Data :");
			if(i == 3)
				System.out.println("Enter 3rd Student Data :");
			byte rollNo = hlp.setRollno();
			String name = hlp.setName();
			int marks = hlp.setMarks();
			student[i] = new Classroom (rollNo,name,marks);
		}
		System.out.println("\n Entered Data is :\n");
		for (int i = 0 ; i < 3 ; i++) {
			student[i].getData();
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		}
	}

}
