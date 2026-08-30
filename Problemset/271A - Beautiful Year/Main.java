import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        y++;
        while (true){
            String s = String.valueOf(y);
            if (s.charAt(0) != s.charAt(1) &&
                s.charAt(0) != s.charAt(2) &&
                s.charAt(0) != s.charAt(3) &&
                s.charAt(1) != s.charAt(2) &&
                s.charAt(1) != s.charAt(3) &&
                s.charAt(2) != s.charAt(3)){
                System.out.println(y);
                break;
            }
            y++;
        }
        sc.close();
    }
}
