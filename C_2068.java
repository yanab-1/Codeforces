
import java.util.Arrays;
import java.util.Scanner;

public class C_2068 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            Arrays.sort(arr);
            int ad=0;
            int c=0;
            int sum=0;
            for(int i=0;i<n-1;i++){
                sum+=arr[i];
                c++;
                if(c==3 || sum>k){
                    ad++;
                    c=0;
                    sum=0;
                }
            }
            System.out.println(ad);
        }
    }
}
