import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B_2147 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        if(n == 1){
            System.out.println("1 1");
            return;
        }
        List<Integer> res = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            res.add(n - i + 1);
        }
        res.add(n);
        for(int i = 1; i < n; i++){
            res.add(i);
        }
        for(int i = 0; i < res.size(); i++){
            System.out.print(res.get(i) + (i == res.size() - 1 ? "\n" : " "));
        }
    }
}
