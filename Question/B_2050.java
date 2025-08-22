import java.util.Scanner;

public class B_2050 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            long[] arr=new long[n];
            long sum=0;
            long os=0;
            long es=0;
            for(int i=0;i<n;i++){
                arr[i]=sc.nextLong();
                if(i%2!=0){
                    es+=arr[i];
                }
                else{
                    os+=arr[i];
                }
                sum+=arr[i];
            }
            if(sum%n==0){
                int o=(n+1)/2;
                int e=n/2;
                long tar=sum/n;
                if(es==tar*e && os==tar*o){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
