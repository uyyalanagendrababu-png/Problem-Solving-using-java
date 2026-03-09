import java.io.*;
import java.util.*;

class Result {

    public static List<Integer> maxSubarray(List<Integer> arr) {

        int maxEndingHere = arr.get(0);
        int maxSoFar = arr.get(0);

        int subsequenceSum = 0;
        int maxElement = arr.get(0);

        for (int i = 0; i < arr.size(); i++) {

            int num = arr.get(i);

            // Kadane's Algorithm (Contiguous Subarray)
            if (i > 0) {
                maxEndingHere = Math.max(num, maxEndingHere + num);
                maxSoFar = Math.max(maxSoFar, maxEndingHere);
            }

            // Non-contiguous subsequence
            if (num > 0) {
                subsequenceSum += num;
            }

            maxElement = Math.max(maxElement, num);
        }

        // If all numbers are negative
        if (subsequenceSum == 0) {
            subsequenceSum = maxElement;
        }

        List<Integer> result = new ArrayList<>();
        result.add(maxSoFar);
        result.add(subsequenceSum);

        return result;
    }
}

public class Task5_3 {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        for (int tItr = 0; tItr < t; tItr++) {

            int n = Integer.parseInt(bufferedReader.readLine().trim());

            String[] arrTemp = bufferedReader.readLine().split(" ");

            List<Integer> arr = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                arr.add(Integer.parseInt(arrTemp[i]));
            }

            List<Integer> result = Result.maxSubarray(arr);

            for (int i = 0; i < result.size(); i++) {
                System.out.print(result.get(i) + " ");
            }

            System.out.println();
        }

        bufferedReader.close();
    }
}