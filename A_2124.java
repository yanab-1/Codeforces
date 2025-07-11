import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class A_2124 {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        int n=sc.nextInt();
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=0;i<n;i++){
            a.add(sc.nextInt());
        }
        while(a.size()>0){
            int k=a.size();
            int[] s=new int[k];
            for(int i=0;i<k;i++){
                s[i]=a.get(i);
            }
            Arrays.sort(s);
            int idx=-1;
            for(int i=0;i<k;i++){
                if(s[i]==a.get(i)){
                    idx=i;
                    break;
                }
            }
            if(idx==-1){
                System.out.println("yes");
                System.out.println(k);
                for(int i:a){
                    System.out.print(i + " ");
                }
                System.out.println();
                return;
            }
            else{
                a.remove(idx);
            }
        }
        System.out.println("No");
    }
}
