import java.util.Random;
import java.util.Scanner;
/**Class: Exercise2
 * @author Ronoquade Lawrence
 * @version 1.0
 * Course: ITEC 2150 Spring 2024
 * Written: April 2, 2024
 *
 * This class catches the ArrayIndexOutOfBoundsException
 * if the user enters an index out of bounds.
 */
public class Exercise2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Creating the array of double values and filling
        // all the indices with random double values.
        double[] randomArray = new double[50];

        Random randNum = new Random();

        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = 10 * randNum.nextDouble();
        }
        // While-Loop with boolean loop control variable and exception catcher
        boolean validIndex = false;
        double returnedElement = 0;
        while (!validIndex) {

            try {
                System.out.print("Enter the index of the 50 elements you want to view (0-49): ");
                returnedElement = randomArray[input.nextInt()];
                validIndex = true;
            }
            catch (ArrayIndexOutOfBoundsException e){
                input.nextLine();
                System.out.println("Sorry, the index is out of range. Try again.");
            }

        }
        System.out.println(returnedElement);
    }
}
