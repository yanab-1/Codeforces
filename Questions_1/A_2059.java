import java.util.HashSet;
import java.util.Scanner;

public class A_2059 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            HashSet<Integer> a=new HashSet<>();
            HashSet<Integer> b=new HashSet<>();
            for(int i=0;i<n;i++){
                int num=sc.nextInt();
                a.add(num);
            }
            for(int i=0;i<n;i++){
                int num=sc.nextInt();
                b.add(num);
            }
            if(a.size()+b.size()<4){
                System.out.println("no");
            }
            else{
                System.out.println("yes");
            }
        }
    }
}