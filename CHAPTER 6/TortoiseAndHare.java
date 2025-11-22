import java.util.Random;

public class TortoiseAndHare {

    private static final int FINISH_LINE = 70;

    public static void main(String[] args) throws InterruptedException {
        int tortoisePos = 1;
        int harePos = 1;

        Random rand = new Random();

        System.out.println("BANG !!!!!");
        System.out.println("AND THEY'RE OFF !!!!!");

        // Run the race until someone reaches or passes 70
        while (tortoisePos < FINISH_LINE && harePos < FINISH_LINE) {
            // Move tortoise
            int tMove = rand.nextInt(10) + 1; // 1-10
            if (tMove <= 5) tortoisePos += 3;           // fast plod
            else if (tMove <= 7) tortoisePos -= 6;      // slip
            else tortoisePos += 1;                       // slow plod

            // Move hare
            int hMove = rand.nextInt(10) + 1; // 1-10
            if (hMove <= 2) harePos += 0;                  // sleep
            else if (hMove <= 4) harePos += 9;             // big hop
            else if (hMove == 5) harePos -= 12;            // big slip
            else if (hMove <= 8) harePos += 1;             // small hop
            else harePos -= 2;                              // small slip

            // Keep positions within bounds
            if (tortoisePos < 1) tortoisePos = 1;
            if (harePos < 1) harePos = 1;

            // Print the track
            for (int i = 1; i <= FINISH_LINE; i++) {
                if (i == tortoisePos && i == harePos) {
                    System.out.print("OUCH!!!");
                    i += 5; // skip next positions for 'OUCH!!!'
                } else if (i == tortoisePos) System.out.print("T");
                else if (i == harePos) System.out.print("H");
                else System.out.print(" ");
            }
            System.out.println();

            // Check for winner
            if (tortoisePos >= FINISH_LINE && harePos >= FINISH_LINE) {
                System.out.println("It's a tie!");
                break;
            } else if (tortoisePos >= FINISH_LINE) {
                System.out.println("TORTOISE WINS!!! YAY!!!");
                break;
            } else if (harePos >= FINISH_LINE) {
                System.out.println("HARE WINS. Yuch.");
                break;
            }

            // Optional: pause 0.5s between ticks to simulate real-time
            Thread.sleep(500);
        }
    }
}
