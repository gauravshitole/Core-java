package Collection;

import java.util.LinkedList;

public class LinkListDemo {
    public  static void main(String [] args){
        LinkedList<String > linkedList=new LinkedList<>();
        linkedList.add("Rohit");
        linkedList.add("Virat");
        linkedList.add("Ravi");

        System.out.println(linkedList);
        linkedList.removeFirst();
        System.out.println(linkedList);
        linkedList.addFirst("rahul");
        System.out.println(linkedList);
    }
}
