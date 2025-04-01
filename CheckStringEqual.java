package StringProgram;

public class CheckStringEqual {
    public static void main(String[] args) {
        String  S1="Hello";
        String S2="ello";

        if(S1.equalsIgnoreCase(S2)){
            System.out.println("String is equal");
        }
        else{
            System.out.println("String is not equal");
        }
    }
}
