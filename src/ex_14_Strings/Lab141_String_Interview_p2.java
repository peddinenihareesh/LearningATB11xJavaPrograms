package ex_14_Strings;

public class Lab141_String_Interview_p2 {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s4 = "Hello"; // SCP -> 1

        String s2 = new String("Hello");  // object area
        String s3 = new String("Hello");
        String s5 = new String("hello");  // Object area = 3

        // == -> Comparison -> String -> this check the locations ref.
        System.out.println(s1 == s3);
        System.out.println(s1 == s3);
        System.out.println(s2 == s3);

        System.out.println(s1 ==s4);
        System.out.println(s3 == s5);

        // equals ( Content) -> value

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s3.equals(s5));
        System.out.println(s3.equalsIgnoreCase(s5));

        // equalsIgnoreCase -> Hareesh, hareesh,HAREesh, hareeSH -> hareesh
        // == -> check for reference
        // = assignment the value
    }
}
