import java.util.Scanner;

public class A_2130 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        int n=sc.nextInt();
        int[] a=new int[n];
        long sum=0;
        int c=0;
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            sum+=a[i];
            if(a[i]==0){
                c++;
            }
        }
        System.out.println(sum+c);
    }
}