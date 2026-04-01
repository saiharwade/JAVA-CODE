class Student {

    // -------- STATIC VARIABLE --------
    static String collegeName = "ABC College";

    // -------- INSTANCE VARIABLES --------
    int id;
    String name;

    // -------- DEFAULT CONSTRUCTOR --------
    Student() {
        id = 0;
        name = "Unknown";
    }

    // -------- PARAMETERIZED CONSTRUCTOR --------
    Student(int i, String n) {
        id = i;
        name = n;
    }

    // -------- METHOD TO DISPLAY DATA --------
    void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", College: " + collegeName);
    }

    // -------- STATIC METHOD --------
    static void changeCollege(String newCollege) {
        collegeName = newCollege;
    }
}

// -------- MAIN CLASS --------
public class OOP {
    public static void main(String[] args) {

        // Using default constructor
        Student s1 = new Student();

        // Using parameterized constructor
        Student s2 = new Student(101, "Sai");
        Student s3 = new Student(102, "Rahul");

        // Display before change
        System.out.println("Before changing college:");
        s1.display();
        s2.display();
        s3.display();

        // Change static variable
        Student.changeCollege("XYZ College");

        // Display after change
        System.out.println("\nAfter changing college:");
        s1.display();
        s2.display();
        s3.display();
    }
}