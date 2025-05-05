public class FindTheIndexOfFirstOccurrenceInAString {
    public int strStr(String haystack, String needle) {
        int size = needle.length();
        int i = 0;
        int j = i + size;

        while (j <= haystack.length()) {
            if (needle.equals(haystack.substring(i, j))) {
                return i;
            }
            i++;
            j++;
        }

        return -1;
    }
}
