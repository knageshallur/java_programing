package programs;

import java.util.HashMap;

public class FrequencyOfCharectorInString {
    public static void main(String[] args) {
        String s="madam";
        char s1[]=s.toCharArray();
        HashMap<Character, Integer> frequencyMap=new HashMap<Character, Integer>();

        for(char character :s1){

            frequencyMap.put(character,frequencyMap.getOrDefault(character,0)+1);

        }
        for (char c: frequencyMap.keySet()){
            System.out.println(c+"--"+frequencyMap.get(c));
        }
    }
}
