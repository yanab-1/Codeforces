import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class A_2127 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) solve(sc);
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < n; i++){
            int a = sc.nextInt();
            if(a != -1){
                set.add(a);
            }
        }
        if(set.size() <= 1 && !set.contains(0)){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}
