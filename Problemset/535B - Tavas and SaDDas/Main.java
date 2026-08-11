import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        int len = n.length();
        int answer = (1 << len) - 2;
        for (int i = 0; i < len; i++){
            if (n.charAt(i) == '7'){
                answer += 1 << (len - i - 1);
            }
        }
        answer++;
        System.out.println(answer);
    }
}
