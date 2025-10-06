import java.util.HashMap;
import java.util.Scanner;

public class C_2145 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t -- >0){
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
            int len = sc.nextInt();
            String str = sc.next();
            int cntA = 0;
            for (int i = 0; i < len; i++) {
                if (str.charAt(i) == 'a') cntA++;
            }
            int cntB = len - cntA;
            if (cntA == cntB) {
                System.out.println(0);
                return;
            }
            int diff = cntA - cntB;
            int ans = len;
            HashMap<Integer, Integer> map = new HashMap<>();
            map.put(0, 0);
            int pref = 0;
            for (int i = 0; i < len; i++) {
                pref += (str.charAt(i) == 'a') ? 1 : -1;
                Integer pos = map.get(pref - diff);
                if (pos != null) {
                    int curLen = (i + 1) - pos;
                    if (curLen < ans) ans = curLen;
                }
                map.put(pref, i + 1);
            }
            if (ans == len) System.out.println(-1);
            else System.out.println(ans);


    }
}
