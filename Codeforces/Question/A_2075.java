import java.util.Scanner;
public class A_2075 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            if(n<=k){
                System.out.println(1);
                continue;
            }
            if(n%2==0){
                if(n%(k-1)==0){
                    System.out.println(n/(k-1));
                }
                else{
                    System.out.println(n/(k-1)+1);
                }
            }
            else{
                if((n-k)%(k-1)==0){
                    System.out.println((n-k)/(k-1)+1);
                }
                else{
                    System.out.println((n-k)/(k-1)+2);
                }
            }
        }
    }
}
