import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class B_1656 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            solve(sc);
        }
    }   

    private static void solve(Scanner sc) {
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(a[i]);
        }
        for(int i=0;i<n;i++){
            if(set.contains(a[i]-k)){
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
    
}
