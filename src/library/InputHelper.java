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
            //print input request
            while(!scanner.hasNextInt()){
                //print invalid input statement
                scanner.next();
            }
            input =scanner.nextInt();
        }while (input<=0);
        //print result
        scanner.nextLine();
        return input;
    }

    /**
     * userInputType takes a string input from user and confirms that it is either "Book" or "Video.
     * It is not case-sensitive. <br>
     * @return String that is either "Book" or "Video".
     */

    String userInputType(){

        System.out.println("input gafoofl");
        String input = scanner.nextLine();
        boolean isDone = false;


        while (!isDone){
            if (input.equalsIgnoreCase("Book") ||
            input.equalsIgnoreCase("Video")){

                //input is valid statement
                System.out.println("valid");
                isDone = true;

            }else{
                //return invalid input statement
                System.out.println("invalid");
                input = scanner.nextLine();
            }

        }
        System.out.println(input);
        return input;

    }

    /**
     * userInputTitle takes a String input from user and returns it.
     * @return user String input.
     */
    String userInputTitle(){
        return scanner.nextLine();
    }
}
