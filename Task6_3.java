import java.io.*;
import java.util.*;

class Task6_3 {

    static int MAX_CHAR = 26;

    public static String twoStrings(String s1, String s2) {

        boolean v[] = new boolean[MAX_CHAR];

        for (int i = 0; i < s1.length(); i++) {
            v[s1.charAt(i) - 'a'] = true;
        }

        for (int i = 0; i < s2.length(); i++) {
            if (v[s2.charAt(i) - 'a']) {
                return "YES";
            }
        }

        return "NO";
    }

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int q = sc.nextInt();
        sc.nextLine();   // consume newline

        for (int i = 0; i < q; i++) {
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();

            System.out.println(twoStrings(s1, s2));
        }

        sc.close();
    }
}