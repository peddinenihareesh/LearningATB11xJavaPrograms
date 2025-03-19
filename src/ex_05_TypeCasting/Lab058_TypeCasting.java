package ex_05_TypeCasting;

public class Lab058_TypeCasting {
    public static void main(String[] args) {
        byte b = 10;
        // int a =b; // valid -> Implicit Casting - Automatically
        int a = (int)b; // Explicit Casting - widening (doesn't require)
        System.out.println(a);
    }
}
