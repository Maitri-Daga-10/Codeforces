import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int score = 0;
        for (int i = 0; i < n; i++){
            if (s.charAt(i) == 'A'){
                score++;
            } 
            else{
                score--;
            }
        }
        if (score > 0){
            System.out.println("Anton");
        }
        else if (score < 0){
            System.out.println("Danik");
        }
        else{
            System.out.println("Friendship");
        }
    }
}
