package hackerrank.medium;

import java.util.List;

public class PalindromeArray {
    public static void main(String[] args) {

    }

    public int findMinArrayChanges(List<Integer> arr){
        int minNum = 0;
        if (arr.size() == 1) {return 0;}
        for (int left = 0, right = arr.size()-1; left  < right;) {
//            System.out.println(left + "," + right + ":" + arr + " " + minNum);

            if (arr.get(left) == arr.get(right)){
                System.out.println("equals");
                left++;
                right--;
                continue;
            }
            else if(arr.get(right) > arr.get(left)){
                //merge left
                left++;
                arr.set(left, (arr.get(left - 1) + arr.get(left)));
//                arr.remove(left);
                minNum++;

            }
            else if (arr.get(left) > arr.get(right)){
                //merge right
                right--;
                arr.set(right, (arr.get(right + 1) + arr.get(right)));
//                arr.remove(right);
                minNum++;
            }
        }
        return minNum;
    }

}
