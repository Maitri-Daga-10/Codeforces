import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int first = Integer.parseInt(st.nextToken());
        int best = first;
        int worst = first;
        int count = 0;
        for (int i = 1; i < n; i++){
            int score = Integer.parseInt(st.nextToken());
            if (score > best){
                best = score;
                count++;
            } 
            else if (score < worst){
                worst = score;
                count++;
            }
        }
        System.out.println(count);
    }
}
