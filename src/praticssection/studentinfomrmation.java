package praticssection;

// Class 1 - Student Information (Vicky)
class StudentInformation1 {
    String name = "Vicky";
    int rollNo = 143;
    String gmailId = "vickypatil@gmail.com";
    
    // Method to display student info
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Gmail ID: " + gmailId);
        System.out.println("---------------");
    }
}

// Class 2 - Student Information (Dy Pachal)
class StudentInformation2 {
    String name = "Dy Pachal";
    int rollNo = 123;
    String gmailId = "dy.pachal@gemail.com";
    
    // Method to display student info
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Gmail ID: " + gmailId);
        System.out.println("---------------");
    }
}

// Class 3 - Student Information (Sandip Dasture)
class StudentInformation3 {
    String name = "Sandip Dasture";
    int rollNo = 121;
    String gmailId = "sandipdasture@gemail.com";
    
    // Method to display student info
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Gmail ID: " + gmailId);
        System.out.println("---------------");
    }
}

public class studentinfomrmation {
    public static void main(String[] args) {
        // Create instances of each student class
        StudentInformation1 si1 = new StudentInformation1();
        StudentInformation2 si2 = new StudentInformation2();
        StudentInformation3 si3 = new StudentInformation3();
        
        // Display student information using displayInfo method
        si1.displayInfo();
        si2.displayInfo();
        si3.displayInfo();
    }
}
