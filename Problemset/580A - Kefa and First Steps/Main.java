import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        int count = 1;
        int max = 1;
        for (int i = 1; i < n; i++){
            if (a[i] >= a[i - 1]){
                count++;
            } 
            else{
                count = 1;
            }
            max = Math.max(max, count);
        }
        System.out.println(max);
    }
}
