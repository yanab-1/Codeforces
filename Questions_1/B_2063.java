import java.util.Arrays;
import java.util.Scanner;

public class B_2063{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int l=sc.nextInt()-1;
            int r=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int[] brr = Arrays.copyOf(arr, n);
            Arrays.sort(brr, l, n);
            int[] crr = Arrays.copyOf(arr, n);
            Arrays.sort(crr, 0, r);
            reverse(crr, 0, r - 1);
            long sumBrr = sum(brr, l, r - 1);
            long sumCrr = sum(crr, l, r - 1);

            System.out.println(Math.min(sumBrr, sumCrr));
        }
    }
    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static long sum(int[] arr, int start, int end) {
        long total = 0;
        for (int i = start; i <= end; i++) {
            total += arr[i];
        }
        return total;
    }
}