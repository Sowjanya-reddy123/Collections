import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GroceryListApp {

    private List<String> groceryList;


    public GroceryListApp() {
        groceryList = new ArrayList<>();
    }


    public void addItem(String item) {
        groceryList.add(item);
        System.out.println(item + " has been added to the list.");
    }


    public void removeItem(String item) {
        if (groceryList.remove(item)) {
            System.out.println(item + " has been removed from the list.");
        } else {
            System.out.println(item + " is not in the list.");
        }
    }

    // Method to display all items in the grocery list
    public void displayItems() {
        System.out.println("Grocery List:");
        for (String item : groceryList) {
            System.out.println("- " + item);
        }
    }

    // Main method to run the application
    public void main(String[] args) {
        GroceryListApp groceryListApp = new GroceryListApp();
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        while (choice != 4) {
            System.out.println("\n Grocery List Menu:");
            System.out.println("Add Item");
            System.out.println("Remove Item");
            System.out.println("Display Item");

            if (scanner.hasNext()) {
                choice = scanner.nextInt();
                scanner.nextLine();
            } else {
                System.out.println("Invalid input. Please enter a number");
                scanner.next();
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.println("Enter item to add");
                    String addItem = scanner.nextLine();
                    groceryListApp.addItem(addItem);
                    break;
                case 2:
                    System.out.println("Enter item to remove");
                    String removeItem = scanner.nextLine();
                    groceryListApp.removeItem(removeItem);
                    break;
                case 3:
                    groceryListApp.displayItems();
                    break;
            }


        }

        scanner.close();

    }
}