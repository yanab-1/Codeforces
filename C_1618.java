import java.util.Scanner;

public class C_1618 {
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
        long gcd1=0;
        long gcd2=0;
        for(int i=0;i<n;i++){
            if(i%2==0){
                gcd1=gcd(gcd1, arr[i]);
            } else {
                gcd2=gcd(gcd2, arr[i]);
            }
        }
        boolean flag=true;
        for(int i=1;i<n;i+=2){
            if(arr[i]%gcd1==0){
                flag=false;
                break;
            }
        }
        if(flag){
            System.out.println(gcd1);
            return;
        }
        flag=true;
        for(int i=0;i<n;i+=2){
            if(arr[i]%gcd2==0){
                flag=false;
                break;
            }
        }
        if(flag){
            System.out.println(gcd2);
        }else {
            System.out.println(0);
        }
    }
    private static long gcd(long a, long b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}
