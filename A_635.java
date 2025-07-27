import java.util.Scanner;

public class A_635 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        solve(sc);
    }

    private static void solve(Scanner sc) {
        int r = sc.nextInt();
        int c = sc.nextInt();
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[][] a = new int[n][2];
        for(int i = 0; i < n; i++) {
            a[i][0] = sc.nextInt();
            a[i][1] = sc.nextInt();
        }
        int ans=0;
        for(int i=1;i<=r;i++){
            for(int j=i;j<=r;j++){
                for(int m=1;m<=c;m++){
                    for(int l=m;l<=c;l++){
                        int count=0;
                        for(int x=0;x<n;x++){
                            if(check(i,m,j,l,a[x][0],a[x][1])){
                                count++;
                            }
                        }
                        if(count >= k) {
                            ans++;
                        }
                    }
                }
            }
        }
        System.out.println(ans);
    }
    private static boolean check(int i, int m, int j, int l, int x, int y) {
        return (x >= i && x <= j && y >= m && y <= l);
    }
}
