public class Course1 {

    // Static variable (same for all Course objects)
    static int maxCapacity = 100;

    // Instance variables (different for each Course object)
    String courseName;
    int enrollments = 0;

    // Array to store student names
    String[] enrolledStudents = new String[maxCapacity];

    // Constructor to set course name
    Course1(String courseName) {
        this.courseName = courseName;
    }

    // Method to enroll a student
    void enrollStudent(String studentName) {

        // Check if course is full
        if (enrollments < maxCapacity) {

            // Add student to array
            enrolledStudents[enrollments] = studentName;

            // Increase count
            enrollments++;

            System.out.println(studentName + " enrolled successfully.");
        } else {
            System.out.println("Course is full!");
        }
    }

    // Method to remove a student
    void unenrollStudent(String studentName) {

        int index = -1; // To store position of student

        // Find the student in array using ==
        for (int i = 0; i < enrollments; i++) {

            if (enrolledStudents[i] == studentName) {
                index = i; // store index if found
                break;
            }
        }

        // If student not found
        if (index == -1) {
            System.out.println("Student not found.");
            return;
        }

        // Shift all elements left to fill the gap
        for (int i = index; i < enrollments - 1; i++) {
            enrolledStudents[i] = enrolledStudents[i + 1];
        }

        // Remove last duplicate entry
        enrolledStudents[enrollments - 1] = null;

        // Decrease count
        enrollments--;

        System.out.println(studentName + " unenrolled successfully.");
    }

    // Static method to change max capacity for all courses
    static void setMaxCapacity(int capacity) {
        maxCapacity = capacity;
    }
}