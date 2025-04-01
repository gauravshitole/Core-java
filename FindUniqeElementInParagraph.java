package Collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class FindUniqeElementInParagraph {

    public static void main(String [] args){
        String sentance="Virat is very good batsman , Virat has Broken many records of Sachin";

        System.out.println(findUniqeElementInsentance(sentance));
        System.out.println(FindUniqChar(sentance));
    }
    public static Set<String > findUniqeElementInsentance(String  sentance){
        String[] words=sentance.split(" ");
        Set<String>unqWords=new HashSet<>();
        for(String word:words){
           unqWords.add(word);
        }
        return unqWords;

    }
    public static Set<String >FindUniqChar(String  word){
        String [] charactors=word.split("");
        Set<String>unqWords=new LinkedHashSet<>();
        for(String charactor:charactors){
            unqWords.add(charactor);

        }
        return unqWords;

    }
}
