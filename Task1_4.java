public class Task1_4 {
    public static void main(String[] args)
    {
        int[] arr = {101,5,3,8,0,1,7,99};
        int max = 0;
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] > max)
            {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}