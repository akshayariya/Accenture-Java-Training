package Inheritance.Has_a_rel;

import java.util.ArrayList;

class Item {
    private String name;
    private double price;
    private int quantity;

    public Item(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getSubtotal() {
        return price * quantity;
    }
}

class ShoppingCart {

    private ArrayList<Item> items; // Create an ArrayList object

    public ShoppingCart() {
        items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(String name) {
        System.out.println("After Removing "+name);
        for (Item item : items) {
            if (item.getName().equalsIgnoreCase(name)) {
                items.remove(item);
                break;
            }
        }
    }

    public void viewCart() {
        System.out.println("__________________Items in Cart__________________");
        for (Item item : items) {
            System.out.println(item.getName() + 
                    " | Price: " + item.getPrice() +
                    " | Quantity: " + item.getQuantity() +
                    " | Subtotal: " + item.getSubtotal());
        }
        System.out.println("-------------------------------------------------");
    }

    public double getTotalPrice() {
        double total = 0;
        for (Item item : items) {
            total += item.getSubtotal();
        }
        return total;
    }

}

public class ECommerce {

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.addItem(new Item("Laptop", 25000, 1));
        cart.addItem(new Item("Headphones", 500, 2));
        cart.addItem(new Item("Mic",1200,2));

        cart.viewCart();

        System.out.println("Total Price: " + cart.getTotalPrice());
        System.out.println("--------------------------");

        cart.removeItem("Laptop");

        cart.viewCart();
    }


}
