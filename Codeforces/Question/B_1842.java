import java.util.Scanner;

public class B_1842 {
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        int n=sc.nextInt();
        int x=sc.nextInt();
        int[] a=new int[n];
        int s=0;
        for(int i=0;i<3;i++){
            for(int j=0;j<n;j++) {
                a[j]=sc.nextInt();
            }
            for(int j=0;j<n;j++) {
                if((a[j]|x)!=x){
                    break;
                }
                s|= a[j];
            }
        }
        if(s==x) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
