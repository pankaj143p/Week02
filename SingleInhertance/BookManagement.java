/*
Sample Problem 1: Library Management with Books and Authors
Description: Model a Book system where Book is the superclass, and Author is a subclass.
Tasks:
Define a superclass Book with attributes like title and publicationYear.
Define a subclass Author with additional attributes like name and bio.
Create a method displayInfo() to show details of the book and its author.
Goal: Practice single inheritance by extending the base class and adding more
specific details in the subclass.

 */
package SingleInhertance;
class Book{
    String title;
    int publicationYear;
    Book(String title, int publicationYear){
        this.title=title;
        this.publicationYear=publicationYear;
    }
    public void displayInfo(){
        System.out.println("Book title: "+title);
        System.out.println("publication year of "+title+" is: "+publicationYear);
    }

    protected void Author(String title, int publicationYear) {
    }
}
class Author extends Book{
    private String name;
    private String bio;
    Author(String title, int publicationYear, String name, String bio){
        super(title,publicationYear);
//        super.Author(title,publicationYear);
        this.name=name;
        this.bio=bio;
    }
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Author Details: ");

        System.out.println("Name: "+name+"\n"+"about "+name+" "+bio);
    }
}
public class BookManagement {
    public static void main(String[] args) {
//    Book b,a;
        Book b = new Book("ABC", 2023);
        Book a = new Author("C++", 2001, "Sumita Arrora", "I have good knowladge in c++");
        b.displayInfo();
        a.displayInfo();
    }
}
