
import java.util.Scanner;

public class C_2062 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            long []arr=new long[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextLong();
            }
            int end=n;
            long ans=Long.MIN_VALUE;
            for(int i=0;i<n;i++){
                long sum=0;
                for(int j=0;j<end;j++){
                    sum+=arr[j];
                }
                if(i==0){
                    ans=Math.max(ans,sum);
                }
                else{
                    ans=Math.max(ans,Math.max(sum,-sum));
                }
                for (int j=0;j<end-1;j++) {
                    arr[j]=arr[j+1]-arr[j];
                }
                end--;
            }
            System.out.println(ans);
        }
    }
}

