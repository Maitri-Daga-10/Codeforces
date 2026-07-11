import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] h = new int[n];
        for (int i = 0; i < n; i++){
            h[i] = sc.nextInt();
        }
        int ans = 1;
        for (int i = 0; i < n; i++){
            int count = 1;
            for (int j = i; j > 0; j--){
                if (h[j - 1] <= h[j])
                    count++;
                else
                    break;
            }
            for (int j = i; j < n - 1; j++){
                if (h[j + 1] <= h[j])
                    count++;
                else
                    break;
            }
            ans = Math.max(ans, count);
        }
        System.out.println(ans);
    }
}
