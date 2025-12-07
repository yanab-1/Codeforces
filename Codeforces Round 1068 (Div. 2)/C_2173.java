import java.util.*;

public class C_2173 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) solve(sc);
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        int k = sc.nextInt();
        TreeSet<Integer> set = new TreeSet<>();
        HashSet<Integer> set1 = new HashSet<>();
        for(int i = 0; i < n; i++){
            int x = sc.nextInt();
            set.add(x);
            set1.add(x);
        }
        List<Integer> ll = new ArrayList<>();
        while(!set.isEmpty()){
            int x = set.first();
            ll.add(x);
            for(int i = x; i <= k; i+=x){
                if(set1.contains(i)){
                    set.remove(i);
                }
                else{
                    System.out.println(-1);
                    return;
                }
            }
        }
        System.out.println(ll.size());
        for(int i : ll){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
