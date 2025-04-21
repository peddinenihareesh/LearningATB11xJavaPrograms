package ex_13_Functions;

public class Lab130_Simple_Method {
    public static void main(String[] args) {
          // Call
         // int result   = Hareesh_f1();
        int result = return_int();
        System.out.println(result);

        boolean r = return_f3();
        System.out.println(r);




    }

    static void Hareesh_f1(){
        System.out.println("No Return");
    }
    static int return_int(){
        return 10;
    }
    static boolean return_f3(){
        return true;
    }
    static float return_Pi_Value(){
        return 3.14f;
    }
    static byte return_byte(){
        return 100;
    }
    static long return_long(){
        return 101;
    }
    static String return_String(){
        return "Hareesh";
    }
}
