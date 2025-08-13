package studentinformation;

// Student Information Class 1
class StudentInformation {
    String name = "Vicky";
    int rollNo = 143;
    String gmailId = "vickypatil@gmail.com";
    
    // Method to display student info
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Gmail ID: " + gmailId);
        System.out.println("---------------");
    }
}

// Student Information Class 2
class StudentInformation2 {
    String name = "Dy Pachal";
    int rollNo = 123;
    String gmailId = "dy.pachal@gemail.com";
    
    // Method to display student info
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Gmail ID: " + gmailId);
        System.out.println("---------------");
    }
}

// Student Information Class 3
class StudentInformation3 {
    String name = "Sandip Dasture";
    int rollNo = 121;
    String gmailId = "sandipdasture@gemail.com";
    
    // Method to display student info
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Gmail ID: " + gmailId);
        System.out.println("---------------");
    }
}

// Main Class to run the application
public class MainClass {
    public static void main(String[] args) {
        // Create instances of each student class
        StudentInformation si1 = new StudentInformation();
        StudentInformation2 si2 = new StudentInformation2();
        StudentInformation3 si3 = new StudentInformation3();
        
        // Display student information using displayInfo method
        si1.displayInfo();
        si2.displayInfo();
        si3.displayInfo();
    }
}
