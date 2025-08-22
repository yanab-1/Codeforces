import java.util.Arrays;
import java.util.Scanner;

public class A_1990 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            Arrays.sort(arr);
            boolean ok=n%2!=0;
            for(int i=0;i+1<n;i+=2){
                if(arr[i]!=arr[i+1]){
                    ok=true;
                    break;
                }
            }
            if(ok){
                System.out.println("yes");
            }
            else{
                System.out.println("no");
            }
        }
    }
}
