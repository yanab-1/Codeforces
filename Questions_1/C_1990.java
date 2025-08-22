import java.util.Scanner;

public class C_1990 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) solve(sc);
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        int[] a = new int[n];
        long sum = 0;
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
            sum += a[i];
        }
        if(n == 1){
            System.out.println(sum);
            return;
        }
        compute(a);
        for(int i = 0; i < n; i++){
            sum += a[i];
        }
        compute(a);
        for(int i = 0; i < n; i++){
            if(a[i] != 0){
                sum += (n - i) * (long)a[i];
            }
        }
        System.out.println(sum);
    }
    private static void compute(int[] a){
        int n = a.length;
        int[] freq = new int[n + 1];
        int max = 0;
        for(int i = 0; i < n; i++){
            freq[a[i]]++;
            if(freq[a[i]] >= 2 && a[i] > max){
                max = a[i];
            }
            a[i] = max;
        }
    }
}
