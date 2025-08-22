
import java.util.Scanner;

public class B_1582 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] a=new int[n];
            int c0=0;
            int c1=0;
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
                if(a[i]==0){
                    c0++;
                }
                else if(a[i]==1){
                    c1++;
                }
            }
            System.out.println(c1*(long)(Math.pow(2,c0)));
        }
    }
}
