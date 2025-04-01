package StringProgram;

public class AdditionTest {
    public static void main(String[] args) {

        Addition addtion =new Addition(11,21,11);
  //      addtion.Display();
        int iAns= addtion.add(11,21,23);
        int Ans2= addtion.add(11,21);
        System.out.println(iAns);
        System.out.println(Ans2);
        String str= addtion.add();
        System.out.println(str);
        Substraction substraction=new Substraction(11,21,21);

        System.out.println(   substraction.setadd());
    }
}