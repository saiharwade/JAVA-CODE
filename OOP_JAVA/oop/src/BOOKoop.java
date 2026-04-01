class Bookoop {

    // -------- STATIC VARIABLE --------
    static int totalBooks = 0;

    // -------- INSTANCE VARIABLES --------
    String title;
    String author;
    String isbn;
    boolean isBorrowed;

    // -------- DEFAULT CONSTRUCTOR --------
    Bookoop() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.isbn = "0000";
        this.isBorrowed = false;
        totalBooks++;
    }

    // -------- PARAMETERIZED CONSTRUCTOR --------
    Bookoop(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isBorrowed = false;
        totalBooks++;
    }

    // -------- INSTANCE METHOD --------
    void borrowBook() {
        if (!isBorrowed) {
            isBorrowed = true;
            System.out.println(title + " has been borrowed.");
        } else {
            System.out.println(title + " is already borrowed.");
        }
    }

    // -------- INSTANCE METHOD --------
    void returnBook() {
        if (isBorrowed) {
            isBorrowed = false;
            System.out.println(title + " has been returned.");
        } else {
            System.out.println(title + " was not borrowed.");
        }
    }

    // -------- STATIC METHOD --------
    static int getTotalBooks() {
        return totalBooks;
    }
}

//// -------- MAIN CLASS --------
//public class BOOKoop {
//    public static void main(String[] args) {
//
//        Bookoop b1 = new Bookoop("Java Basics", "Sai", "101");
//        Bookoop b2 = new Bookoop("Python Guide", "Rahul", "102");
//        Bookoop b3 = new Bookoop(); // default constructor
//
//        b1.borrowBook();
//        b1.returnBook();
//
//        System.out.println("Total Books: " + Bookoop.getTotalBooks());
//    }
//}


//class BOOKoop{
//
//
//    static int totalBooks = 0;
//
//    String title;
//    String author;
//    int isbn;
//    boolean borrowed;
//
//    BOOKoop(){
//        this.title = "Unknown";
//        this.author = "Unknown";
//        this.isbn = 0000;
//        this.borrowed = false;
//        totalBooks++;
//    }
//
//    BOOKoop(String Title,String Author,int Isbn){
//        this.title = Title;
//        this.author = Author;
//        this.isbn = Isbn;
//        this.borrowed = false;
//    }
//
//
//    void borrowBook(){
//        if(!borrowed){
//            borrowed = true;
//            System.out.print("The Book has Been Borrowed");
//        }
//        else{
//            System.out.print("The Book is Already Borrowed");
//        }
//
//    }
//
//    void ReturnBook(){
//        if(borrowed){
//            borrowed = false;
//            System.out.print("The Book has Been Returned");
//        }
//        else{
//            System.out.print("The Book is Already Returned");
//        }
//    }
//
//    static int booksCount(){
//        return totalBooks;
//    }
//
//}
