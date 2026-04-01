public class Bookexp {

    public static void main(String[] args) {
        Bookoop book1 = new Bookoop("Golmaal", "sai", "102");
        Bookoop b1 = new Bookoop("Java Basics", "Sai", "101");

        book1.borrowBook();
        book1.borrowBook();
        book1.returnBook();
        book1.returnBook();
        b1.borrowBook();
    }
};