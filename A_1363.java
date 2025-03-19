
import java.util.Scanner;

public class A_1363 {
   public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int x=sc.nextInt();
            int[] a=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            int odd=0;
            int even=0;
            for(int i=0;i<n;i++){
                if(a[i]%2==0){
                    even++;
                }else{
                    odd++;
                }
            }
            if(odd==0){
                System.out.println("No");
                continue;
            }
            boolean flag=false;
            for(int i=1;i<=odd && i<=x;i+=2){
                if(x-i<=even){
                    flag=true;
                    break;
                }
            }
            if(flag){
                System.out.println("Yes");
            }else{
            System.out.println("No");
            }
        }
   } 
}
