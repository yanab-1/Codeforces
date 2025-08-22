
import java.util.Arrays;
import java.util.Scanner;

public class B_2074 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            if(n==1){
                arr[0]=sc.nextInt();
                System.out.println(arr[0]);
                continue;
            }
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();    
            }
            Arrays.sort(arr);
            int ans=arr[n-1];
            for(int i=arr.length-2;i>=0;i--){
                ans+=arr[i]-1;
            }
            System.out.println(ans);
        }
    }
}
