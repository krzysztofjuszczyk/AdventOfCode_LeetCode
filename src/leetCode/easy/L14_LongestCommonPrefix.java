package leetCode.easy;


public class L14_LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {return "";}
        String result = strs[0];

        for (String s :
                strs) {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) != result.charAt(i)){
                    result = result.substring(0, i);
                    break;
                }
            }
        }

        if (result.isEmpty()){return "";}
        else return result;
    }

    public static void main(String[] args) {
                String [] test = new String[]{"flower", "flow", "flight"};
                L14_LongestCommonPrefix obj = new L14_LongestCommonPrefix();
        System.out.println(obj.longestCommonPrefix(test));
    }
}
