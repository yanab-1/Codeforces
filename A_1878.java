
import java.util.Scanner;

public class A_1878 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int[] a=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            boolean found = false;
            for(int i=0;i<n;i++){
                if(a[i]==k){
                    System.out.println("yes");
                    found = true;
                    break;
                }
            }
            if(!found){
                System.out.println("no");
            }
        }
    }
}
