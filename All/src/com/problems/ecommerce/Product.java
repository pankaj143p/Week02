
package src.com.problems.ecommerce;
public abstract class Product {
    private String productId;
    private String name;
    private int price;
    // abstract method for calculate the discount
    public abstract double calculateDiscount();
    Product(String productId, String name, int price){
        this.productId=productId;
        this.name=name;
        this.price=price;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public double calculateFinalPrice(Taxable t){
        double tax=t.calculateTax();
        double discount=calculateDiscount();
        return price+tax-discount;
    }
}
