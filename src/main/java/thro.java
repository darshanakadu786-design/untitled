public class thro{
    static void enterAge(int age){
    if(age<18)
        throw new ArithmeticException("NotElligible for Vote");
    else
        System.out.println("Elligible for Vote");
    }
    public static void main(String[]args){
        enterAge(15);
        System.out.println("End The Program");
    }

}