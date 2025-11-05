import java.util.Scanner;
public class countVovels {
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        String s= sc.nextLine().toLowerCase();
        int vowels =0;int consonants = 0;

        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);

            if("aeiou".indexOf(c) != -1){
                vowels++;

            }
            else if(c >= 'a' && c <= 'z'){
                consonants++;
            }
        }
        System.out.println(vowels);
        System.out.println(consonants);
    }
}
