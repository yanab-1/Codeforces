import java.util.Scanner;

public class A_742 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        if(n==0){
            System.out.println(1);
        }
        else{
            int[] ans={8,4,2,6};
            int res=(int)((n-1)%4);
            System.out.println(ans[res]);
        }
    }
}
