class Book{
    private String title;
    private String author;
    private int price;
    Book(){
        title="Ikagai01";
        author="Sadguru";
        price=140;
    }
    Book(String title, String author, int price){
        this.title=title;
        this.author=author;
        this.price=price;
        // create a method to display the book details
    }
    private void display(){
        System.out.println("Book Title: "+title);
        System.out.println("Book author: "+author);
        System.out.println("Book Price: "+price);

    }
    public static void main(String[] args) {
        Book e1,e2;
        e1=new Book("Ikigai","Sadguru",200);
        e2=new Book();
        e1.display();
        e2.display();
    }
}