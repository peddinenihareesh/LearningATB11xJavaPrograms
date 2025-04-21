package Tasks;

import java.util.Scanner;

public class Task007_CLI_Ops {
    public static void main(String[] args) {


    // Scanner Class
    //
    //  Take a user input - Name, Age and salary and print them in the end.
    //
    // Take a user input 2 numbers from the arguments calculate te maximum

    Scanner scanner = new Scanner(System.in);

    // Prompt the user for their name
        System.out.println("Enter Your name:");
        String name = scanner.nextLine();

        System.out.println("Enter your age");
        int age = scanner.nextInt();

        // prompt the user for their salary
        System.out.println("Enter your salary");
        Double salary = scanner.nextDouble();

        // print the collected information
        System.out.println("\n---User information---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);

        // close the scanner
        scanner.close();

    }
}
