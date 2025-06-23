
import java.util.Scanner;

public class B_1891 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int q=sc.nextInt();
            long[] a=new long[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextLong();
            }
            int[] query=new int[q];
            for(int i=0;i<q;i++){
                query[i]=sc.nextInt();
            }
            print(a,query,n,q);
        }
    }

    private static void print(long[] a, int[] query, int n, int q) {
        int prev=31;
        for(int i:query){
            if(i>=prev){
                continue;
            }
            long val=1L << i; 
            for(int j=0;j<n;j++){
                if(a[j]%val==0){
                    a[j]+=val/2;
                }
            }
            prev=i;
        }
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
}
