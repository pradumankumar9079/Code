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
        String firstName = "Raja";
        String lastName = "raj";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);

        // Accessing character from string
        System.out.println(fullName.charAt(0));
        printLetters(fullName);
    }
}