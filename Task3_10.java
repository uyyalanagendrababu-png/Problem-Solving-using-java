public class Task3_10{

    public static int AddSub(int N, int opt) {
        int result = 0;
        boolean add;

        if (opt == 1) {
            add = true;  
        } else {
            add = true;   
        }

        for (int i = N; i >= 1; i--) {
            if (add) {
                result += i;
            } else {
                result -= i;
            }


            if (opt == 1) {
                add = !add;   
            } else {
                if (i != N) {
                    add = !add;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(AddSub(6, 1)); 
        System.out.println(AddSub(6, 2)); 
    }
}