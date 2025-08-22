import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class A_2129 {
    static  class Interval{
        int start;
        int end;
        int ind;
        public Interval(int start,int end,int ind){
            this.start=start;
            this.end=end;
            this.ind=ind;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        int n=sc.nextInt();
        Interval[] arr=new Interval[n];
        for(int i=0;i<n;i++){
            arr[i]=new Interval(sc.nextInt(),sc.nextInt(),i);
        }
        Arrays.sort(arr,(a,b)->{
            if(a.start!=b.start){
                return Integer.compare(a.start, b.start);
            }
            return Integer.compare(b.end, a.end);
        });
        List<Integer> ans=new ArrayList<>();
        int min=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i].start>min){
                ans.add(arr[i].ind+1);
                min=arr[i].start;
            }
        }
        System.out.println(ans.size());
        for(int i:ans){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
