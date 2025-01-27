package src.com.problems.library;
// Magazine Class extends LibraryItem
class Magazine extends LibraryItem implements Reservable {
    public Magazine(int itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 7; // Magazines can be loaned for 7 days
    }

    @Override
    public void reserveItem() {
        System.out.println("Magazine '" + getTitle() + "' reserved.");
    }

    @Override
    public boolean checkAvailability() {
        // Simple availability check for Magazine (always available)
        return true;
    }
}