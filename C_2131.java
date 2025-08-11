import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class C_2131 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) solve(sc);
    }
    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        int k = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> s = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int x = (sc.nextInt()) % k;
            a.add(x);
            a.add(k - x);
        }
        for (int i = 0; i < n; i++) {
            int x = (sc.nextInt()) % k;
            s.add(x);
            s.add(k - x);
        }
        Collections.sort(a);
        Collections.sort(s);
        for(int i=0;i<a.size();i++){
            if(!a.get(i).equals(s.get(i))){
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}
