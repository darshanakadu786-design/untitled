public class multiCatch{
    public static void main(String[]args){
        try {
            int arr[] = {1, 3, 5};
            System.out.println(arr[1]);
        }catch(ArithmeticException e) {
            System.out.println(e);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
}