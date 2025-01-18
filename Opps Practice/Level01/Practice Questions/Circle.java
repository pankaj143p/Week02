class Circle{
    private double radius;
    // default constructor
    public Circle(){
        this(12.90);
    }
    // Parameterized constructor
    public Circle(double radius){
        this.radius=radius;
    }
    // Getter method for radius
    public double getRadius() {
        return radius;
    }
    // Setter method for radius
    public void setRadius(double radius) {
        this.radius = radius;
    }
    // area of circle
    public double area(double radius){
        return Math.PI*radius*radius;
    }
    public void display(){
        System.out.println("default constructor radius: "+getRadius());
        System.out.println("area of circle is: "+area(radius));
    }

    public static void main(String[] args) {
       Circle c1 = new Circle();
       Circle c2 = new Circle(33.4);
       c1.display();
       c2.display();
    }
}