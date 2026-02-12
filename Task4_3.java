import java.io.*;
import java.util.*;

public class Task4_3 {

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int aliceScore = 0;
        int bobScore = 0;

        for(int i = 0; i < 3; i++){
            if(a.get(i) > b.get(i)){
                aliceScore++;
            }
            else if(a.get(i) < b.get(i)){
                bobScore++;
            }
        }

        List<Integer> res = new ArrayList<>();
        res.add(aliceScore);
        res.add(bobScore);

        return res;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] aTemp = br.readLine().split(" ");
        String[] bTemp = br.readLine().split(" ");

        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();

        for(int i = 0; i < 3; i++){
            a.add(Integer.parseInt(aTemp[i]));
            b.add(Integer.parseInt(bTemp[i]));
        }

        List<Integer> result = compareTriplets(a, b);

        System.out.println(result.get(0) + " " + result.get(1));

        br.close();
    }
}
