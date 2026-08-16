import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            int n = sc.nextInt();
            int x = sc.nextInt();
            int[] a = new int[n];
            long sum = 0;
            for (int i = 0; i < n; i++){
                a[i] = sc.nextInt();
                sum += a[i];
            }
            if (sum % x != 0){
                System.out.println(n);
                continue;
            }
            int first = -1;
            for (int i = 0; i < n; i++){
                if (a[i] % x != 0){
                    first = i;
                    break;
                }
            }
            int last = -1;
            for (int i = n - 1; i >= 0; i--){
                if (a[i] % x != 0) {
                    last = i;
                    break;
                }
            }
            if (first == -1){
                System.out.println(-1);
            } 
            else{
                int removePrefix = n - first - 1;
                int removeSuffix = last;
                System.out.println(Math.max(removePrefix, removeSuffix));
            }
        }
    }
}
