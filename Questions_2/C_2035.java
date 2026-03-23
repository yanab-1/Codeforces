import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class C_2035 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        if(n % 2 == 1){
            List<Integer> ll = solve2(n - 1);
            ll.add(n);
            System.out.println(n);
            for(int i : ll ){
                System.out.print(i + " ");
            }
        }
        else{
            List<Integer> ll = solve2(n);
            System.out.println((1 << ((int) (Math.log10(n) / Math.log10(2)) + 1)) - 1);
            for(int i : ll ){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    private static List<Integer> solve2(int n) {
        if(n == 4){
            return new ArrayList<>(Arrays.asList(2, 1, 3, 4));
        }
        if(n == 6){
            return new ArrayList<>(Arrays.asList(1, 2, 4, 6, 5, 3));
        }
        List<Integer> ll = new ArrayList<>();
        int msb = (int) (Math.log10(n) / Math.log10(2));
        int y = (1 << msb);
        ll.add(y);
        ll.add(y - 1);
        ll.add(y - 2);
        ll.add(3);
        ll.add(1);
        ll.add(2);
        for(int i = 4; i < y - 2; i++){
            ll.add(i);
        }
        for(int i = y + 1; i <= n; i++){
            ll.add(i);
        }
        Collections.reverse(ll);
        return ll;
    }
}
