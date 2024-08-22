import java.util.Scanner;

public class Palindrome {
    public static boolean isPalindrome(String str) {
        str = str.toLowerCase();
        // int start = 0;
        // int end = str.length() - 1;
        // while (start <= end) {
        // if (str.charAt(start) != str.charAt(end)) {
        // return false;
        // }
        // start++;
        // end--;
        // }
        // return true;

        // with for loop4
        for (int i = 0; i < str.length() / 2; i++) {
            int n = str.length();
            if (str.charAt(i) != str.charAt(n - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        boolean res = isPalindrome(str);
        if (res == false) {
            System.out.println("Not Palindrome");
        } else {
            System.out.println("Palindrome");
        }
    }

}