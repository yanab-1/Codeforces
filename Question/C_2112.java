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
        long ans=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                int x=Math.max(a[n-1],2*a[i])-a[i]-a[j];
                int k=search(a,0,j,x);
                ans+=j-k;
            }
        }
        System.out.println(ans);
    }

    private static int search(int[] a, int i, int j, int x) {
        int l=i;
        int r=j-1;
        while(l<=r){
            int m=l+(r-l)/2;
            if(a[m]<=x){
                l=m+1;
            } else {
                r=m-1;
            }
        }
        return l;
    }
}
