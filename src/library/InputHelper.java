package library;

import java.util.Scanner;

/**
 *InputHelper helps get and validate inputs from the user.<br>
 * Has methods:<br>
 * {@link #userInputInt()} which gets and verifies a positive integer from user input. <br>
 * {@link #userInputType()} which gets and verifies a String of correct type. <br>
 * {@link #userInputTitle()} which gets a String
 */

public class InputHelper {

    Scanner scanner = new Scanner(System.in);

    /**
     *<P>This method gets an integer input from the user, and confirms that it is above 0.</P>
     *
     * @return positive integer
     */

    int userInputInt(){
        int input;

        do{
            System.out.println("Please input the number of items you wish to register.");
            while(!scanner.hasNextInt()){
                System.out.println("You have input an invalid number.\nPlease input an integer above zero.");
                scanner.next();
            }
            input =scanner.nextInt();
        }while (input<=0);
        System.out.println("You are currently attempting to register " + input + " items.");
        scanner.nextLine();
        return input;
    }

    /**
     * userInputType takes a string input from user and confirms that it is either "Book" or "Video.
     * It is not case-sensitive. <br>
     * @return String that is either "Book" or "Video".
     */

    String userInputType(){

        System.out.println("Please input the type of item you are trying to register.\nValid types are: \"Book\", \"Video\".");
        String input = scanner.nextLine();
        boolean isDone = false;


        while (!isDone){
            if (input.equalsIgnoreCase("Book") ||
            input.equalsIgnoreCase("Video")){
                isDone = true;
            }
            else{
                System.out.println("Please input a valid type.\nValid types are: \"Book\", \"Video\".");
                input = scanner.nextLine();
            }

        }
        return input;

    }

    /**
     * userInputTitle takes a String input from user and returns it.
     * @return user String input.
     */
    String userInputTitle(){
        System.out.println("Please input the title of the item you are trying to register.");
        return scanner.nextLine();
    }
}
