import java.util.*;

public class Strings {
    public static void printLetters(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
    }

    public static void main(String[] args) {
        // char[] ch = { 'a', 'b', 'c', 'd' };
        // String str = "abcd";
        // String str1 = new String("abcd");
        // System.out.println(str);

        // // Strings are IMMUTABLE

        // Scanner sc = new Scanner(System.in);
        // String name, name1;
        // name = sc.next(); // it take only a word
        // sc.nextLine();
        // name1 = sc.nextLine();// it takes complete line
        // System.out.println(name);
        // System.out.println(name1);

        // String fullName = "Raja raj";
        // System.out.println(fullName.length());// size won't work

        // concatination
        // String firstName = "Raja";
        // String lastName = "raj";
        // String fullName = firstName + " " + lastName;
        // System.out.println(fullName);

        // // Accessing character from string
        // System.out.println(fullName.charAt(0));
        // printLetters(fullName);

        // Comparision of String in Java
        // happend because of interning
        // String s1 = "Tony";
        // String s2 = "Tony";
        // String s3 = new String("Tony");

        // // it check if object is same or not
        // if (s1 == s2) {
        // System.out.println("String are Equal");
        // } else {
        // System.out.println("String are Not Equal");
        // }
        // // for value check
        // if (s1.equals(s3)) {
        // System.out.println("String are Equal");
        // } else {
        // System.out.println("String are Not Equal");
        // }

        // Print All Substring
        String str = "abc";
        // number of substring in a string n*(n+1)/2;
        // print all substring of a given string
        substr(str);

        System.out.println();
        // print particular substring of a given string
        // starting index is included but Ending is not
        String particularSubString = substring(str, 0, 2);
        System.out.println(particularSubString);

        // builtin substring for any index
        // si is included but ei is not included
        System.out.println(str.substring(0, 3));

    }

    static String substring(String str, int si, int ei) {
        String substr = " ";
        for (int i = si; i < ei; i++) {
            substr += str.charAt(i);
        }
        return substr;
    }

    static void substr(String str) {
        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                String sub = "";
                for (int k = i; k <= j; k++) {
                    sub += str.charAt(k);
                }
                System.out.print(sub + " ");
            }

        }
    }
}