package Collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDublicateArrayList {
    public  static void main(String[]  args){

        List<String> inputList= Arrays.asList("gaurav","rohit","gaurav");
        Set<String> outputSet=removeDublicateFromList(inputList);
        System.out.println(inputList);
        System.out.println(outputSet);

    }
    public static Set<String> removeDublicateFromList(List<String> inputList){
        Set<String>outputSet=new HashSet<>();
        outputSet.addAll(inputList);
        return outputSet;
    }

}
