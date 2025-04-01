package Collection;

import java.util.*;

public class HashDemo {
    public static  void main(String[] args){
        List<String> nameList=new ArrayList<>();
        nameList.add("virat");
        nameList.add("gaurva");
        nameList.add("virat");

        System.out.println(nameList);

        Set<String>removeDublicate=new LinkedHashSet<>(nameList);
        System.out.println(removeDublicate);

        Set<String> nameset=new HashSet<>();
        nameset.add("virat");
        nameset.add("Gaurav");
        nameset.add("Gaurav");

        System.out.println(nameset);
        Set<Integer> num=new HashSet<>();
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(3);
        System.out.println(num);

    }

}
