import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class G1_1791 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int c=sc.nextInt();
            List<Integer> ll=new ArrayList<>();
            for(int i=0;i<n;i++){
                ll.add(sc.nextInt()+i+1);
            }
            print(ll,n,c);
        }
    }

    private static void print(List<Integer> ll, int n, int c) {
        Collections.sort(ll);
        int ans=0;
        for(int i=0;i<n;i++){
            if(c>=ll.get(i)){
                ans++;
                c-=ll.get(i);
            }
            else {
                break;
            }
        }
        System.out.println(ans);
    }
}
