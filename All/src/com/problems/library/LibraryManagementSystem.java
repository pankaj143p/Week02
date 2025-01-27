package src.com.problems.library;
// Main class to demonstrate the Library Management System
public class LibraryManagementSystem {
    public static void main(String[] args) {
        // Creating instances of different library items
        LibraryItem book = new Book(101, "The Great Gatsby", "F. Scott Fitzgerald");
        LibraryItem magazine = new Magazine(102, "Time Magazine", "Time Inc.");
        LibraryItem dvd = new DVD(103, "Inception", "Christopher Nolan");

        // Displaying item details
        System.out.println(book.getItemDetails());
        System.out.println("Loan Duration: " + book.getLoanDuration() + " days");

        System.out.println(magazine.getItemDetails());
        System.out.println("Loan Duration: " + magazine.getLoanDuration() + " days");

        System.out.println(dvd.getItemDetails());
        System.out.println("Loan Duration: " + dvd.getLoanDuration() + " days");

        // Reserving items
        if (book instanceof Reservable) {
            Reservable reservableBook = (Reservable) book;
            if (reservableBook.checkAvailability()) {
                reservableBook.reserveItem();
            } else {
                System.out.println("Book is not available for reservation.");
            }
        }

        if (magazine instanceof Reservable) {
            Reservable reservableMagazine = (Reservable) magazine;
            if (reservableMagazine.checkAvailability()) {
                reservableMagazine.reserveItem();
            } else {
                System.out.println("Magazine is not available for reservation.");
            }
        }

        if (dvd instanceof Reservable) {
            Reservable reservableDVD = (Reservable) dvd;
            if (reservableDVD.checkAvailability()) {
                reservableDVD.reserveItem();
            } else {
                System.out.println("DVD is not available for reservation.");
            }
        }
    }
}