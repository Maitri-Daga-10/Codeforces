import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            int n = sc.nextInt();
            int firstDigit = n / 10;
            int secondDigit = n % 10;
            System.out.println(firstDigit + secondDigit);
        }
        sc.close();
    }
}
