package ExceptionPro;

public class ArithmaticException {
    public static void main(String[] args)   {
        int d=0;
        int number=56;
        try {
            int Division=number/d;
            System.out.println(Division);
        }catch (Exception e)
        {
            System.out.println(e);
        }


    }
}
