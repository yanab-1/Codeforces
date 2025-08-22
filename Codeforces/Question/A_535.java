import java.util.Scanner;

public class A_535 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        solve(sc);
    }

    private static void solve(Scanner sc) {
        int x=sc.nextInt();
        String[] onesDigit={"one","two","three","four","five","six","seven","eight","nine"};
        String[] tensDigit={"ten","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
        String[] twosDigit={"eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
        if(x==0){
            System.out.println("zero");
            return;
        }
        if(x%10==0){
            System.out.println(tensDigit[(x/10)-1]);
            return;
        }
        if(x>10 && x<20){
            System.out.println(twosDigit[x-11]);
            return;
        }
        if(x>0 && x<10){
            System.out.println(onesDigit[x-1]);
            return;
        }
        StringBuilder sb=new StringBuilder();
        if(x/10!=1){
            sb.append(tensDigit[x/10-1]).append("-");
        }
        sb.append(onesDigit[x%10-1]);
        System.out.println(sb.toString());
    }
}
