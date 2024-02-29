import java.util.ArrayList;
import java.util.Scanner;

class Destination {
    String name;
    String date;
    double budget;

    public Destination(String name, String date, double budget) {
        this.name = name;
        this.date = date;
        this.budget = budget;
    }
}

public class TravelPlanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Destination> destinations = new ArrayList<>();

        while (true) {
            System.out.println("1. Add Destination");
            System.out.println("2. Generate Travel Plan");
            System.out.println("3. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character

            switch (choice) {
                case 1:
                    addDestination(destinations, scanner);
                    break;
                case 2:
                    generateTravelPlan(destinations);
                    break;
                case 3:
                    System.out.println("Exiting Travel Planner. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }

    private static void addDestination(ArrayList<Destination> destinations, Scanner scanner) {
        System.out.print("Enter destination name: ");
        String name = scanner.nextLine();

        System.out.print("Enter travel date: ");
        String date = scanner.nextLine();

        System.out.print("Enter budget: ");
        double budget = scanner.nextDouble();

        Destination destination = new Destination(name, date, budget);
        destinations.add(destination);

        System.out.println("Destination added successfully!\n");
    }

    private static void generateTravelPlan(ArrayList<Destination> destinations) {
        if (destinations.isEmpty()) {
            System.out.println("No destinations added. Please add destinations first.\n");
            return;
        }

        System.out.println("Generating Travel Plan...\n");

        for (Destination destination : destinations) {
            System.out.println("Destination: " + destination.name);
            System.out.println("Date: " + destination.date);
            System.out.println("Budget: $" + destination.budget);
            // Additional logic for integrating with maps, weather, and budget APIs can be added here
            System.out.println();
        }
    }
}
