import java.util.Scanner;
public class Translation_41A{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        if (s.length() != t.length()){
            System.out.println("NO");
            return;
        }
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) != t.charAt(s.length() - 1 - i)){
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}
