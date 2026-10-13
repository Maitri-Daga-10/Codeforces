import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long[] x = new long[4];
        for (int i = 0; i < 4; i++){
            x[i] = sc.nextLong();
        }
        Arrays.sort(x);
        long sum = x[3];
        long a = sum - x[2];
        long b = sum - x[1];
        long c = sum - x[0];
        System.out.println(a + " " + b + " " + c);
        sc.close();
    }
}
