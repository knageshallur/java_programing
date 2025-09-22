package programs;

public class CountVowelsInString {
    public static void main(String[] args) {


        String s = "helloo java programing";
        char ch[] = s.toCharArray();
        int vowels=0;
        int consonets=0;
        int specialChar=0;
        for (int i = 0; i < ch.length;i++){
            if((ch[i]>='A' && ch[i]<='Z') || (ch[i]>='a' && ch[i]<='z')){
                if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u' ){
                    vowels++;
                }else {
                    consonets++;
                }

            }else {
                specialChar++;
            }
        }
        System.out.println("vowels count is: "+vowels);
        System.out.println("consonets count is: "+consonets);
        System.out.println("special Char count is: "+specialChar);
    }
}
