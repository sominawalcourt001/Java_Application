import java.util.Scanner;

public class SquareOfAnyCharacter {

    // Method to display a solid square using a given character
    public static void squareOfAsterisks(int side, char fillCharacter) {
        for (int i = 0; i < side; i++) {         // Loop for rows
            for (int j = 0; j < side; j++) {     // Loop for columns
                System.out.print(fillCharacter);
            }
            System.out.println(); // Move to next line after each row
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Read the size of the square
        System.out.print("Enter the size of the square: ");
        int side = input.nextInt();

        // Read the fill character
        System.out.print("Enter the character to fill the square: ");
        char fill = input.next().charAt(0);

        System.out.println("\nThe square is:\n");
        squareOfAsterisks(side, fill);

        input.close();
    }
}
