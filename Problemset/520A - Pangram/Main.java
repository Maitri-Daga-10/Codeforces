import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        boolean[] present = new boolean[26];
        for (char c : s.toCharArray()){
            if (c >= 'A' && c <= 'Z'){
                c = (char)(c - 'A' + 'a');
            }
            present[c - 'a'] = true;
        }
        for (boolean b : present){
            if (!b){
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}
