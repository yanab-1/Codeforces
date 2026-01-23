import java.util.Scanner;

public class A_2189 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        int h = sc.nextInt();
        int l = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int both = 0;
        int c1 = 0;
        int c2 = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] <= Math.min(h, l)){
                both++;
            }
            else if(arr[i] <= h){
                c1++;
            }
            else if(arr[i] <= l){
                c2++;
            }
        }
        int ans = 0;
        int min = Math.min(c1, c2);
        ans += min;
        c1 -= min;
        c2 -= min;
        if(c1 > 0){
            min = Math.min(c1, both);
            ans += min;
            c1 -= min;
            both -= min;
        }
        if(c2 > 0){
            min = Math.min(c2, both);
            ans += min;
            c2 -= min;
            both -= min;
        }
        ans += both / 2;
        System.out.println(ans);
    }
}
