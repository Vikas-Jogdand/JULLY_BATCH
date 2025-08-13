 package student;

public class studentinformation {
    String name = "Vicky";
    int rollno = 143;
    String gemailid = "jogdandvikas28@gmail.com";

    void display() {
        System.out.println(name + " " + rollno + " " + gemailid);
    }

    // Static inner class so we can create it from main without outer object
    static class Student2 {
        String name = "DYPATIL";
        int rollno = 123;
        String gemailid = "dypatil@gmail.com";

        void show() {
            System.out.println(name + " " + rollno + " " + gemailid);
        }
    }

    public static void main(String[] args) {
        studentinformation s = new studentinformation();
        s.display();

        Student2 s2 = new Student2();
        s2.show();
    }
}

  




