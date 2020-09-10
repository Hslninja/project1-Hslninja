import java.util.Scanner;
import java.util.InputMismatchException;
public class Lab1 {

    public static void main(String[] args) {
        System.out.println("Please input a number between 0 and 8: ");
        Scanner input = new Scanner(System.in);
        int n = 0;
        try {
            n = input.nextInt();
        }
        catch(InputMismatchException e){
            System.out.println("Invalid input, only integers permitted.");
            System.exit(1);
        }
        if (n > 8 || n < 0) {
            System.out.println("Invalid input, only integers between 0 and 8 permitted.");
            System.exit(1);
        }

        for (int i = 0 ; i < n ; ++i) {
            System.out.println("Hello " + args[i] +".");
        }

    }
}
