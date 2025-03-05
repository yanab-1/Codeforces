import java.util.Scanner;

public class B_474 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] piles=new int[n];
        int[] starr=new int[n];
        starr[0]=piles[0]=sc.nextInt();
        for(int i=1;i<n;i++){
            piles[i]=sc.nextInt();
            starr[i]=piles[i]+starr[i-1];
        }
        int m=sc.nextInt();
        for(int i=0;i<m;i++){
            int ans=sc.nextInt();
            System.out.println(find(ans,starr)+1);
        }
    }
    public static int find(int item,int[] arr){
        int l=0;
        int r=arr.length-1;
        while(l<r){
            int mid=l+(r-l)/2;
            if(arr[mid]>=item){
                r=mid;
            }
            else{
                l=mid+1;
            }
        }
        return l;
    }
}
