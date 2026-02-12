import java.util.*;


class Task4_2
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-- > 0){
		    int[] left = new int[26];
		    int[] right = new int[26];
		    
		    String s = sc.next();
		    int n = s.length();
		    
		    for(int i = 0; i < n/2; i++){
		        left[s.charAt(i) - 'a']++;
		    }
		    
		    for(int i = (n+1)/2; i < n; i++){
		        right[s.charAt(i) - 'a']++;
		    }
		    
		    boolean flag = true;
		    for(int i = 0; i < 26; i++){
		        if(left[i] != right[i]){
		            flag = false;
		            break;
		        }
		    }
		    
		    if(flag)
		        System.out.println("YES");
		    else
		        System.out.println("NO");
		}
	}
}
