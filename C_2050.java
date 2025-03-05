
import java.util.Scanner;

public class C_2050 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s=sc.nextLine();
            res(s);
        }
    }
    public static void res(String s){
        int n=s.length();
        int two=0;
        int three=0;
        long sum=0;
        for(int i=0;i<n;i++){
            int rem=s.charAt(i)-'0';
            sum+=rem;
            if(rem==2){
                two++;
            }
            else if(rem==3){
                three++;
            }
        }
        two=Math.min(two,8);
        three=Math.min(three,8);
        for(int i=0;i<=two;i++){
            for(int j=0;j<=three;j++){
                if(((sum+i*2+j*6)%9)==0){
                    System.out.println("yes");
                    return;
                }
            }
        }
        System.out.println("no");
    }
}
