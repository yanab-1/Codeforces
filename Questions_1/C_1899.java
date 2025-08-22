import java.util.Scanner;

public class C_1899 {
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

    private static void print(int[] nums) {
        int n=nums.length;
        int sum=nums[0];
        int ans=nums[0];
        for(int i=1;i<n;i++){
            if(Math.abs(nums[i]%2)==Math.abs(nums[i-1]%2) || sum<0){
                sum=0;
            }
            sum+=nums[i];
            ans=Math.max(sum,ans);
            
        }
        System.out.println(ans);
    }

}
