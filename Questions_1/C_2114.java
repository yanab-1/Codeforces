
import java.util.Scanner;

public class C_2114 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] a=new int[n];
            int l=Integer.MIN_VALUE;
            int c=0;
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
                if(a[i]>l+1){
                    c++;
                    l=a[i];
                }
            }
            System.out.println(c);
        }
    }
}
