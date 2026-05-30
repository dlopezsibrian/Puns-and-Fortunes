//importing all needed libraries
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //creates a new scanner while setting the name 
        Random random = new Random();
        //creates the object named random from the random java class 

   
        //Puns (14 each)
        ArrayList<String> puns = new ArrayList<>();
        ////new list object called fortunes that is used to store string objects for puns
        puns.add("Yesterday I accidentally swallowed some food coloring. The doctor says I'm okay but I feel like I dyed a little inside");
        puns.add("To the guy who invented zero, thanks for nothing.");
        puns.add("A crazy wife says to her husband that moose are falling from the sky. The husband says, it’s reindeer.");
        puns.add("I used to be a baker, but I couldn’t make enough dough.");
        puns.add("Never trust an atom; they make up everything!");
        puns.add("The Middle Ages were called the Dark Ages because there were too many knights.");
        puns.add("What do you call an alligator in a vest? An investigator.");
        puns.add("Coffee is having a rough time in our house. It gets mugged every single morning.");
        puns.add("One lung said to another, “we be-lung together!”");
        puns.add("I asked a Frenchman if he played video games. He said Wii.");
        puns.add("What did syrup say to the waffle? I love you a waffle lot!");
        puns.add("I’m no cheetah, you're a lion!");
        puns.add("I wanted to take pictures of the fog this morning but I mist my chance. I guess I could dew it tomorrow!");
        puns.add("My dad unfortunately passed away when we couldn’t remember his blood type. His last words to us were, “Be positive!”");
       
        //Fortune (14 each)
        ArrayList<String> fortunes = new ArrayList<>();
        //new list object called fortunes that is used to store string objects for fortunes
        fortunes.add("You will receive an unexpected surprise.");
        fortunes.add("Your efforts will remain unnoticed.");
        fortunes.add("Your fortune is in a different code");
        fortunes.add("Money is in your future but it is not yours. ");
        fortunes.add("Happy news its on its way to you.");
        fortunes.add("You will make a new friend.");
        fortunes.add("Every closed door will only lead to your success.");
        fortunes.add("Fortune not found");
        fortunes.add("Your life will be sunshine and rainbows");
        fortunes.add("You need a mint.");
        fortunes.add("Ten ducks will arrive at your house at midnight.");
        fortunes.add("You will receive all F's this year. ");
        fortunes.add("No fortune pick a pun instead.");
        fortunes.add("👀");

    
        String mainChoice = "";
        //sets up a container for text

        while (!mainChoice.equalsIgnoreCase("exit")) {

            System.out.println("Menu:");
            System.out.println("1. Pun or Fortune Generator");
            System.out.println("2. Type 'exit' to quit.");
            System.out.println("Hint: type 1 and press enter");
            //setting the options the user has 
            mainChoice = scanner.nextLine();
            //Pun/Fortune Generator
          
            if (mainChoice.equals("1")) {

                String again = "yes";

                while (again.equalsIgnoreCase("yes")) {
                    System.out.println("Would you like a pun or a fortune?");
                    String choice = scanner.nextLine();

                    if (choice.equalsIgnoreCase("pun")) {
                        int index = random.nextInt(puns.size());
                        System.out.println(puns.get(index));
                    } 
                    else if (choice.equalsIgnoreCase("fortune")) {
                        int index = random.nextInt(fortunes.size());
                        System.out.println(fortunes.get(index));
                    } 
                    else {
                        System.out.println("Invalid choice.");
                    }

                    System.out.println("Would you like another one? (yes or no)");
                    again = scanner.nextLine();
                       
    }}}}}

  

