package Tasks;

public class Task003_In_De_Op_2 {
    public static void main(String[] args) {
        int a = 20;
        System.out.println(--a + a++ + a--);
        System.out.println(a);

        // A -> 19
        // B -> 19
        // C -> 20
    }
}
