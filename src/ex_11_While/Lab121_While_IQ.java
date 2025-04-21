package ex_11_While;

import java.util.Scanner;

public class Lab121_While_IQ {
    public static void main(String[] args) {
        // Factorial program
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the factorial program\nEnter the number whose factorial you want!");
        int number = scanner.nextInt();

        int fatorial = 1;
        if (number <=0){
            System.out.println(fatorial);
        }else{
            for (int i = 1; i <=number; i++) {
             fatorial = fatorial*i;

            }
        }

        System.out.println("Factorial is ->" + fatorial);

    }
}
