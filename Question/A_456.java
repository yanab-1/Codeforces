
import java.util.Arrays;
import java.util.Scanner;

public class A_456 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] arr=new int[n][2];
        for(int i=0;i<n;i++){
            arr[i][0]=sc.nextInt();
            arr[i][1]=sc.nextInt();
        }
        Arrays.sort(arr,(a,b)->Integer.compare(a[0], b[0]));
        for(int i=0;i<n-1;i++){
            if(arr[i][1]>arr[i+1][1]){
                System.out.println("Happy Alex");
                return;
            }
        }
        System.out.println("Poor Alex");
        
    }
}
