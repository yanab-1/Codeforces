
import java.util.Scanner;

public class B_363{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int ans=Integer.MAX_VALUE;
        int ind=0;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(i>=k-1){
                if(i>k-1){
                    sum-=arr[i-k];
                }
                if(ans>sum){
                    ans=sum;
                    ind=i+1-k;
                }
            }
        }
        System.out.println(ind+1);
    }
}