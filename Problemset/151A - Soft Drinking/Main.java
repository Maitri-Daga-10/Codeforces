import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   // number of friends
        int k = sc.nextInt();   // number of bottles
        int l = sc.nextInt();   // ml in each bottle
        int c = sc.nextInt();   // number of limes
        int d = sc.nextInt();   // slices per lime
        int p = sc.nextInt();   // grams of salt
        int nl = sc.nextInt();  // ml drink needed per toast
        int np = sc.nextInt();  // grams salt needed per toast
        // Number of toasts possible from the drink
        int drink = (k * l) / nl;
        // Number of toasts possible from the lime
        int lime = c * d;
        // Number of toasts possible from the salt
        int salt = p / np;
        // The resource that allows the fewest toasts is the limiting resource
        int totalToasts = Math.min(drink, Math.min(lime, salt));
        // All friends must get the same number of toasts
        int answer = totalToasts / n;
        System.out.println(answer);
    }
}
