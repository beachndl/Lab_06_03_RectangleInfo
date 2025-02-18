import java.util.Scanner;

public class RectangleInfo {
    public static void main(String[] args) {
        // Scanner + variable declaration
        Scanner in = new Scanner(System.in);
        double width = 0;
        double height = 0;
        double area = 0;
        double perimeter = 0;
        double diagonal = 0;
        String trash = "";
        boolean done;

        // Get the width
        done = false;
        do {
            System.out.print("Enter the width of the rectangle: ");

            if (in.hasNextDouble()) {
                // Safe to read in a double
                width = in.nextDouble();
                in.nextLine(); // Clear the buffer

                // Check condition
                if (width > 0) {
                    // Valid input, end the loop
                    done = true;
                } else {
                    System.out.println("Width must be greater than 0!");
                }
            } else {
                // Not a double, cannot use nextDouble()
                trash = in.nextLine(); // Read input as String
                System.out.println("\nInvalid input: " + trash);
                System.out.println("Please enter a valid number!\n");
            }
        } while (!done);

        // Get the height
        done = false;
        do {
            System.out.print("Enter the height of the rectangle: ");

            if (in.hasNextDouble()) {
                // Safe to read in a double
                height = in.nextDouble();
                in.nextLine(); // Clear the buffer

                // Check condition
                if (height > 0) {
                    // Valid input, end the loop
                    done = true;
                } else {
                    System.out.println("Height must be greater than 0!");
                }
            } else {
                // Not a double, cannot use nextDouble()
                trash = in.nextLine(); // Read input as String
                System.out.println("\nInvalid input: " + trash);
                System.out.println("Please enter a valid number!\n");
            }
        } while (!done);

        // Calculate measurements
        area = width * height;
        perimeter = 2 * (width + height);
        diagonal = Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));

        // Print results
        System.out.printf("\nArea: %.2f square units\n", area);
        System.out.printf("Perimeter: %.2f units\n", perimeter);
        System.out.printf("Diagonal: %.2f units\n", diagonal);
    }
}