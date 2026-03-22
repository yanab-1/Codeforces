import java.util.Scanner;

public class B_1463 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        long s1 = 0;
        long s2 = 0;
        for(int i = 0; i < n; i++){
            if(i % 2 == 0){
                s1 += a[i];
            }
            else{
                s2 += a[i];
            }
        }
        if(s1 > s2){
            for(int i = 0; i < n; i++){
                if(i % 2 == 0){
                    System.out.print(a[i] + " ");
                }
                else{
                    System.out.print(1 + " ");
                }
            }
        }
        else{
            for(int i = 0; i < n; i++){
                if(i % 2 != 0){
                    System.out.print(a[i] + " ");
                }
                else{
                    System.out.print(1 + " ");
                }
            }
        }
        System.out.println();
    }
}
