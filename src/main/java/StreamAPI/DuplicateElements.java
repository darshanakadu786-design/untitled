package StreamAPI;
import java.util.*;
import java.util.stream.*;
//Java 8 Stream API program to find duplicate
//elements in a List using filter and Set. Fast and simple functional style solution.
public class DuplicateElements {
    public static void main(String[]args){
        List <Integer>list = Arrays.asList(1,2,3,4,1,2,3,6,8);
        Set<Integer>set=new HashSet<>();
        list.stream()
                .filter(n -> !set.add( n ))
                .forEach(System.out::print );
    }
}
