import java.util.Scanner;

public class GlobalWarmingQuiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int score = 0;
        int answer;

        System.out.println("Global Warming Facts Quiz ");
        System.out.println("Answer each question by typing 1, 2, 3, or 4.\n");

        // Question 1
        System.out.println("1. What is the main greenhouse gas produced by human activities?");
        System.out.println("1) Methane\n2) Carbon dioxide\n3) Nitrous oxide\n4) Oxygen");
        answer = input.nextInt();
        if (answer == 2) score++;

        // Question 2
        System.out.println("\n2. Which organization has stated that human activities are the main cause of recent climate change?");
        System.out.println("1) IPCC\n2) NASA\n3) Greenpeace\n4) WHO");
        answer = input.nextInt();
        if (answer == 1) score++;

        // Question 3
        System.out.println("\n3. What do some global warming skeptics often argue?");
        System.out.println("1) Climate change is entirely natural\n2) Caused only by volcanoes\n3) Earth is not warming\n4) Scientists agree 100%");
        answer = input.nextInt();
        if (answer == 1) score++;

        // Question 4
        System.out.println("\n4. Which of these is a possible effect of global warming?");
        System.out.println("1) Decrease in sea levels\n2) Stronger hurricanes\n3) More snowfall in tropics\n4) Less drought");
        answer = input.nextInt();
        if (answer == 2) score++;

        // Question 5
        System.out.println("\n5. Which of the following energy sources is renewable and helps reduce carbon emissions?");
        System.out.println("1) Coal\n2) Oil\n3) Solar\n4) Natural gas");
        answer = input.nextInt();
        if (answer == 3) score++;

        // Results
        System.out.println("\nYour score: " + score + "/5");

        if (score == 5)
            System.out.println("Excellent! ");
        else if (score == 4)
            System.out.println("Very good! ");
        else {
            System.out.println("Time to brush up on your knowledge of global warming.");
            System.out.println("\nLearn more from these sources:");
            System.out.println("- https://www.ipcc.ch/");
            System.out.println("- https://climate.nasa.gov/");
            System.out.println("- https://www.nationalgeographic.com/environment/");
            System.out.println("- https://skepticalscience.com/");
        }
    }
}
