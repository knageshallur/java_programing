package programs;

public class ReplaceVowelsWithX {
    public static void main(String[] args) {
        String s="nagesh";
        char s1[]=s.toCharArray();
        StringBuilder sb=new StringBuilder();
        for(char eachchar:s1){
            if(eachchar=='a'||eachchar=='e'||eachchar=='i'||eachchar=='o'||eachchar=='u'){
                sb.append("x");
            }else{
                sb.append(eachchar);
            }
        }
        System.out.println(sb);
    }
}
