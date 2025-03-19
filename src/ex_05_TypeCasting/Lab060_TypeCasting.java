package ex_05_TypeCasting;

public class Lab060_TypeCasting {
    public static void main(String[] args) {
        long Phone_no = 9989258044l;
        //short s = Phone_no; // implicit ?
        short s = (short) Phone_no; // Explicit Casting - Narrowing
        System.out.println(s);
    }
}
