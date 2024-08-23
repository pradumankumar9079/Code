import java.util.Scanner;
import java.util.*;

public class ShortestPath {
    public static float getShortestPath(String dir) {
        int x = 0;
        int y = 0;
        dir = dir.toUpperCase();
        char[] ch = dir.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == 'W') {
                x--;
            } else if (ch[i] == 'E') {
                x++;
            } else if (ch[i] == 'N') {
                y++;
            } else if (ch[i] == 'S') {
                y--;
            }
        }
        return (float) Math.sqrt(x * x + y * y);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(getShortestPath(str));

    }
}
