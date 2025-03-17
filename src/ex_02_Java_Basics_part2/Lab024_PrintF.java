package ex_02_Java_Basics_part2;

public class Lab024_PrintF {
    public static void main(String[] args) {

        int a = 30;
        System.out.printf("Your variable is %d", a);
        // %d -> int, byte, long, short, - data type
        // %s -> String
        // %f -> float, double;
        // %b -> boolean
        int b = 20;
        System.out.println(" --- ");
        System.out.printf("%d + %d", a,b);



    }
}
