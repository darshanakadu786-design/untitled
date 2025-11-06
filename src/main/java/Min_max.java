import java.util.*;
//find duplicate elements in array
public class Min_max {
    public static void main(String[]args){
        //Scanner sc = new Scanner(system.in);
        int arr[]={1,2,3,4,5,6,2,3,1};
        HashSet<Integer>set=new HashSet<>();

        for(int x: arr){
            if(!set.add(x)){
                System.out.println(x);
            }
        }
    }
}
