
import java.util.Scanner;

public class A_139 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[7];
        for(int i=0;i<7;i++){
            a[i]=sc.nextInt();
        }
        int i=0;
        while(n>0){
            i=i%7;
            n-=a[i];
            i++;
        }
        System.out.println(i);
    }
}
