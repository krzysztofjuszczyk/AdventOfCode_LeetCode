package leetCode.easy;

public class L28_FindIndexFirstOccurrenceInString {
    public static void main(String[] args) {
        L28_FindIndexFirstOccurrenceInString l = new L28_FindIndexFirstOccurrenceInString();
        System.out.println(l.strStr2("leetcode", "et"));
    }
    public int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }

    public int strStr2(String haystack, String needle) {
        int hLen = haystack.length();
        int nLen = needle.length();
        if (haystack.length()<nLen) return -1;

        for (int i = 0; i < hLen-nLen+1; i++) {

            int lastIndexNeedle = 0;
            while (lastIndexNeedle < nLen && haystack.charAt(i + lastIndexNeedle) == needle.charAt(lastIndexNeedle))
                lastIndexNeedle++;
            if (lastIndexNeedle == nLen)
                return i;

        }
        return -1;
    }
}
