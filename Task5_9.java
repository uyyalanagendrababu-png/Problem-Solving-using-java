import java.util.*;

public class Task5_9 {

    public static List<String> stringMatching(String[] words) {

        List<String> res = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {

            for (int j = 0; j < words.length; j++) {

                if (i != j) {

                    if (words[j].contains(words[i])) {
                        res.add(words[i]);
                        break;
                    }
                }
            }
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

        List<String> result = stringMatching(words);

        for (String s : result) {
            System.out.println(s);
        }

        sc.close();
    }
}