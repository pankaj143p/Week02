package src.com.problems.food;

// Main class to demonstrate the Online Food Delivery System
public class OnlineFoodDeliverySystem {
    public static void main(String[] args) {
        // Creating different food items
        FoodItem vegItem = new VegItem("Pizza", 10.00, 2);
        FoodItem nonVegItem = new NonVegItem(" Burger", 8.00, 3);

        // List of food items in an order
        FoodItem[] foodItems = {vegItem, nonVegItem};

        // Process the order and calculate total price
        for (FoodItem foodItem : foodItems) {
            System.out.println(foodItem.getItemDetails());
            System.out.println("Total Price: " + foodItem.calculateTotalPrice());

            // Apply discount if applicable
            if (foodItem instanceof Discountable) {
                Discountable discountableItem = (Discountable) foodItem;
                discountableItem.applyDiscount(10);  // Applying 10% discount
                System.out.println(discountableItem.getDiscountDetails());
            }

            System.out.println("---------------------------------");
        }
    }
}
