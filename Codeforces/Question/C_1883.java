
import java.util.Scanner;

public class C_1883 {
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
            if(k!=4){
                int ans=Integer.MAX_VALUE;
                for(int i:a){
                    ans=Math.min(ans,(k-i%k)%k);
                }
                System.out.println(ans);
            }
            else{
                int c=0;
                int ans=Integer.MAX_VALUE;
                for(int i:a){
                    if(i%2==0){
                        c++;
                    }
                    ans=Math.min(ans,(k-i%k)%k);
                }
                System.out.println(Math.min(ans,Math.max(0,2-c)));
            }
        }
    }
}
