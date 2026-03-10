import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class C_2038 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        int[] a = new int[n];
        Map<Integer, Integer> map = new TreeMap<>();
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
            map.put(a[i], map.getOrDefault(a[i], 0) + 1);
        }
        List<Integer> ll = new ArrayList<>();
        for(int i : map.keySet()){
            if(map.get(i) >= 2){
                for(int j = 0; j < (map.get(i) / 2); j++){
                    ll.add(i);
                }
            }
        }
        if(ll.size() < 4){
            System.out.println("NO");
        }
        else{
            System.out.println("YES");
            int s = ll.size();
            System.out.println(ll.get(0) + " " + ll.get(s - 1) + " " + ll.get(0) + " " + ll.get(1) + " " +ll.get(s - 2) + " " + ll.get(1) + " " + ll.get(s - 2) + " " + ll.get(s - 1));
        }
    }
}
