package DAY_1;

import java.util.Scanner;

public class Student {
	
	int roll;
	String Name;
	float mark;
	
	public void input() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Roll number : ");
		roll=sc.nextInt();
		System.out.print("Enter Name : ");
		Name=sc.next();
		System.out.print("Enter Mark : ");
		mark=sc.nextFloat();
	}
	public void display() {
		System.out.println("-------------------");
		System.out.println("roll number : "+roll);
		System.out.println("Name : "+Name);
		System.out.println("Mark : "+mark);
	}

	public static void main(String[] args) {

		Student st=new Student();
		st.input();
		st.display();
	}

}
