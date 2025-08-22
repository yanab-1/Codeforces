
import java.util.Scanner;

public class A_2010{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            int[] arr=new int[n];
            for (int idx = 0; idx < n; idx++) {
                arr[idx]=sc.nextInt();
            }
            System.out.println(alter_sum(arr));
        }
    }
    public static int alter_sum(int[] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            if(i%2!=0){
                sum-=arr[i];
            }
            else{
                sum+=arr[i];
            }
        }
        return sum;
    }
}