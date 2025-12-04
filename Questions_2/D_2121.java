import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class D_2121 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) solve(sc);
    }
    static List<int[]> ll;
    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        ll = new ArrayList<>();
        for(int i = 1; i < a.length; i++){
            for(int j = 0; j < a.length - i; j++){
                if(a[j] > a[j + 1]){
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    ll.add(new int[]{1, j + 1});
                }
            }
        }
        for(int i = 0; i < n; i++){
            b[i] = sc.nextInt();
        }
        for(int i = 1; i < b.length; i++){
            for(int j = 0; j < b.length - i; j++){
                if(b[j] > b[j + 1]){
                    int temp = b[j];
                    b[j] = b[j + 1];
                    b[j + 1] = temp;
                    ll.add(new int[]{2, j + 1});
                }
            }
        }
        for(int i = 0; i < n; i++){
            if(a[i] > b[i]){
                ll.add(new int[]{3, i + 1});
            }
        }
        System.out.println(ll.size());
        for(int[] i : ll){
            System.out.println(i[0] + " " + i[1]);
        }
    }
}
