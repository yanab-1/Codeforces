
import java.util.HashSet;
import java.util.Scanner;

public class B_1438 {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int t=sc.nextInt();
            while(t-->0){
                int n=sc.nextInt();
                int[] a=new int[n];
                HashSet<Integer> set=new HashSet<>();
                for(int i=0;i<n;i++){
                    a[i]=sc.nextInt();
                    set.add(a[i]);
                }
                if(set.size()!=n){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
            }
        }
}
