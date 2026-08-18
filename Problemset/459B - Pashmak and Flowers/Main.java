import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
 
        long min = Long.MAX_VALUE;
        long max = Long.MIN_VALUE;
 
        long minCount = 0;
        long maxCount = 0;
 
        for (int i = 0; i < n; i++) {
            long x = sc.nextLong();
 
            if (x < min) {
                min = x;
                minCount = 1;
            } else if (x == min) {
                minCount++;
            }
 
            if (x > max) {
                max = x;
                maxCount = 1;
            } else if (x == max) {
                maxCount++;
            }
        }
 
        long difference = max - min;
        long ways;
 
        if (min == max) {
            // Choose any 2 flowers
            ways = (long) n * (n - 1) / 2;
        } else {
            // Any minimum flower + any maximum flower
            ways = minCount * maxCount;
        }
 
        System.out.println(difference + " " + ways);
    }
}
