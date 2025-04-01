package com.week2;

public class CallByValueTest {
    public void updatenumbers(int firstName, int secondNumber){
        firstName=firstName*2;
        secondNumber=secondNumber*3;
    }

    public static void main(String[] arg){
        int firstName=11;
        int secondNumber=21;

        System.out.println("befor update first nu");
        CallByValueTest callByValueTest=new CallByValueTest();
        callByValueTest.updatenumbers(firstName,secondNumber);

        System.out.println("befor update first is" +firstName +" secondNumber  " +secondNumber);
    }
}
