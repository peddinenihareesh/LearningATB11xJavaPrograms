package ex_13_Functions;

import ex_01_Java_Basic.Hareesh;

import java.sql.SQLOutput;

public class Lab132_UserDefined_Part1 {
    public static void main(String[] args) {

        // User Defined Functions

        //1.Without Parameters and without Return Type
        //1.Without Parameters and with Return Type
        //1.With Parameters and without Return Type
        //1.With Parameters and with Return Type

        // 1.Without Argument / Parameters(WP) and Without Return Type(WR).
         Wp_Wr_greet();

         //2.Without Parameters but with return type
        String msg = greet_With_Hello_WP_With_RT();
        System.out.println(msg);

        //3.With parameters and without return type (90% use in real time)
        greet_with_details("Hareesh",32,300000);
        greet_with_details("Lavanya",27,42000);

        greet_With_full_name("Hareesh", "Peddineni");

        // 4. With Parameters and With return type
        int sum = sum_of_Two_numbers(3,4);
        int sum2 = sum_of_Two_numbers(190, 900);
        int sum3 = sum_of_Two_numbers(2345,5432);
        int sum4 = sum_of_three_numbers(2345,5432,5432);

        System.out.println(sum);
        System.out.println(sum2);
        System.out.println(sum3);
        System.out.println(sum4);

        int result = Math.max(3,4); // 4th type

    }
    // Without Parameters and Without Return Type. (Declare) / Define
    static void Wp_Wr_greet(){
        System.out.println("Hi, How are you?");
    }

    // 2. Without Parameters but with return type(RT)
    static String greet_With_Hello_WP_With_RT(){
        System.out.println("Hi");
        return "Hi, How are you";
    }

    // 3. With Parameters but without Return Type(90% use in real time)
    static void greet_with_details(String name,int age,double salary){
         System.out.println("Your name is ->"+name+ "\nYour age is ->"+age+ "\nYour salary is ->"+salary);
    }

    static void greet_With_full_name(String firstname,String lastname){
        System.out.println("Hi, Your name is ->" + firstname +lastname);
    }
    // 4. With Parameters and with Return Type
    static int sum_of_Two_numbers(int a,int b){
        return a+b;
    }
    static int sum_of_three_numbers(int a,int b, int c){
        return a+b+c;
    }

}
