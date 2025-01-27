package src.com.problems.library;
// Book Class extends LibraryItem
class Book extends LibraryItem implements Reservable {
    public Book(int itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 14; // Books can be loaned for 14 days
    }

    @Override
    public void reserveItem() {
        System.out.println("Book '" + getTitle() + "' reserved.");
    }

    @Override
    public boolean checkAvailability() {
        // Simple availability check for Book (always available)
        return true;
    }
}