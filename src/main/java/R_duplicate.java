import java.util.*;
class R_duplicate{
    public static void main(String[] args) {
        int[] arr = {1, 2,2,33,4,4,5,6,3,4,2,1};
        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        for (int x : arr) {
            set.add(x);
                //System.out.println(x);

            }
        System.out.println(set);
    }
}