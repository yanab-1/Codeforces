
import java.util.*;

public class C_2092 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            long[] a=new long[n];
            List<Long> odd=new ArrayList<>();
            List<Long> even=new ArrayList<>();
            long max=Long.MIN_VALUE;
            long sum_even=0;
            long sum_odd=0;
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
                max=Math.max(max,a[i]);
                if(a[i]%2==0){
                    even.add(a[i]);
                    sum_even+=a[i];
                }
                else{
                    odd.add(a[i]);
                    sum_odd+=a[i];
                }
            }
            if(even.isEmpty() || odd.isEmpty()){
                System.out.println(max);
            }
            else{
                System.out.println(sum_even+sum_odd-(odd.size()-1));
            }
        }
    }
}
