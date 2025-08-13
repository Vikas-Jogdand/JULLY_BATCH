package praticssection;

class Student 
{
	String name;
	int rollNo;
	static String collegeName;

	// Constructor
	Student(String name, int rollNo) 
	{
		this.name = name;
		this.rollNo = rollNo;
	}

	// Static method to set college name
	static void setCollegeName(String cname) 
	{
		collegeName = cname;
	}

	// Method to display student info
	void display() {
		System.out.println("Name: " + name);
		System.out.println("Roll No: " + rollNo);
		System.out.println("College: " + collegeName);
		System.out.println("---------------");
	}
}

public class Main 
{
	public static void main(String[] args) 
	{
		// Set the college name once using static method
		Student.setCollegeName("MIT College");

		// Create 3 student objects
		Student s1 = new Student("Vikas", 101);
		Student s2 = new Student("Amit", 102);
		Student s3 = new Student("Sneha", 103);

		// Display student info
		s1.display();
		s2.display();
		s3.display();
	}
}
