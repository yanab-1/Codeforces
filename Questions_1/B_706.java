import java.util.*;
public class B_706 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int q=sc.nextInt();
        for(int i=0;i<q;i++){
            int a=sc.nextInt();
            System.out.println(res(arr,a));
        }
    }
    public static int res(int[] arr,int a){
        int i=0,j=arr.length-1;
        while(i<=j){
            int mid=i+(j-i)/2;
            if(arr[mid]<=a){
                i=mid+1;
            }
            else{
                j=mid-1;
            }
        }
        return i;
    }
}
