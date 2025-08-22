import java.util.Arrays;
import java.util.Scanner;

public class A_1827 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] a=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            int[] b=new int[n];
            for(int i=0;i<n;i++){
                b[i]=sc.nextInt();
            }
            print(a,b,n);
        }
    }

    private static void print(int[] a, int[] b, int n) {
        Arrays.sort(a);
        Arrays.sort(b);
        reverse(b);
        long res=1;
        int MOD=1000000007; 
        for(int i=0;i<n;i++){
            int greater=getcount(a, b[i]);
            res=res*Math.max(greater-i, 0) % MOD;
        }
        System.out.println(res);
    }

    private static int getcount(int[] a, int i) {
        int l=0;
        int r=a.length;
        while(l<r){
            int mid=l+(r-l)/2;
            if(a[mid]<=i){
                l=mid+1;
            } else {
                r=mid;
            }
        }
        return a.length-l;
    }

    private static void reverse(int[] b) {
        int l=0;
        int r=b.length-1;
        while(l<r){
            int temp=b[l];
            b[l]=b[r];
            b[r]=temp;
            l++;
            r--;
        }
    }
}
//c++ code tle using java
// #include <iostream>
// #include <vector>
// #include <algorithm>

// using namespace std;

// const int MOD = 1000000007;

// int getcount(const vector<int>& a, int x) {
//     int l = 0, r = a.size();
//     while (l < r) {
//         int mid = l + (r - l) / 2;
//         if (a[mid] <= x) {
//             l = mid + 1;
//         } else {
//             r = mid;
//         }
//     }
//     return a.size() - l;
// }

// void solve(vector<int>& a, vector<int>& b, int n) {
//     sort(a.begin(), a.end());
//     sort(b.begin(), b.end(), greater<int>());

//     long long res = 1;
//     for (int i = 0; i < n; ++i) {
//         int greater = getcount(a, b[i]);
//         res = res * max(greater - i, 0) % MOD;
//     }
//     cout << res << endl;
// }

// int main() {
//     ios::sync_with_stdio(false);
//     cin.tie(nullptr);

//     int t;
//     cin >> t;
//     while (t--) {
//         int n;
//         cin >> n;
//         vector<int> a(n), b(n);
//         for (int i = 0; i < n; ++i) cin >> a[i];
//         for (int i = 0; i < n; ++i) cin >> b[i];

//         solve(a, b, n);
//     }

//     return 0;
// }

