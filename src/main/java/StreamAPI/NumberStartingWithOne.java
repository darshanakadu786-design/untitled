package StreamAPI;
import java.util.stream.*;
import java.util.*;

public class NumberStartingWithOne {
    public static void main(String[]args){
        List<Integer>list=Arrays.asList(1,2,3,11,4,15);
        list.stream()
                .map(n -> n +" ")
                .filter(n -> n.startsWith("1"))
        .forEach(System.out::print);
       // System.out.println(list);
    }
}
//explanation in simple words
//we created a List of integers
//we converted each integer to String (using map(n -> n + " "))//
//we filtered only those Strings which start with "1"
//we printed them
//so output will be: 1 11 15
