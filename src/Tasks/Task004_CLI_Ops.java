package Tasks;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class Task004_CLI_Ops {
    public static void main(String[] args) {
        // CLI Options
        //
         //  Take a user input - Name, Age and salary and print them in the end.
        //
        // Take a user input 2 numbers from the arguments calculate te maximum

//        System.out.println("Enter the Name, age, Salary");
//        String name = args[0];
//        int age = Integer.parseInt(args[1]);
//        double salary = Double.parseDouble(args[2]);
//
//        System.out.println(name);
//        System.out.println(age);
//        System.out.println(salary);


        // Scanner class
        //
        //  Take a user input - Name, Age and salary and print them in the end.
        //
        // Take a user input 2 numbers from the arguments calculate the maximum

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = scanner.nextLine();

        System.out.println("Enter your age");
        int age = scanner.nextInt();

        System.out.println("Enter your salary");
        double salary = scanner.nextDouble();

        // print the collected information
        System.out.println("---User infomation---");
        System.out.println("Name:" + name);
        System.out.println("Age:" + age);
        System.out.println("Salary:" + salary);

        // close the scanner
        scanner.close();
    }
}
