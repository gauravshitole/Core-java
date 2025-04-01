package Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetDemo {
    public  static void main(String[] args){

        List<String> names1=new ArrayList<>();
        names1.add("manoj");
        names1.add("Ganesh");
        names1.add("ravi");
        System.out.println(names1);
        Set<String> names =new HashSet<>();
        names.add("virat");
        names.add("Rohit");
        names.add("Rohit");
        System.out.println(names);
    }
}
