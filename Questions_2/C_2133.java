import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C_2133 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        List<List<Integer>> ll = new ArrayList<>();
        List<Integer> l = new ArrayList<>();
        for(int i = 0; i <= n; i++){
            ll.add(new ArrayList<>());
            if(i != 0) l.add(i);
        }
        for(int i = 1; i <= n; i++){
            ll.get(query(i, l, sc)).add(i);
        }
        List<Integer> ans = new ArrayList<>();
        int last = -1;
        for(int i = n; i > 0; i--){
            if(ll.get(i).size() == 0){
                continue;
            }
            if(last == -1){
                ans.add(ll.get(i).get(0));
                last = ans.get(0);
                continue;
            }
            for(int j : ll.get(i)){
                List<Integer> t = new ArrayList<>();
                t.add(last);
                t.add(j);
                if(query(last, t, sc) == 2){
                    ans.add(j);
                    last = j;
                    break;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("! ");
        sb.append(ans.size() + " ");
        for(int j : ans){
            sb.append(j + " ");
        }
        System.out.println(sb.toString().trim());
    }

    private static int query(int i, List<Integer> l, Scanner sc) {
        StringBuilder sb = new StringBuilder();
        sb.append("? ");
        sb.append(i + " " + l.size() + " ");
        for(int j : l){
            sb.append(j + " ");
        }
        System.out.println(sb.toString().trim());
        return sc.nextInt();
    }
}