import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder out = new StringBuilder();
 
        int t = Integer.parseInt(br.readLine());
 
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
 
            if (n < 31) {
                out.append("NO\n");
            } 
            else if (n == 36) {
                out.append("YES\n");
                out.append("5 6 10 15\n");
            } 
            else if (n == 40) {
                out.append("YES\n");
                out.append("3 6 10 21\n");
            } 
            else if (n == 44) {
                out.append("YES\n");
                out.append("6 7 10 21\n");
            } 
            else {
                out.append("YES\n");
                out.append("6 10 14 ").append(n - 30).append("\n");
            }
        }
 
        System.out.print(out);
    }
}
