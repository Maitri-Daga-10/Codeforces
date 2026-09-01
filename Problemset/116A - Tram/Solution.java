import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int current = 0;
        int capacity = 0;
        for (int i = 0; i < n; i++){
            int a = sc.nextInt(); 
            int b = sc.nextInt(); 
            current -= a;
            current += b;
            capacity = Math.max(capacity, current);
        }
        System.out.println(capacity);
        sc.close();
    }
}
