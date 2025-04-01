
import java.util.Scanner;

public class A_1903 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int[] a=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            if(n==1){
                System.out.println("YES");
                continue;
            }
            boolean flag=true;
            for(int i=1;i<n;i++){
                if(a[i-1]>a[i]){
                    flag=false;
                    break;
                }
            }
            if(flag){
                System.out.println("YES");
                continue;
            }
            if(k==1 && n>1){
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
            }
        }
    }
}
