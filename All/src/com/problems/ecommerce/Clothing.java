package src.com.problems.ecommerce;

public class Clothing extends Product implements Taxable{
    // constructor
    Clothing(String productId, String name, int price){
        super(productId, name, price);
    }

    // method for calculate discount
    @Override
    public double calculateDiscount() {
        return getPrice()*0.20;
    }

    // for tax
    @Override
    public double calculateTax() {
        return getPrice()*0.05;
    }

    @Override
    public String getTaxDetails() {
        return "Clothing Tax (5%)";
    }
}
