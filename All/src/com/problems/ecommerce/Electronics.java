package src.com.problems.ecommerce;

public class Electronics extends Product implements Taxable{
     //constructor
     Electronics(String productId, String name, int price){
         super(productId, name, price);
     }

    // method for calculate discount
    @Override
    public double calculateDiscount() {
        return getPrice()*0.23;
    }

    // for tax
    @Override
    public double calculateTax() {
        return getPrice()*0.07;
    }

    @Override
    public String getTaxDetails() {
        return "Clothing Tax (5%)";
    }

}
