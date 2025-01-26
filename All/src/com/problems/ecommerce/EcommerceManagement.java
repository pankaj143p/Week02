/*
. E-Commerce Platform
Description: Develop a simplified e-commerce platform:
Create an abstract class Product with fields like productId, name, and price, and an
abstract method calculateDiscount().
Extend it into concrete classes: Electronics, Clothing, and Groceries.
Implement an interface Taxable with methods calculateTax() and getTaxDetails() for
applicable product categories.
Use encapsulation to protect product details, allowing updates only through setter methods.
Showcase polymorphism by creating a method that calculates and
prints the final price (price + tax - discount) for a list of Product.
 */
package src.com.problems.ecommerce;

public class EcommerceManagement {
    public static void main(String[] args) {
        Product pc=new Clothing("100283AC2","T-shirt",1989);
        Product pe=new Electronics("2990CD2","Bulb",299);
        Product pg=new Groceries("4304DF2","Oppo",34899);
        Product [] products = {pc,pe,pg};
        int idx=1;
        for(Product pit : products){
            System.out.println("Product "+idx);
            idx++;
            System.out.println("Product id : "+pit.getProductId());
            System.out.println("Product name: "+pit.getName());
            if(pit instanceof Taxable){
                Taxable taxableProduct = (Taxable) pit;
                System.out.println("Tax for this product in % : "+taxableProduct.getTaxDetails());
                System.out.println("Product Price: "+pit.calculateFinalPrice(taxableProduct));
            }else{
                System.out.println("No tax & discount for this product : ");
                System.out.println("Final price for this : "+pit.getPrice());
            }
            System.out.println("-----------------------------------------------------------------------");
        }
    }
}