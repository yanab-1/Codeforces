import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class B_451 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);    
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = a[i];
        }
        Arrays.sort(b);
        for(int i = 0; i < n; i++){
            map.put(b[i], i + 1);
        }
        for(int i = 0; i < n; i++){
            a[i] = map.get(a[i]);
        }
        int r = -1;
        int l = -1;
        for(int i = 0; i < n - 1; i++){
            if(a[i] != i + 1){
                l = i;
                break;
            }
        }
        for(int i = n - 1; i >= 0; i--){
            if(a[i] != i + 1){
                r = i;
                break;
            }
        }
        if(l == -1 && r == -1){
            System.out.println("yes");
            System.out.println(1 + " " + 1);
            return;
        }
        reverse(a, l, r);
    }

    private static void reverse(int[] a, int l, int r) {
        int le = l;
        int re = r;
        while(l < r){
            int temp = a[l];
            a[l] = a[r];
            a[r] = temp;
            l++;
            r--;
        }
        for(int i = 0; i < a.length; i++){
            if(a[i] != i + 1){
                System.out.println("no");
                return;
            }
        }
        System.out.println("yes");
        System.out.println((le + 1) + " " + (re + 1));
    }
    
}
