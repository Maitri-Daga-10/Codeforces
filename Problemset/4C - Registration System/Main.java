import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<String, Integer> map = new HashMap<>();
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < n; i++){
            String name = sc.next();
            if (!map.containsKey(name)){
                map.put(name, 1);
                output.append("OK\n");
            } 
            else{
                int count = map.get(name);
                String newName = name + count;
                while (map.containsKey(newName)){
                    count++;
                    newName = name + count;
                }
                map.put(newName, 1);
                map.put(name, count + 1);
                output.append(newName).append("\n");
            }
        }
        System.out.print(output);
    }
}
