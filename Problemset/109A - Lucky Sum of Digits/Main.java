import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int sevens = n / 7; sevens >= 0; sevens--){
            int remaining = n - 7 * sevens;
            if (remaining % 4 == 0){
                int fours = remaining / 4;
                StringBuilder ans = new StringBuilder();
                for (int i = 0; i < fours; i++){
                    ans.append('4');
                }
                for (int i = 0; i < sevens; i++){
                    ans.append('7');
                }
                System.out.println(ans);
                return;
            }
        }
        System.out.println(-1);
    }
}
