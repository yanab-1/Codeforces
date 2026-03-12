import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;

public class A_2097 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) solve(sc);
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        int[] a = new int[n];
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
            map.put(a[i], map.getOrDefault(a[i], 0) + 1);
        }
        List<int[]> ll = new ArrayList<>();
        for(int i : map.keySet()){
            if(map.get(i) >= 4){
                System.out.println("Yes");
                return;
            }
            ll.add(new int[]{i, map.get(i)});
        }
        int s = ll.size();
        for(int i = 0; i < ll.size(); i++){
            int r = i;
            while(r + 1 < s && ll.get(r + 1)[0] == ll.get(r)[0] + 1){
                r++;
            }
            int cnt = 0;
            for(int j = i; j <= r; j++){
                cnt += ll.get(j)[1] >= 2 ? 1 : 0;
            }
            if(cnt >= 2){
                System.out.println("YES");
                return;
            }
            i = r;
        }
        System.out.println("NO");
    }
}
