import java.util.ArrayList;
import java.util.Scanner;

public class C_2139 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t -- > 0){
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        int k = sc.nextInt();
        long x = sc.nextLong();
        long initial = 1L << k; 
        long total = 1L << (k + 1);
        if(x == initial){
            System.out.println(0);
            System.out.println();
            return;
        }       
        ArrayList<Integer> ll = new ArrayList<>();
        int c = 0;
        while (x != initial && c <= 120) {
            long t = x * 2;
            if (t < total) {
                ll.add(1);
                x = t;
            } else {
                ll.add(2);
                x = t - total;
            }
            c++;
        }
        System.out.println(ll.size());
        for(int i = ll.size() - 1; i >= 0 ; i--){
            System.out.print(ll.get(i) + " ");
        }
        System.out.println();
    }
}
