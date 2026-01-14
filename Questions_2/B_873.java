import java.util.HashMap;
import java.util.Scanner;

public class B_873 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int ans = 0;
        int x = 0, y = 0;
        for(int i = 0; i < n; i++){
            if(s.charAt(i) == '1'){
                x++;
            }
            else{
                y++;
            }
            if(map.containsKey(x - y)){
                ans = Math.max(ans, i - map.get(x - y));
            }
            else{
                map.put(x - y, i);
            }
        }
        System.out.println(ans);
    }
}
