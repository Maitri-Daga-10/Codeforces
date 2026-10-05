import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int freePolice = 0;
        int untreated = 0;
        for (int i = 0; i < n; i++){
            int event = sc.nextInt();
            if (event == -1){
                if (freePolice > 0){
                    freePolice--;
                } 
                else{
                    untreated++;
                }
            } 
            else{
                freePolice += event;
            }
        }
        System.out.println(untreated);
        sc.close();
    }
}
