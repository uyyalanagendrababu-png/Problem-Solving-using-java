// Normal

/*public class Task2 {
    public static void main(String args[])
    {
        int arr[] = {2,5,8};
        System.out.println(arr[2]);
        for(int n : arr)
        {
            System.out.println(n);
        }
    }
}*/
import java.util.Scanner;
public class Task1_2
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int arr[] = {5,6,7,8,9,10};
        System.out.println("Enter an index value");
        int index = sc.nextInt();

        if(index > 0 && index < arr.length)
        {
            System.out.println("Element at given index is : " + arr[index]);
        }
        else
        {
            System.out.println("Invalid index");
        }
        sc.close();
    }
}