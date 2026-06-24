import java.util.Scanner;
 
public class StringTask_118A{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().toLowerCase();
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if (ch != 'a' && ch != 'e' && ch != 'i' &&
                ch != 'o' && ch != 'u' && ch != 'y'){
                    ans.append('.');
                    ans.append(ch);
            }
        }
 
        System.out.println(ans);
    }
}
