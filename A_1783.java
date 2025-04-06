
import java.util.Arrays;
import java.util.Scanner;

public class A_1783 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] a=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            Arrays.sort(a);
            if(a[0]==a[n-1]){
                System.out.println("NO");
                continue;
            }
            System.out.println("YES");
            System.out.print(a[n-1]+" "+a[0]+" ");
            for(int i=1;i<n-1;i++){
                System.out.print(a[i]+" ");
            }
            System.out.println();
        }
    }
}
