import java.util.Scanner;

public class B_2122 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            solve(sc);
        }
    }
    private static void solve(Scanner sc) {
        int n=sc.nextInt();
        long operations = 0;
        while(n-- >0){
            int originalZeros = sc.nextInt();
            int originalOnes = sc.nextInt();
            int targetZeros = sc.nextInt();
            int targetOnes = sc.nextInt();

            if(originalZeros > targetZeros){
                operations += originalZeros - targetZeros;
            }
            if(originalOnes > targetOnes){
                operations +=  originalOnes - targetOnes +  Math.min(targetZeros, originalZeros);
            }
        }
        System.out.println(operations);
    }
    
}
