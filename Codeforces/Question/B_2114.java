import java.util.Scanner;

public class B_2114 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            String s=sc.next();
            int one=0;
            int zero=0;
            for(char ch : s.toCharArray()) {
                if(ch == '1') {
                    one++;
                } else {
                    zero++;
                }
            }
            int minpair=Math.max(one,zero)-n/2;
            int maxpair=one/2+zero/2;
            if(k>=minpair && k<=maxpair && (minpair-k)%2==0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }  
    }
}
