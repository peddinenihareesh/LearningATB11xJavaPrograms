package ex_06_Ternary_Operator;

import java.util.StringTokenizer;

public class Lab065_TO {
    public static void main(String[] args) {
        // Find the maximum number between two numbers.

        int x = 10;
        int y = 20;
        System.out.println(Math.max(x,y));



//        String max = x > y ? "X is max" : "Y is max";
//        System.out.println(max);

        //or

        int max = x > y ? x : y;
        System.out.println(max);
    }
}
