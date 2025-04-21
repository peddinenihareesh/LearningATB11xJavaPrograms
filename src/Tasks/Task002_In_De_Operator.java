package Tasks;

public class Task002_In_De_Operator {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(++a + a++ + a++);
        System.out.println(a);

        // A-> 11 a = 11
        // B ->11 a = 12
        // C -> 12 a = 12
    }

}
