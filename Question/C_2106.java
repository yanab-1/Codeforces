
import java.util.Scanner;

public class C_2106 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int[] a=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            int[] b=new int[n];
            for(int i=0;i<n;i++){
                b[i]=sc.nextInt();
            }
            long x=-1;
            boolean flag=false;
            boolean valid=false;
            for(int i=0;i<n;i++){
                if(b[i]!=-1){
                    long sum=a[i]+b[i];
                    if(!flag){
                        x=sum;
                        flag=true;
                    }
                    else if(sum!=x){
                        valid=true;
                        break;
                    }
                }
            }
            if(valid){
                System.out.println(0);
                continue;
            }
            long left=Long.MIN_VALUE;
            long right=Long.MAX_VALUE;
            for(int i=0;i<n;i++){
                left=Math.max(left,a[i]);
                right=Math.min(right,a[i]+k);
            }
            if(flag){
                System.out.println(x>=left && x<=right?1:0);
            }
            else{
                long ans=(right>=left?right-left+1:0);
                System.out.println(ans);
            }
        }
    }
}
