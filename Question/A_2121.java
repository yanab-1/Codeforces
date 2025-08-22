import java.util.Arrays;
import java.util.Scanner;

public class A_2121 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int s=sc.nextInt();
            int[] a=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            print(a,n,s);
        }
    }

    private static void print(int[] a, int n, int s) {
        Arrays.sort(a);
        if(a[n-1]<=s){
            System.out.println(s-a[0]);
            return;
        }
        if(a[0]>=s){
            System.out.println(a[n-1]-s);
            return;
        }
        int p=a[n-1]-s;
        int ne=s-a[0];
        System.out.println(2*Math.min(p,ne)+Math.max(p,ne));
    }
}
