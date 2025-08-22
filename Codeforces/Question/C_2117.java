
import java.util.HashSet;
import java.util.Scanner;

public class C_2117 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] a=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            print(a);
        }
    }

    private static void print(int[] a) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        int ans=0;
        for(int i=0;i<a.length;i++){
            set1.add(a[i]);
            set2.add(a[i]);
            if(set1.size() == set2.size()){
                ans++;
                set2.clear();
            }
        }
        System.out.println(ans);
    }
}
