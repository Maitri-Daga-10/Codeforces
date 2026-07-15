import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        int count = 0;
        for (int i = 0; i < n.length(); i++){
            char ch = n.charAt(i);
            if (ch == '4' || ch == '7'){
                count++;
            }
        }
        if (isLucky(count)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
    static boolean isLucky(int num){
        if (num == 0) return false;
        while (num > 0){
            int digit = num % 10;
            if (digit != 4 && digit != 7){
                return false;
            }
            num /= 10;
        }
        return true;
    }
}
