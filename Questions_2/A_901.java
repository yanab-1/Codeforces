import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class A_901 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
    }

    private static void solve(Scanner sc) {
        int h = sc.nextInt();
        int[] a = new int[h + 1];
        for(int i = 0; i <= h; i++){
            a[i] = sc.nextInt();
        }
        int x = -1;
        for(int i = 0; i < h; i++){
            if(a[i] >= 2 && a[i + 1] >= 2){
                x = i;
            }
        }
        if(x == -1){
            System.out.println("perfect");
        }else{
            List<Integer> l1 = new ArrayList<>();
            List<Integer> l2 = new ArrayList<>();
            l1.add(-1);
            l2.add(-1);
            for(int i = 1; i <= h; i++){
                int s = l1.size() - 1;
                for(int j = 0; j < a[i]; j++){
                    l1.add(s);
                    l2.add(s);
                }
            }
            int sum = 0;
            for(int i = 0; i <= x; i++){
                sum += a[i];
            }
            l2.set(sum, l1.get(sum) - 1);
            System.out.println("ambiguous");
            for(int i : l1){
                System.out.print(i + 1 + " ");
            }
            System.out.println();
            for(int i : l2){
                System.out.print(i + 1 + " ");
            }
            System.out.println();
        }
    }
}
