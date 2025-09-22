package programs;

import java.util.LinkedHashSet;

public class UniqueCharactors {
    public static void main(String[] args) {
        String s="acbbebbsadns";
        char inputArray[]=s.toCharArray();
        LinkedHashSet<Character> set=new LinkedHashSet<>();
        StringBuilder sb=new StringBuilder();

        for(char c:inputArray){
            set.add(c);
        }
        for (char c:set){
            sb.append(c);
        }
        System.out.println(sb);
    }
}
