package Tasks;

import java.util.Scanner;

public class Lab005_Even_Odd_If {
    public static void main(String[] args) {
        // Create a program
        // take user input &
        // Check weather the input is even or odd number
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        // int number2 = Integer.parseInt(args[0]);
        if (number%2 ==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
}
