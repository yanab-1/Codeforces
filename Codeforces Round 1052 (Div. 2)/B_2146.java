
import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class B_2146 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<TreeSet<Integer>> ll = new ArrayList<>();
        int[] freq = new int[m + 1];
        for(int i = 0; i < n; i++){
            ll.add(new TreeSet<>());
            int l = sc.nextInt();
            for(int j = 0; j < l; j++){
                int x = sc.nextInt();
                freq[x]++;
                ll.get(i).add(x);
            }
        }
        for(int i = 1; i <= m; i++){
            if(freq[i] == 0){
                System.out.println("NO");
                return;
            }
        }
        int r = 0; 
        for(TreeSet<Integer> ts : ll){
            for(int i : ts){
                if(freq[i] == 1){
                    r++;
                    break;
                }
            }
        }
        if(n - r >= 2){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
