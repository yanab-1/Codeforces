import java.util.Scanner;

public class A_2061{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int odd=0;
            for(int i=0;i<n;i++){
                int a=sc.nextInt();
                if(a%2!=0){
                    odd++;
                }
            }
            if(n-odd==0){
                System.out.println(odd-1);
            }
            else{
                System.out.println(odd+1);
            }
        }
    }
}