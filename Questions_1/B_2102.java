
import java.util.Scanner;

public class B_2102 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] a=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();  
            }
            int mid=(n+1)/2;
            int a1=Math.abs(a[0]);
            int less=0;
            int large=0;
            for(int i=0;i<n;i++){
                int ai=Math.abs(a[i]);
                if(ai<a1){
                    less++;
                }
                else if(ai>a1){
                    large++;
                }
            }
            if(less<mid || large>=mid-1){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
