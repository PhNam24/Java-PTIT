package BT;

import java.util.*;
public class J02026_Day_con_co_K_phan_tu_tang_dan {
    static int n, k;
    static int[] a = new int[20], mark = new int[20];
    static ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
    static void in() {
        ArrayList<Integer> tmp = new ArrayList<>();
        for(int i = 1; i <= k; i++) {
            tmp.add(a[mark[i]]);
        }
        ans.add(tmp);
    }
    static void Try(int i) {
        for ( int j = mark[i - 1] + 1; j <= n - k + i; j++ )
        {
            mark[i] = j;
            if ( i == k ) in();
            else Try(i + 1);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-- > 0) {
            ans.clear();
            n = scanner.nextInt();
            k = scanner.nextInt();
            for(int i = 1; i <= n; i++) {
                a[i] = scanner.nextInt();
            }
            Arrays.sort(a, 1, n + 1);
            Try(1);
            for(int i = 0; i < ans.size(); i++) {
                for(int j = 0; j < ans.get(i).size(); j++) {
                    System.out.print(ans.get(i).get(j) + " ");
                }
                System.out.println();
            }
        }
    }
}
