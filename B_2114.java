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
            int mis=n/2-k;
            boolean flag=true;
            if(mis<0 || mis>Math.min(one, zero)) {
                flag=false;
            }
            else{
                int r=zero-mis;
                if(r%2!=0 || r<0){
                    flag=false;
                }
            }
            if(flag){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }  
    }
}
