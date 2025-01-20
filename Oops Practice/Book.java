public class Book {
    private static String libraryName = "City Library";
    private final String isbn;
    private String title;
    private String author;
    public Book(String title, String author, String isbn) {
        this.title = title;   
        this.author = author;
        this.isbn = isbn;    
    }

    // Static method to display the library name
    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    // Method to display book details (with instanceof check)
    public void displayBookDetails(Object obj) {
       
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("ISBN: " + isbn);
        } 
    

    // Static method to get the library name
    public static String getLibraryName() {
        return libraryName;
    }

    // Getter for ISBN (final variable, can't modify the value)
    public String getIsbn() {
        return isbn;
    }

    public static void main(String[] args) {
        // Create Book instances
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "978-0743273565");
        Book book2 = new Book("1984", "George Orwell", "978-524935");
        Book.displayLibraryName();
        book1.displayBookDetails(book1);
        book2.displayBookDetails(book2);
        System.out.println("Library Name (using static method): " + Book.getLibraryName());
    }
}
