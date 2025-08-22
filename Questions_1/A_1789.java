
import java.util.Scanner;

public class A_1789 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] a=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            int c=0;
            for(int i=0;i<n-1;i++){
                for(int j=i+1;j<n;j++){
                    if(gcd(a[i],a[j])<=2){
                        System.out.println("YES");
                        c=1;
                        break;
                    }
                }
                if(c==1){
                    break;
                }
            }
            if(c==0){
                System.out.println("no");
            }
        }
    }
    public static int gcd(int a,int b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }
}
