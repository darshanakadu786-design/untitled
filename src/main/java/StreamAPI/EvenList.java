package StreamAPI;
import java.util.stream.*;
import java.util.*;
//Filtering Even Numbers Using Java Stream API
//Using filter() we can get only required elements from a list.
//Streams make data processing more readable & concise.
class EvenList{
    public static void main(String[]args){
        List<Integer>list=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        System.out.println(list);
        list.stream()
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);

    }
}

