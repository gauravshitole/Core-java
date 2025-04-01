package Collection;

import java.util.LinkedHashMap;
import java.util.Map;

public class FindFrequencyOfChar {
    public static void main(String[] args){
        String str="Virat is Very good batman , viratnhas broken many records of Sachin";
        System.out.println(findFreqen(str));

    }
    public static Map<String,Integer > findFreqen(String str){
        String[] words=str.split(" ");
        Map<String,Integer> map=new LinkedHashMap();

        for(String  word:words){
            if(map.containsKey(word)){
            Integer ians= map.get(word);
            map.put(word,ians+1);
            }
            else{
                map.put(word,1);
            }
        }
        return map;

    }
}
