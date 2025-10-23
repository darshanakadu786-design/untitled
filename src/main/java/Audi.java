public class Audi{
    public static void main(String[] arg){
       try{
           int a=10/0;
       }catch(ArithmeticException e){
           System.out.println(e);
       }

        System.out.println("Helo Program continued successfully");
    }
}