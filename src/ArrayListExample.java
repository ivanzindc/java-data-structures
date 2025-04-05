// This file is located in the 'src' package.
// In a larger project, 'src' would typically be the source folder, not the package name.
// For simplicity, we're treating it as a package here.

package src;

// Import the ArrayList class from the java.util package.
// ArrayList is a resizable array implementation provided by Java.

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // Create a new resizable list to hold grocery items
        ArrayList<String> groceries = new ArrayList<>();

        // Add items to the grocery list
        groceries.add("Apples");
        groceries.add("Bread");
        groceries.add("Milk");

        // Print the list
        System.out.println("Groceries List:");
        for (String item : groceries) {
            System.out.println("- " + item);
        }

        groceries.remove("Bread");  // Removes the item "Bread" from the list

        // Print the updated list
        System.out.println("\nUpdated List:");
        for (String item : groceries) {
            System.out.println("- " + item);
        }
    }
}
