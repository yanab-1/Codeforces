import java.util.Scanner;

public class B_1411{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            long n=sc.nextLong();
            while(!isfair(n)){
                n++;
            }
            System.out.println(n);
        }
    }
    public static boolean isfair(long n){
        long c=n;
        while(n>0){
            long rem=n%10;
            if(rem!=0 && c%rem!=0){
                return false;
            }
            n/=10;
        }
        return true;
    }
}