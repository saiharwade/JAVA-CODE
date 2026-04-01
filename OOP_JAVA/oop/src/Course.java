public class Course {

    static int maxCapacity = 100;

    String courseName;
    int enrollements = 0;

    String[] enrollStudents = new String[maxCapacity];

    void enrollStudent(String studName){
        enrollStudents[enrollements] = studName;
        enrollements++;
    }

    void unenrollStudent(String studName){
        int i = 0;
        int j = 0;
        String[] unenrollStud = new String[enrollements - 1];
        while(i < enrollements){
            if(enrollStudents[i] == studName){
                i++;
            }
            else{
                unenrollStud[j] = enrollStudents[i];
                i++;
                j++;
            }
        }
        enrollements--;
    }
}
