import java.util.Scanner;
import java.util.Arrays;
public class tech_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            Arrays.sort(arr);
            arr[0]+=1;
            int ans=1;
            for(int i=0;i<arr.length;i++){
                ans*=arr[i];
            }
            System.out.println(ans);
        }
    }
}
