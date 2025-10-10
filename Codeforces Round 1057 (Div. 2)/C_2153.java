import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class C_2153 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        int[] arr = new int[n];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        long ans = 0;
        long c = 0;
        Set<Integer> set = new TreeSet<>();
        for(int i : map.keySet()){
            int val = map.get(i);
            if(val % 2 == 1) set.add(i);
            ans += 2l * (val / 2) * i;
            c += 2l * (val / 2);
        }
        if(ans == 0){
            System.out.println("0");
            return;
        }
        if (!set.isEmpty()) {
            List<Integer> sorted = new ArrayList<>(set);
            Collections.sort(sorted, Collections.reverseOrder()); 
            for (int i = 0; i < sorted.size(); i++) {
                int x = sorted.get(i);
                if (i == sorted.size() - 1) {
                    if (ans > x) {
                        ans += x;
                        c++;
                    }
                } else {
                    int y = sorted.get(i + 1);
                    if (ans + y > x) {
                        ans += x + y;
                        c += 2;
                        break;
                    }
                }
            }
        }

        if(c < 3) System.out.println("0");
        else System.out.println(ans);
    }
}
