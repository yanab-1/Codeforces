import java.util.Arrays;
import java.util.Scanner;

public class D_2157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t -- >0){
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        int l = sc.nextInt();
        int r = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int[] sign = new int[n];
        int bal = 0;
        for(int i = 0; i < n; i++){
            if(a[i] < l){
                sign[i] = 1;
                bal++;
            }
            else if(a[i] > r){
                sign[i] = -1;
                bal--;
            }
        }
        int i = 0;
        int j = n - 1;
        while(i < n && j >= 0){
            if(sign[i] == 0 && bal < 0){
                sign[i] = 1;
                bal++;
            }
            if(sign[j] == 0 && bal > 0){
                sign[j] = -1;
                bal--;
            }
            i++;
            j--;
        }
        int c = 0;
        for(i = 0; i < n; i++){
            if(sign[i] == 0){
                c++;
            }
        }
        int half = c / 2;
        c = 0;
        for(i = 0; i < n && c < half; i++){
            if(sign[i] == 0){
                sign[i] = 1;
                c++;
            }
        }
        c = 0;
        for(i = n - 1; i >= 0 && c < half; i--){
            if(sign[i] == 0){
                sign[i] = -1;
                c++;
            }
        }
        long s1 = 0;
        long s2 = 0;
        for(i = 0; i < n; i++){
            if(sign[i] == 1){
                s1 += l - a[i];
                s2 += r - a[i];
            }
            else if(sign[i] == -1){
                s1 += a[i] - l;
                s2 += a[i] - r;
            }
        }
        System.out.println(Math.min(s1, s2));
    }
}
