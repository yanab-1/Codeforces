
import java.util.Scanner;

public class A_1857 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] a=new int[n];
            int c=0;
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
                if(a[i]%2!=0){
                    c++;
                }
            }
            if(c%2==0){
                System.out.println("yes");
            }
            else{
                System.out.println("no");
            }
        }
    }
}
