

import java.util.Scanner;

public class E_1791 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0) {
            int n=sc.nextInt();
            long[] arr=new long[n];
            for (int i=0;i<n;i++) {
                arr[i]=sc.nextLong();
            }
            print(arr,n);
        }
    }

    private static void print(long[] arr, int n) {
        long sum=0;
        int neg=0;
        Long min=Long.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]<0){
                neg++;
                arr[i]=-arr[i];
            }
            min=Math.min(min, arr[i]);
            sum+=arr[i];
        }
        if(neg%2==0){
            System.out.println(sum);
        } else {
            System.out.println(sum-2*min);
        }
    }
}
