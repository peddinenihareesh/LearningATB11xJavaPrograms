package ex_03_Literals;

public class Lab034_Char_Literal {
    public static void main(String[] args) {

        char c1 = 'A'; // A to Z a-z, !@#$%^&*()_+
        //char c2 = "A"; // this is not a char, it is string

        char C2 = 'B';
        char C3 = '@';
        char C4 = '_';
        char C5 = '9';
        char C6 = '1';
        char C7 = '(';
        char C8 = ' '; // blank space

        // Excape char
        char new_line = '\n';
        char tab_line = '\t';
        char back_space = '\b';
        char carriage_return = '\r';

        //System.out.println("HareeshPeddineni");
        //System.out.println("Hareesh"+new_line+"Peddineni");
        System.out.println("Hareesh"+'\n'+"Peddineni");
        System.out.println("Hareesh"+tab_line+"Peddineni");
        System.out.println("Hareesh"+back_space+"Peddineni");
        System.out.println("Hareesh"+carriage_return+"Peddineni");


        System.out.println("Hi, This is first line"+new_line+ "This is Second line\n This is third line");

        char c10 = 'A';
        // ASCII, (Limited numbers) - A -> 65

        char rupees = '₹';
        System.out.println(rupees);

        char my_lugh_Smile = '\u1f60';  // :)
        System.out.println(my_lugh_Smile);
    }

}
