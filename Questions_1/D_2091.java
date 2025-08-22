
import java.util.Scanner;

public class D_2091 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            long n=sc.nextLong();
            long m=sc.nextLong();
            long k=sc.nextLong();
            long l=1;
            long h=m;
            long ans=m;
            while(l<=h){
                long mid=l+(h-l)/2;
                long fb=m/(mid+1);
                long rem=m%(mid+1);
                long dr=fb*mid+Math.min(rem,mid);
                long td=n*dr;
                if(td>=k){
                    ans=mid;
                    h=mid-1;
                }
                else{
                    l=mid+1;
                }
            }
            System.out.println(ans);
        }
    }
}
