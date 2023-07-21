package Day08.practice;

import java.util.*;

public class CountNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter list of names: ");
        String input = scanner.nextLine().trim();

        String[] namesArray = input.split(",");

        HashMap<String, Integer> nameCount = new HashMap<>();

        for (String name : namesArray) {
            String trimmedName = name.trim();
            int count = nameCount.getOrDefault(trimmedName, 0);
            nameCount.put(trimmedName, count + 1);
        }

        // Print the count of each name
        System.out.println("Count of names:");
        for (Map.Entry<String, Integer> entry : nameCount.entrySet()) {
            String name = entry.getKey();
            int count = entry.getValue();
            System.out.println(name + ": " + count);
        }
      
    }
}
