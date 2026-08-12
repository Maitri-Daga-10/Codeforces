import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int ans = 0;
        char current = 'a';
        for (char c : s.toCharArray()){
            int diff = Math.abs(c - current);
            ans += Math.min(diff, 26 - diff);
            current = c;
        }
        System.out.println(ans);
    }
}
