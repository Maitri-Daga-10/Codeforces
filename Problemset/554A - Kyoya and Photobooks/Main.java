import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        int ans = 26 * (n + 1) - n;
        System.out.println(ans);
        sc.close();
    }
}
