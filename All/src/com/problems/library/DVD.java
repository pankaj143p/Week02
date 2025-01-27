package src.com.problems.library;
// DVD Class extends LibraryItem
class DVD extends LibraryItem implements Reservable {
    public DVD(int itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 3; // DVDs can be loaned for 3 days
    }

    @Override
    public void reserveItem() {
        System.out.println("DVD '" + getTitle() + "' reserved.");
    }

    @Override
    public boolean checkAvailability() {
        // Simple availability check for DVD (always available)
        return true;
    }
}