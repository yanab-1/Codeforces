
import java.util.Scanner;

public class A_1901 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int x=sc.nextInt();
            int[] a=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            int m=a[0]-0;
            for(int i=1;i<n;i++){
                m=Math.max(m,a[i]-a[i-1]);
            }
            m=Math.max(m,2*(x-a[n-1]));
            System.out.println(m);
        }
    }
}
