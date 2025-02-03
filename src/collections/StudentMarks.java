package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Float> studentMarks = new HashMap<>();
        HashMap<String, String> output = new HashMap<>();

        System.out.print("Enter the number of students: ");
        int numStudents = getValidInteger(scanner);

        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter student name: ");
            String name = scanner.next().trim();
            if (name.matches(".*\\d.*")) {  // Rejects any name that contains a digit
                System.out.println("Enter a valid student name (no numbers allowed).");
                i--;  // Decrement index to retry input
                continue;
            }

            if (studentMarks.containsKey(name)) {
                System.out.println("Error: Duplicate name detected! Enter a unique name.");
                i--;  // Retry this iteration
                continue;
            }

            System.out.print("Enter marks for " + name + ": ");
            float marks = getValidFloat(scanner);

            studentMarks.put(name, marks);
        }

        // Determine pass/fail status
        for (Map.Entry<String, Float> entry : studentMarks.entrySet()) {
            output.put(entry.getKey(), entry.getValue() >= 60 ? "Pass" : "Fail");
        }

        System.out.println("Final Results: " + output);
        scanner.close();
    }

    // Validates integer input
    private static int getValidInteger(Scanner scanner) {
        while (true) {
            try {
                int value = Integer.parseInt(scanner.next().trim());
                if (value <= 0) {
                    throw new NumberFormatException();
                }
                return value;
            } catch (NumberFormatException e) {
                System.out.print("Invalid input! Enter a positive integer: ");
            }
        }
    }

    // Validates float input
    private static float getValidFloat(Scanner scanner) {
        while (true) {
            try {
                float value = Float.parseFloat(scanner.next().trim());
                if (value < 0 || value > 100) {
                    throw new IllegalArgumentException();
                }
                return value;
            } catch (NumberFormatException e) {
                System.out.print("Invalid input! Enter a valid numeric mark: ");
            } catch (IllegalArgumentException e) {
                System.out.print("Marks should be between 0 and 100! Enter again: ");
            }
        }
    }
}
