
import java.util.Arrays;
import java.util.Scanner;

public class B_1849 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int[] a=new int[n];
            Integer[] ord=new Integer[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt()%k;
                if(a[i]==0){
                    a[i]=k;
                }
                ord[i]=i;
            }
            Arrays.sort(ord,(i,j)->a[j]-a[i]);
            for(int i:ord){
                System.out.print(i+1+" ");
            }
            System.out.println();
        }
    }
}
