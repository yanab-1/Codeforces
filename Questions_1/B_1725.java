import java.util.Arrays;
import java.util.Scanner;

public class B_1725{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int d=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        int j=n-1;
        int i=0;
        int ans=0;
        while(j>=0){
            int mreq=(d+a[j])/a[j];
            if((j-i+1)>=mreq){
                ans++;
                i+=(mreq-1);
            }
            else{
                break;
            }
            j--;
            
        }
        System.out.println(ans);
    }
}