import java.io.*;
public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        if (s.contains("H") || s.contains("Q") || s.contains("9")){
            System.out.println("YES");
        } 
        else{
            System.out.println("NO");
        }
    }
}
