
import java.util.Scanner;

public class B_2078 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt(); 
        while(t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int[] a=new int[n+1];
            if(k%2==1){
                for(int i=1;i<=n-2;i++) {
                    a[i]=n;
                }
                if(n>=2) {
                    a[n-1]=n;
                    a[n]=n-1;
                }
            }else{
                for(int i=1;i<=n-2;i++){
                    a[i]=n-1;
                }
                if(n>=2){
                    a[n-1]=n;
                    a[n]=n-1;
                }
            }
            for(int i=1;i<=n;i++){
                System.out.print(a[i]+" ");
            }
            System.out.println();
        }
    }
}
