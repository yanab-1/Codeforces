import java.util.Scanner;

public class A_514 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        long ans=0;
        long i=1;
        while(n>0){
            long rem=n%10;
            long invert=9-rem;
            if(n<10 && invert==0){
                ans+=rem*i;
            }
            else{
                ans+=Math.min(invert,rem)*i;
            }
            n/=10;
            i*=10;
        }
        System.out.println(ans);
    }
}
