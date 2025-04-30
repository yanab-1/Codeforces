
import java.util.Arrays;
import java.util.Scanner;

public class A_1876 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int p=sc.nextInt();
            int[] a=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            int[] b=new int[n];
            for(int i=0;i<n;i++){
                b[i]=sc.nextInt();
            }
            Integer[] ord=new Integer[n];
            for(int i=0;i<n;i++){
                ord[i]=i;
            }
            Arrays.sort(ord,(i,j)->b[i]-b[j]);
            long ans=p;
            int k=n-1;
            for(int i:ord){
                while(k>0 && a[i]>0){
                    a[i]--;
                    ans+=Math.min(p,b[i]);
                    k--;
                }
            }
            System.out.println(ans);
        }
    }
}
