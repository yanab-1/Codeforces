
import java.util.Scanner;

public class D_2106 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);  
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            int[] a=new int[n];
            int[] b=new int[m];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            for(int i=0;i<m;i++){
                b[i]=sc.nextInt();
            }
            System.out.println(ans(a,b,n,m));
        }
    }
    public static int ans(int[] a,int[] b,int n,int m){
        int j=0;
        for(int i=0;i<n && j<m;i++){
            if(a[i]>=b[j]){
                j++;
            }
        }
        if(j>=m){
            return 0;
        }
        int[] left=new int[n+1];
        for(int i=1;i<=n;i++){
            left[i]=left[i-1];
            if(left[i]<m && a[i-1]>=b[left[i]]){
                left[i]++;
            }
        }
        int[] right=new int[n+1];
        for(int i=n-1;i>=0;i--){
            right[i]=right[i+1];
            if(right[i]<m && a[i]>=b[m-1-right[i]]){
                right[i]++;
            }
        }
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<=n;i++){
            int mat=left[i];
            if(mat<m){
                int ne=m-mat-1;
                if(right[i]>=ne){
                    ans=Math.min(ans,b[mat]);
                }
            }
        }
        return ans==Integer.MAX_VALUE?-1:ans;
    }
}
