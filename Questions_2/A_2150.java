import java.util.Scanner;
import java.util.TreeSet;

public class A_2150 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        String s = sc.next();
        TreeSet<Integer> set = new TreeSet<>();
        for(int i = 0; i < m; i++){
            set.add(sc.nextInt());
        }
        int cur = 1;
        for(char c : s.toCharArray()){
            cur++;
            if(c == 'B'){
                while(set.contains(cur)) cur++;
            }
            set.add(cur);
            if(c == 'B'){
                while (set.contains(cur)) {
                    cur++;
                }
            }
        }
        System.out.println(set.size());
        for(int i : set){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
