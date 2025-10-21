import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class A_2154 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        int k = sc.nextInt();
        String s = sc.next();
        List<Integer> positions = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '1') {
                positions.add(i);
            }
        }
        if(positions.size() == 0){
            System.out.println(0);
            return;
        }
        int ans = 1;
        for(int i = 1; i < positions.size(); i++){
            if(positions.get(i) - positions.get(i - 1) >= k){
                ans++;
            }
        }
        System.out.println(ans);
    }
}
