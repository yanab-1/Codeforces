
import java.util.HashMap;
import java.util.Scanner;

public class F_2121 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            long s=sc.nextLong();
            long x=sc.nextLong();
            long[] a=new long[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextLong();
            }
            long ans=0;
            int i=0;
            while(i<n){
                if(a[i]>x){
                    i++;
                    continue;
                }
                int st=i;
                while(i<n && a[i]<=x){
                    i++;
                }
                int end=i-1;
                ans+=count(a,st,end,s);
                int j=st;
                while(j<=end){
                    if(a[j]==x){
                        j++;
                        continue;
                    }
                    int bst=j;
                    while(j<=end && a[j]<x){
                        j++;
                    }
                    int bnd=j-1;
                    ans-=count(a,bst,bnd,s);
                }
            }
            System.out.println(ans);
        }
    }
    public static long count(long[] a,int l,int r,long tar){
        long res=0;
        long pre=0;
        HashMap<Long,Integer> map=new HashMap<>();
        map.put(0L,1);
        for(int k=l;k<=r;k++){
            pre+=a[k];
            long w=pre-tar;
            res+=map.getOrDefault(w, 0);
            map.put(pre, map.getOrDefault(pre, 0)+1);
        }
        return res;
    }
}
