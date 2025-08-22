
import java.util.Scanner;

public class B_1794 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] a=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            if(a[0]==1){
                a[0]++;
            }
            for(int i=1;i<n;i++){
                if(a[i]==1){
                    a[i]++;
                }
                while(a[i]%a[i-1]==0){
                    a[i]++;
                }
            }
            for(int i=0;i<n;i++){
                System.out.print(a[i]+" ");
            }
            System.out.println();
        }
    }
}
