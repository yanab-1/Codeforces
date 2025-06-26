import java.util.Scanner;

public class C_2112 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            print(arr,n);
        }
    }

    private static void print(int[] a,int n) {
        long w = 0;
        int max=a[n-1];
        for (int k=2;k<n;k++) {
            int M=(k<n-1?max:a[n-2]);
            int T=Math.max(M,2*a[k]);
            int X=T-a[k];
            int l=0,r=k-1;
            while (l<r) {
                if (a[l]+a[r]>X) {
                    w+=(r-l);
                    r--;
                } else {
                    l++;
                }
            }
        }
        System.out.println(w);
    }
}
