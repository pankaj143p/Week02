package assistedProblems;
// create a Animal class with some attributes
class Animal{
     String name;
     int age;
     // create a constructor to initialize the attributes
    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }
    //  @Override
     public void makeSound(){
        System.out.println("All animals have different sound");
     }
} 
// create a Dog class which extends Animal class
class Dog extends Animal{
    Dog(String name, int age){
        super(name, age);
    }
    @Override
    public void makeSound(){
        System.out.println("Dog barks");
    }
}
// create a Cat class which extends Animal class
class Cat extends Animal{
    Cat(String name, int age){
        super(name, age);
    }
    @Override
    public void makeSound(){
        System.out.println("Cat meows");
    }
}
// create a Bird class which extends Animal class
class Bird extends Animal{
    Bird(String name, int age){
        super(name, age);
    }
    @Override
    public void makeSound(){
        System.out.println("Bird chirps");
    }
}
public class AnimalHeirarchy {
    public static void main(String[] args) {
       Animal a = new Animal("Animal", 10);
       a.makeSound();
       Animal d = new Dog("Dog", 5);
       Animal c = new Cat("Cat", 3);
       Animal b = new Bird("Bird", 2);
       d.makeSound();
       c.makeSound();
       b.makeSound();
    }
    
}
