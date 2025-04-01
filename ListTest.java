package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListTest {
    public static void main(String[] args){
        ArrayList<String> list=new ArrayList<>();
        list.add("virat");
        list.add("Rohit");
        list.add("Gaurav");

        System.out.println(list);


        List <Integer> list1=new ArrayList<>();
        list1.add(11);
        list1.add(21);
        list1.add(51);
        System.out.println(list1.size());
        System.out.println(list1.get(0));
        list1.clear();
        System.out.println(list1);
        System.out.println("size of list" +list.size());
        List<String> anotherlist= Arrays.asList("Gaurav","Rahul");
        list.addAll(anotherlist);
        System.out.println("Index of "+list.indexOf("Gaurav"));

        List <String> thirdList=List.of("varun","varun");

        System.out.println("third list is"+ thirdList);
        System.out.println(list);
        //list.subList(0,2);
        List<String > sunPlayer=list.subList(0,2);
        System.out.println("Subplayers"+sunPlayer);
    }
}
