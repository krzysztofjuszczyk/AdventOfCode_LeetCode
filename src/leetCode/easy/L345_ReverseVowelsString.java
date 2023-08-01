package leetCode.easy;

public class L345_ReverseVowelsString {
    public String reverseVowels(String s) {
        final String vowels = "aeiouAEIOU";
        int first = 0, last = s.length() - 1;
        char[] array = s.toCharArray();
        while (first < last) {
            while (first < last && vowels.indexOf(array[first]) == -1) {
                first++;
            }
            while (first < last && vowels.indexOf(array[last]) == -1) {
                last--;
            }
            char temp = array[first];
            array[first] = array[last];
            array[last] = temp;
            first++;
            last--;
        }
        return new String(array);

    }
}
