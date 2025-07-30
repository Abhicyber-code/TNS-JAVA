package moveupper;

import java.util.Scanner;

public class MoveUpperToEnd {

    public static void main(String[] args) {
        // Create Scanner to take input
        Scanner sc = new Scanner(System.in);

        // Read input string
        String input = sc.nextLine();

        // StringBuilders to store parts
        StringBuilder lowercasePart = new StringBuilder();
        StringBuilder uppercasePart = new StringBuilder();

        // Iterate through characters
        for (char ch : input.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                uppercasePart.append(ch);  // Collect uppercase letters
            } else {
                lowercasePart.append(ch);  // Collect lowercase and others
            }
        }
        
        // Combine and print
        System.out.println(lowercasePart.toString() + uppercasePart.toString());

        sc.close();
    }
}
