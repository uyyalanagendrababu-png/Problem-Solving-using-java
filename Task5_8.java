import java.util.*;

public class Task5_8 {

    public static List<String> findAndReplacePattern(String[] words, String pattern) {
        int[] p = F(pattern);
        List<String> res = new ArrayList<String>();

        for (String w : words) {
            if (Arrays.equals(F(w), p)) {
                res.add(w);
            }
        }

        return res;
    }

    public static int[] F(String w) {
        HashMap<Character, Integer> m = new HashMap<>();
        int n = w.length();
        int[] res = new int[n];

        for (int i = 0; i < n; i++) {
            m.putIfAbsent(w.charAt(i), m.size());
            res[i] = m.get(w.charAt(i));
        }

        return res;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        String[] words = new String[n];

        for (int i = 0; i < n; i++) {
            words[i] = sc.nextLine();
        }

        String pattern = sc.nextLine();

        List<String> result = findAndReplacePattern(words, pattern);

        for (String s : result) {
            System.out.println(s);
        }

        sc.close();
    }
}