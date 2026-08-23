import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long min = Long.MAX_VALUE;
        long max = Long.MIN_VALUE;
        long countMin = 0;
        long countMax = 0;
        long[] a = new long[n];
        for (int i = 0; i < n; i++){
            a[i] = sc.nextLong();
            min = Math.min(min, a[i]);
            max = Math.max(max, a[i]);
        }
        for (int i = 0; i < n; i++){
            if (a[i] == min) countMin++;
            if (a[i] == max) countMax++;
        }
        long difference = max - min;
        long ways;
        if (min == max){
            ways = (long) n * (n - 1) / 2;
        } 
        else{
            ways = countMin * countMax;
        }
        System.out.println(difference + " " + ways);
    }
}
