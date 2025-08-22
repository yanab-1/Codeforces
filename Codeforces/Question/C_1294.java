import java.util.Scanner;

public class C_1294 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            if(n<8){
                System.out.println("NO");
                continue;
            }
            boolean f=false;
            for(int i=2;i*i*i<=n;i++){
                if(n%i==0){
                    int rem=n/i;
                    for(int j=i+1;j*j<=rem;j++){
                        if(rem%j==0){
                            int k=rem/j;
                            if(k>j){
                                System.out.println("YES");
                                System.out.println(i+" "+j+" "+k);
                                f=true;
                                break;
                            }
                        }
                    }
                }
                if(f){
                    break;
                }
            }
            if(!f){
                System.out.println("NO");
            }
        }
    }
}
