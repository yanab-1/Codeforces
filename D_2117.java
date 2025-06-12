
import java.util.Scanner;

public class D_2117 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            long[] a=new long[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            int c=0;
            long diff=a[1]-a[0];
            for(int i=1;i<n;i++){
                if(a[i]-a[i-1]!=diff){
                    System.out.println("no");   
                    c=1;
                    break;
                }
            }
            if(c==1){
                continue;
            }
            long y=a[0]-diff;
            long x=a[0]+diff*n;
            if(y>=0 && x>=0 && y%(n+1)==0){
                System.out.println("yes");
            }
            else{
                System.out.println("no");
            }
        }
    }
}
