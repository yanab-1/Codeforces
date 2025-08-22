
import java.util.Scanner;

public class B_1454 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            int[] count=new int[n+1];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
                count[arr[i]]++;
            }
            int ans=-1;
            int unique=Integer.MAX_VALUE;
            for(int i=0;i<n;i++){
                if(arr[i]<unique){
                    if(count[arr[i]]==1){
                        unique=arr[i];
                        ans=i+1;
                    }
                }
            }           
             System.out.println(ans);
        }   
    }
}
