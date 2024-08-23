public class LargestString {

    // Largest Stirng on based on Length
    static String printLargestString(String str[]) {
        String ans = "";
        int maxi = Integer.MIN_VALUE;
        for (int i = 0; i < str.length; i++) {
            int len = str[i].length();
            if (maxi < len) {
                maxi = len;
                ans = str[i];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String str[] = { "apple", "mango", "banana" };

        // Based on length
        // String ans = printLargestString(str);
        // System.out.println("Largest String is " + ans);

        // Based on Lexicographical oreder

        // A negative integer if the current string is lexicographically less than the
        // string argument.
        // Zero if the current string is equal to the string argument.
        // A positive integer if the current string is lexicographically greater than
        // the string argument.

        String ans = "";
        for (int i = 0; i < str.length - 1; i++) {
            if (str[i].compareTo(str[i + 1]) > 0) {
                ans = str[i];
            }
        }
        System.out.println("Largest String is " + ans);
    }
}
