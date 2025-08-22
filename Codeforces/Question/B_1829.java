
import java.util.Scanner;

public class B_1829{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] a=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            int ans=0;
            int c=0;
            for(int i=0;i<n;i++){
                if(a[i]==0){
                    c++;
                }
                else{
                    ans=Math.max(ans,c);
                    c=0;
                }
            }
            System.out.println(Math.max(ans,c));
        }
    }
}