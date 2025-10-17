import java.util.Scanner;

public class D_2162 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        int sum = n * (n + 1) / 2;
        System.out.println(2 + " " + 1 + " " + n);
        System.out.flush();
        int sum2 = sc.nextInt();
        int len = sum2 - sum;
        int l = 1, r = n;
        int foundL = -1, foundR = -1;
        while(l <= r){
            int mid = (l + r) / 2;
            System.out.println(1 + " " + l + " " + mid);
            System.out.flush();
            int partialSum1 = sc.nextInt();
            System.out.println(2 + " " + l + " " + mid);
            System.out.flush();
            int partialSum2 = sc.nextInt();
            int diff = partialSum2 - partialSum1;
            if(diff == 0){
                l = mid + 1;
            }
            else if(diff == len){
                r = mid - 1;
            }
            else{
                foundL = mid - diff + 1;
                foundR = mid + (len - diff);
                break;
            }
        }
        if (foundL == -1) {
            foundL = l;
            foundR = l + len - 1;
        }
        System.out.println("! " + foundL + " " + foundR);
        System.out.flush();
    }
}
