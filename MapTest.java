package Collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapTest {
    public static  void main(String[] args){
        Map<String, Integer> PlayerNameRunsMap=new HashMap<>();
        PlayerNameRunsMap.put("Rohit",1100);
        PlayerNameRunsMap.put("Virat",14000);
        System.out.println(PlayerNameRunsMap);
        System.out.println(" key "+PlayerNameRunsMap.keySet());
        System.out.println(PlayerNameRunsMap.values());
        for(String eachKey:PlayerNameRunsMap.keySet()){
            System.out.println("Key is "+eachKey);
            System.out.println("Value is "+ PlayerNameRunsMap.get(eachKey));
        }
        for(Map.Entry<String,Integer> eachentry:PlayerNameRunsMap.entrySet()){
            System.out.println("entery :" +eachentry.getKey());
            System.out.println("Key  "+eachentry.getValue());
        }
        Map<String,Integer> PlayerLinkHashMap=new LinkedHashMap<>();
        PlayerLinkHashMap.put("Gaurav",1334);
        PlayerLinkHashMap.put("Rohit",4211);
        PlayerLinkHashMap.put("axar",3452);
        System.out.println(PlayerNameRunsMap);

        Map<String,Integer> PlayerTreeMap=new TreeMap<>();
        PlayerTreeMap.put("Rohit",3213);
        PlayerTreeMap.put("Gaurav",3432);
        PlayerTreeMap.put("Virat",24543);
        PlayerTreeMap.put("Virat",24543);
        System.out.println(PlayerTreeMap);
    }

}
