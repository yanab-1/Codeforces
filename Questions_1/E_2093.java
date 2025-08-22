
import java.util.Arrays;
import java.util.Scanner;

public class E_2093 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0) {
            int n=sc.nextInt();
            int k=sc.nextInt();
            int[] a=new int[n];
            for(int i=0;i<n;i++) {
                a[i]=sc.nextInt();
            }
            System.out.println(max(n, k, a));
        }
    }
    public static int max(int n, int k, int[] a) {
        int l=0;
        int h=n+1;
        while(l<h) {
            int mid=(l+h+1)/2;
            if(canSplit(a,k,mid)){
                l=mid;
            } 
            else{
                h=mid-1;
            }
        }
        return l;
    }
    public static boolean canSplit(int[] a,int k,int mex){
        int seg=0;
        boolean[] used=new boolean[mex];
        int curMex=0;
        for(int i=0;i<a.length;i++){
            if(a[i]<mex){
                if( !used[a[i]]){
                    used[a[i]]=true;
                    curMex++;
                }
            }
            if(curMex==mex){
                seg++;
                if(seg==k){
                    return true;
                }
                Arrays.fill(used,false);
                curMex=0;
            }
        }
        return false;
    }
}
