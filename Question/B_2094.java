import java.util.Scanner;

public class B_2094 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            int l=sc.nextInt();
            int r=sc.nextInt();
            int dif=n-m;
            int L=l*(-1);
            if(dif==0){
                System.out.println(l+" "+r);
            }
            else if(dif<=r){
                System.out.println(l+" "+(r-dif));
            }
            else if(dif<=L){
                System.out.println((l+dif)+" "+r);
            }
            else if(l>r){
                System.out.println(0+" "+(r-(dif-L)));
            }
            else{
                System.out.println(l+(dif-r)+" "+0);
            }
        }
    }
}
