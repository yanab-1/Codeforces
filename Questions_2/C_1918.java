import java.util.Scanner;

public class C_1918 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        long a = sc.nextLong();
        long b = sc.nextLong();
        long r = sc.nextLong();
        if(a < b){
            long temp = a;
            a = b;
            b = temp;
        }
        long x = 0;
        long y = 0;
        boolean ok = false;
        boolean sm = false;
        for(int i = 62; i >= 0; i--){
            int aBit = 0;
            int bBit = 0;
            if((a & (1L << i)) > 0) aBit = 1;
            if((b & (1L << i)) > 0) bBit = 1;
            if((aBit == bBit) && (r & (1L << i)) > 0) sm = true;
            if(aBit == bBit) continue;
            if(!ok){
                ok = true;
                x += (1L << i);
                if((r & (1L << i)) > 0) sm = true;
            }else{
                if(aBit == 0 && bBit == 1){
                    y += (1L << i);
                    if((r & (1L << i)) > 0) sm = true;
                }else{
                    if((r & (1L << i)) > 0 || sm) y += (1L << i);
                    else{
                        x += (1L << i);
                    }
                }
            }
        }
        System.out.println(x - y);
    }
}
