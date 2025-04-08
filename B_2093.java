import java.util.Scanner;

public class B_2093 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String s=sc.next();
            int n=s.length();
            int max=0;
            int c=0;
            for(int i=0;i<n;i++){
                char ch=s.charAt(i);
                if(ch=='0'){
                    c++;
                }
                else{
                    int can=c+1;
                    if(can>max){
                        max=can;
                    }
                }
            }
            System.out.println(n-max);
        }
    }
}
