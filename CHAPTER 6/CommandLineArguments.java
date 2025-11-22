public class CommandLineArguments {
    public static void main(String[] args) {
        int size = 10; // default size

        // Check if a command-line argument is provided
        if (args.length > 0) {
            try {
                size = Integer.parseInt(args[0]); // parse first argument
                if (size <= 0) {
                    System.out.println("Size must be positive. Using default size 10.");
                    size = 10;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid argument. Using default size 10.");
            }
        }

        int[] array = new int[size];

        // Initialize array with values (example: 1, 2, 3, …)
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }

        // Display the array
        System.out.println("Array of size " + size + ":");
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
