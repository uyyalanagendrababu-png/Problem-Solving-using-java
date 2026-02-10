import java.util.*;

public class Task5_1 {
	public static int maxSubArray(int[] nums) {
        int c_sum = 0;
        int m_sum = nums[0];

        for(int i =0; i<nums.length; i++){
            c_sum = Math.max(nums[i], c_sum + nums[i]);
            m_sum = Math.max(m_sum , c_sum);
        }

        return m_sum;
    }
	
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println(maxSubArray(arr));
	}
}
