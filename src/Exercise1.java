import java.util.InputMismatchException;
import java.util.Scanner;
public class Exercise1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // While-Loop boolean control variable
        boolean goodIntGiven = false;

        int sum = 0;

        while (!goodIntGiven) {
                try {
                    sum = 0;
                    System.out.print("Enter two integers: ");
                    sum += input.nextInt();
                    sum += input.nextInt();
                    goodIntGiven = true;
                }
                catch (InputMismatchException e){
                    input.nextLine();
                    System.out.println("Sorry, either one or both inputs weren't integers...");
                }
            }
            System.out.println(sum);
    }
}
