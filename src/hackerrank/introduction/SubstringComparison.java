package hackerrank.introduction;

public class SubstringComparison    {

    public static void main(String[] args) {
        String  s ="hellojava";
        int k = 3;
        System.out.println(getSmallestAndLargest(s,k));
    }

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0,k);
        String largest = s.substring(0,k);

        for (int i = 0; i < s.length()-k+1; i++) {
            String tmp = s.substring(i,i+k);
            if (tmp.compareTo(smallest) <0){
                smallest = tmp;
            }
            if (tmp.compareTo(largest) >0){
                largest = tmp;
            }
        }
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

        return smallest + "\n" + largest;
    }
}
