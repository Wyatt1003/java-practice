import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class FilterNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Random rand = new Random();

        for (int i = 0; i < 10; i++) {
            numbers.add(rand.nextInt(100));
        }

        System.out.println("Original List: " + numbers);

        numbers.removeIf(n -> n % 2 != 0);

        System.out.println("List after removing odds: " + numbers);
    }
}



public class GuestListArray {
    public static void main(String[] args) {
        ArrayList<String> guests = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        guests.add("Alice");
        guests.add("Bob");
        guests.add("Charlie");

        System.out.println("--- Guest List Checker (ArrayList Version) ---");

        while (true) {
            System.out.print("Enter a name (or 'exit' to quit): ");
            String input = scanner.nextLine().trim();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Exiting program...");
                break;
            }

            boolean found = false;
            for (String guest : guests) {
                if (guest.equalsIgnoreCase(input)) {
                    found = true;
                    break; 
                }
            }

            if (found) {
                System.out.println("Success: " + input + " is invited!");
            } else {
                System.out.println("Sorry, " + input + " is not on the list.");
            }
        }
        
        scanner.close();
    }
}

public class GroceryListManager {
    public static void main(String[] args) {
        ArrayList<String> groceries = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        groceries.add("Milk");
        groceries.add("Bread");
        groceries.add("Eggs");

        System.out.println("--- Grocery List Manager ---");
        System.out.println("Current List: " + groceries);

        while (true) {
            System.out.print("\nEnter a food item (or 'exit'): ");
            String input = scanner.nextLine().trim();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Final List: " + groceries);
                break;
            }

            int index = -1;
            for (int i = 0; i < groceries.size(); i++) {
                if (groceries.get(i).equalsIgnoreCase(input)) {
                    index = i;
                    break;
                }
            }

            if (index != -1) {
                System.out.println("Found! Index: " + index);
            } else {
                System.out.println("Not Found. Adding '" + input + "' to the list.");
                groceries.add(input);
            }
        }
        
        scanner.close();
    }
}