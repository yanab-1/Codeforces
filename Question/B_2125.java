
    import java.util.Scanner;

    public class B_2125 {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int t=sc.nextInt();
            while(t-->0){
                solve(sc);
            }
        }

        private static void solve(Scanner sc) {
            long a=sc.nextLong();   
            long b=sc.nextLong();
            long k=sc.nextLong();
            long g=gcd(a,b);
            long A=(a+k-1)/k;
            long B=(b+k-1)/k;
            if(Math.max(A,B)<=g){
                System.out.println(1);
            }
            else{
                System.out.println(2);
            }
        }

        private static long gcd(long a, long b) {
            if(b==0) return a;
            return gcd(b,a%b);
        }
    }
