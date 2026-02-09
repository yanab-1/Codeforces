import java.util.Scanner;

public class D_2178 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) solve(sc);
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        long total = 0;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                arr[i][j] = sc.nextInt();
                total += arr[i][j];
            }
        }

        System.out.println((total / 2) * ((total + 1) / 2));
        StringBuilder sb = new StringBuilder();

        if(total == 0){
            sb.append("D".repeat(n)).append("R".repeat(m));   
            System.out.println(sb.toString());
            return;
        }

        total = (total + 1) / 2; 

        for(int i = 0; i < n; i++){
            for(int j = m - 1; j >= 0; j--){
                if(arr[i][j] == 1){
                    total--;
                    if(total == 0){
                        sb.append("D".repeat(i))
                        .append("R".repeat(j))
                        .append("D")
                        .append("R".repeat(m - j))
                        .append("D".repeat(n - 1 - i));
                        System.out.println(sb.toString());
                        return;  
                    }
                }
            }
        }
    }

}
