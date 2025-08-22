
import java.util.Scanner;

public class D_1520 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            long res=0;
            int[] freq=new int[2*n+1];
            for(int i=0;i<n;i++){
                int a=sc.nextInt();
                int k=a-i+n;
                res+=freq[k];
                freq[k]++;
            }
            System.out.println(res);
        }
    }
}
