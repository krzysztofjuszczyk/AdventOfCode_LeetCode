package hackerrank.introduction;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LonelyInteger {

    /*
     * Complete the 'lonelyinteger' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static int lonelyinteger(List<Integer> a) {
        Set<Integer> set = new HashSet<>();
        for (Integer x : a) {
            if (!set.contains(x)){
                set.add(x);
            } else {
                set.remove(x);
            }
        }
        int res=0;
        for (Integer integer : set) {
            res = integer;
        }
        return res;

    }

}

