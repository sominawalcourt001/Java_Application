import java.util.Scanner;

public class AirlineReservationSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean[] seats = new boolean[10]; // false = empty, true = taken
        boolean flightFull = false;

        while (!flightFull) {
            System.out.println("Please type 1 for First Class and 2 for Economy:");
            int choice = input.nextInt();

            if (choice == 1) {
                // First Class seats 1-5 (indices 0-4)
                if (!assignSeat(seats, 0, 4, "First Class")) {
                    // First Class full, ask about Economy
                    if (!offerAlternate(seats, 5, 9, "Economy")) {
                        flightFull = true;
                    }
                }
            } else if (choice == 2) {
                // Economy seats 6-10 (indices 5-9)
                if (!assignSeat(seats, 5, 9, "Economy")) {
                    // Economy full, ask about First Class
                    if (!offerAlternate(seats, 0, 4, "First Class")) {
                        flightFull = true;
                    }
                }
            } else {
                System.out.println("Invalid choice. Please type 1 or 2.");
            }

            // Check if all seats are taken
            flightFull = flightFull || allSeatsTaken(seats);
        }

        System.out.println("Next flight leaves in 3 hours.");
    }

    // Assigns a seat in a given section if available
    private static boolean assignSeat(boolean[] seats, int start, int end, String section) {
        for (int i = start; i <= end; i++) {
            if (!seats[i]) {
                seats[i] = true;
                System.out.println("Boarding Pass:");
                System.out.println("Seat Number: " + (i + 1));
                System.out.println("Section: " + section);
                System.out.println();
                return true;
            }
        }
        return false; // section full
    }

    // Offers alternate section if the chosen section is full
    private static boolean offerAlternate(boolean[] seats, int start, int end, String alternateSection) {
        Scanner input = new Scanner(System.in);
        System.out.println(alternateSection + " is available. Would you like to be placed there? (yes/no)");
        String response = input.nextLine().trim().toLowerCase();

        if (response.equals("yes")) {
            return assignSeat(seats, start, end, alternateSection);
        } else {
            return false; // user declines alternate
        }
    }

    // Checks if all seats are taken
    private static boolean allSeatsTaken(boolean[] seats) {
        for (boolean seat : seats) {
            if (!seat) {
                return false;
            }
        }
        return true;
    }
}
