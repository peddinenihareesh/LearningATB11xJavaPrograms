package ex_14_Strings;

public class Lab143_String_Functions {
    public static void main(String[] args) {
        String name = "hareesh";
        System.out.println(name.length());
        System.out.println(name.charAt(3));
       //  System.out.println(name.charAt(10));  // StringIndexOutOfBoundsException

        //2. concat()
        System.out.println(name.concat(" Peddineni"));

        //3.contains()
        System.out.println(name.contains("om"));

        //4.equals()
        System.out.println(name.equals("hareesh"));

        //5 equalsignorecase()
        System.out.println(name.equalsIgnoreCase("Hareesh"));

        //6. indexof() // hareesh -> ? s
        System.out.println(name.indexOf("e"));

        String s1 = "madam";
        // Return the index within this string of the
        // first occurance of the specified substring.
        System.out.println(s1.indexOf("m"));

        //7. length ()
        System.out.println(name.length());

        //8. replace ()
        System.out.println(name.replace('e', 'E'));

        //9. split()
        String name4 = "hareesh.peddinei@live.com@753";
        String[] split = name4.split("@");
        System.out.println(split[0]);
        System.out.println(split[1]);
        System.out.println(split[2]);

        //10. substring (,)
        System.out.println(name.substring(1,3));

        //11. tolowercase()
        System.out.println("HAREESH".toLowerCase());

        //12. touppercase()
        System.out.println("hareesh".toUpperCase());

        //13. startswith()
        System.out.println(name.startsWith("h"));

        //14. endwith()
        System.out.println(name.endsWith("a"));

        //15. trim()
        String name3 = "  hari ram  ";
        System.out.println(name3.trim());

        //16. compareTo()
        System.out.println(name.compareTo("hareesh"));

         StringBuilder stringBuilder = new StringBuilder("hareesh");
        System.out.println(stringBuilder);

        StringBuilder sb = new StringBuilder("hi");
        System.out.println(sb.toString());

        String anotherpalindrome = "Niagara. O roar again!";
        String roar = anotherpalindrome.substring(11, 15);
        System.out.println(roar);

        String s11 = "hareesh";
        String s12=s11.concat("peddineni");
        System.out.println(s12);

        // concatenation (By +)

        String s111 = "Hello";
        String s222 = "World";

        String s333 = "ji";
        String result1234 = s111 + s333 + s222;
        System.out.println(result1234);


        String n = "HarEEshPeDdiNenI";
        System.out.println(n.indexOf("E"));
        System.out.println(n.lastIndexOf("E"));
        System.out.println(n.lastIndexOf("t"));
    }
}
