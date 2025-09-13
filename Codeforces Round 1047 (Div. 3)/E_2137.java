import java.util.Scanner;

public class E_2137 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        long k = sc.nextLong();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        int[] mex = transformOnce(a, n);
        long sum = 0;
        for(int i : mex){
            sum += i;
        }
        if(k == 1){
            System.out.println(sum);
            return;
        }
        a = mex;
        mex = transformOnce(a, n);
        sum = 0; 
        for(int i = 0; i < n; i++){
            sum += mex[i];
        }
        if(k == 2){
            System.out.println(sum);
            return;
        }
        int[] freq = new int[n + 2];
        for(int i : mex){
            freq[i]++;
        }
        sum = 0;
        int ind = 0;
        while(freq[ind] == 1){
            sum += ind;
            ind++;
        }
        if(freq[ind] == 0 && (ind + 1) < freq.length && freq[ind + 1] == 0){
            System.out.println(sum);
            return;
        }
        if(freq[ind] == 0){
            ind++;
            if(k % 2 == 0){
                sum += (long) freq[ind] * ind;
            }
            else{
                sum += (long) freq[ind] * (ind - 1);
            }
            System.out.println(sum);
            return;
        }
        if(k % 2 == 0){ 
            sum += (long) freq[ind] * ind;
        }
        else{
            sum += (long) freq[ind] * (ind + 1);
        }
        System.out.println(sum);
    }
    private static int[] transformOnce(int[] arr, int n) {
        int[] freq = new int[n + 1];
        for (int v : arr) {
            if (v <= n) freq[v]++;
        }
        int mex = 0;
        while (mex <= n && freq[mex] > 0) mex++;

        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            int val = arr[i];
            if (val < mex && freq[val] == 1) res[i] = val;
            else res[i] = mex;
        }
        return res;
    }
}
