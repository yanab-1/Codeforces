
import java.util.Scanner;

public class A_2078{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int x=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            long sum=0;
            for(int i:arr){
                sum+=i;
            }
            if(sum==n*x){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}