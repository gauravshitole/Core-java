package StringProgram;

public class Addition {
public int num1;
private int num2;
private int num3;

public Addition(int num1,int num2,int num3){
this.num1=num1;
this.num2=num2;
this.num3=num3;

}

    public Addition(int num1) {
    }

    public int add(int num1,int num2){
    return num1+num2;
}
    public int add(int num1,int num2,int num3){
        return num1+num2+num3;
    }
    public String add(){

    return "hello";
    }


public void Display(){
    System.out.println();
}
}
class Substraction extends Addition
{
   private  int num1;
    private int a;
    private int b;
    public Substraction(int a,int b,int num1){
        super(num1);

        this.a=a;
        this.b=b;
    }
    public  int setadd(){
        return a-b;
    }



}