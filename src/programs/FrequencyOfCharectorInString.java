package programs;

import java.util.HashMap;

public class FrequencyOfCharectorInString {
    public static void main(String[] args) {
        String s="madam";
        char s1[]=s.toCharArray();
        HashMap<Character, Integer> frequencyMap=new HashMap<Character, Integer>();

        for(char character :s1){

            frequencyMap.put(character,frequencyMap.getOrDefault(character,0)+1);//getOrDefault will get the defulte value with that +1 will add if nothing is present it will return a 0 so it will become 0+1=1 if any number is present like 2 it will become 2+1=3

        }
        for (char c: frequencyMap.keySet()){
            System.out.println(c+"--"+frequencyMap.get(c));
        }
    }
}
