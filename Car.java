package week2.inter;

public class Car implements Fly, Run{
    public  void doFly(){
        System.out.println("i am not fly");

    }
    public void DoRun(){
        System.out.println("Run the car");
    }
}
