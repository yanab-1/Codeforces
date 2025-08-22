import java.util.Scanner;
public class A_1542 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int odd=0;
            int even=0;
            for(int i=0;i<2*n;i++){
                int a=sc.nextInt();
                if(a%2==0){
                    even++;
                }
                else{
                    odd++;
                }
            }
            if(odd==even){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
    }
}
