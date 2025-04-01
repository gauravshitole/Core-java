package ExceptionPro;

import java.util.Scanner;

public class MultipleTryCatch {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        try{
            System.out.println("Enter the number :  ");
            String  number1String=scanner.nextLine();
            int number2;

            try{
                number2=Integer.parseInt(number1String);
            }
        }catch (NumberFormatException e){
            number2=0;

        }
    }
}
