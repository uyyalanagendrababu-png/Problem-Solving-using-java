import java.io.*;
import java.util.*;

public class Task5_2 {

    public static int birthday(List<Integer> s, int d, int m) {
        int n = s.size();
        int count = 0;

        for (int i = 0; i <= n - m; i++) {
            int sum = 0;
            for (int j = i; j < i + m; j++) {
                sum += s.get(j);
            }
            if (sum == d) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine().trim());

        String[] arr = br.readLine().trim().split(" ");
        List<Integer> s = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            s.add(Integer.parseInt(arr[i]));
        }

        String[] dm = br.readLine().trim().split(" ");
        int d = Integer.parseInt(dm[0]);
        int m = Integer.parseInt(dm[1]);


        int result = birthday(s, d, m);


        bw.write(String.valueOf(result));
        bw.newLine();
        bw.flush();
    }
}
