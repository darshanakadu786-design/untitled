import java.util.Scanner;
public class revStr{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The String to be reversed :");
        String s=sc.nextLine();
        String rev="";
        for(int i=s.length()-1;i>=0;i--){
            rev+=s.charAt(i);
        }
        System.out.println("The Answer is : "+rev);
    }
}