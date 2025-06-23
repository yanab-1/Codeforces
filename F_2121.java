
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
            List<Long> seg = new ArrayList<>();
            for(int i=0;i<n;i++){
                if(a[i]>x){
                    ans+= count(seg, s);
                    seg.clear();
                }else{
                    seg.add(a[i]);
                }
            }
            ans+= count(seg, s);
            seg.clear();
            for(int i=0;i<n;i++){
                if(a[i]>=x){
                    ans-= count(seg, s);
                    seg.clear();
                }else{
                    seg.add(a[i]);
                }
            }
            ans-= count(seg, s);
            seg.clear();
            System.out.println(ans);
        }
    }
    public static long count(List<Long> arr,long tar){
        long res=0;
        long pre=0;
        HashMap<Long,Integer> map=new HashMap<>();
        map.put(0L,1);
        for(int k=0;k<arr.size();k++){
            pre+=arr.get(k);
            long w=pre-tar;
            res+=map.getOrDefault(w, 0);
            map.put(pre, map.getOrDefault(pre, 0)+1);
        }
        return res;
    }
}
