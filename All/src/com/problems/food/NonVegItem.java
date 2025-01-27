package src.com.problems.food;
// NonVegItem Class extends FoodItem
class NonVegItem extends FoodItem implements Discountable {
    private static final double ADDITIONAL_CHARGE = 2.0; // Additional charge for NonVegItems

    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity() + ADDITIONAL_CHARGE;
    }

    @Override
    public void applyDiscount(double discountPercentage) {
        double totalPrice = calculateTotalPrice();
        double discountAmount = totalPrice * discountPercentage / 100;
        System.out.println("Discount Applied: " + discountAmount);
        System.out.println("Total after discount: " + (totalPrice - discountAmount));
    }

    @Override
    public String getDiscountDetails() {
        return "NonVegItem discount is applied.";
    }
}