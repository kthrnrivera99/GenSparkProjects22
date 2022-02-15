import java.util.Scanner;

public class DragonCave {
    public static void main (String [] args) {
        System.out.println( "You are in a land full of dragons. In front of you,\n" +
                "you see two caves. In once cave, the dragon is friendly.\n" +
                "and will share his treasue with you. The other dragon\n" +
                "is greedy and hungry and will eat you on sight.\n" +
                "Which cave will you go into? (1 or 2) ");

        Scanner getInput = new Scanner(System.in);
        String input = getInput.nextLine();

        System.out.println("You chose cave number " + input);

        int num = Integer.parseInt(input); // convert String user input to int for boolean operation

        if (num == 1) {
            System.out.println("You approach the cave... \n" +
                    "It is dark and spooky... \n" +
                    "A large dragon jumps out in front of you! He opens his jaws and..\n" +
                    "Gobbles you down in one bite");
        } else {
            System.out.println("You approach the cave...\n" +
                    "It is dark and spooky...\n" +
                    "A large dragon jumps out in front of you! He opens his jaws and..\n" +
                    "Asks if you would like a share of his treasure for your travels. \n" +
                    "The dragon is so friendly that he even offers you a bed for the night.");
        }
    }
}
