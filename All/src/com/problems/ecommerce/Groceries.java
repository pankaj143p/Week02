package src.com.problems.ecommerce;

public class Groceries extends Product{
     Groceries(String productId, String name, int price){
         super(productId, name, price);
     }

    @Override
    public double calculateDiscount() {
        return 0;
    }
}
