import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C_1095 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        int k = sc.nextInt();
        List<Integer> ll = new ArrayList<>();
        for(int i = 0; i < 30; i++){
            if((n & (1 << i)) != 0){
                ll.add(1 << i);
            }
        }
        if(n < k || ll.size() > k){
            System.out.println("NO");
            return;
        }
        int i = 0;
        while (ll.size() < k) {
            if(ll.get(i) != 1){
                int val = ll.get(i) / 2;
                ll.set(i, val);
                ll.add(val);
            }
            else{
                i++;
            }
        }
        System.out.println("YES");
        for(int l : ll){
            System.out.print(l + " ");
        }
    }
}
