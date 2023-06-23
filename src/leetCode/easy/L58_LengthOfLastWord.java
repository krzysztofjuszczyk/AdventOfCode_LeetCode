package leetCode.easy;

public class L58_LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        String[] words = s.split(" ");
        int l = words.length;
        return words[l-1].length();
    }
}
