
import java.util.Scanner;

public class B_2092 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            sc.nextLine();
            String a=sc.nextLine();
            String b=sc.nextLine();
            int comp1=0;
            int comp2=0;
            for(int i=0;i<n;i++){
                if((i+1)%2==1){
                    if(a.charAt(i)=='1')comp1++;
                    if(b.charAt(i)=='1')comp2++;
                }
                else{
                    if(a.charAt(i)=='1')comp2++;
                    if(b.charAt(i)=='1')comp1++;
                }
            }
            int c1=n/2;
            int c2=(n+1)/2;
            if(comp1<=c1 && comp2<=c2){
                System.out.println("yes");
            }
            else{
                System.out.println("no");
            }
        }
    }
}
