class finallyBlock{
      public static void main(String[]args){
        try{
            int s=10/0;

        }catch(ArithmeticException e){
            System.out.println("Exception Handeled");
        }finally{
            System.out.println("Finally block always executes");

        }
    }
}