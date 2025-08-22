import java.util.Scanner;

public class B_2062 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] a=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            res(a,n);
        }
    }
    public static void res(int[] a,int n){
        for(int i=0;i<n;i++){
            if(a[i]<=2*(Math.max(i,n-i-1))){
                System.out.println("no");
                return;
            }
        }
        System.out.println("yes");
    }
}
