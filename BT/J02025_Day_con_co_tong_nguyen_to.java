package BT;

import java.util.*;

public class J02025_Day_con_co_tong_nguyen_to {
    static int n;
    static Integer[] a = new Integer[20], mark = new Integer[20];
    static ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
    static boolean check(int n) {
        if(n < 2) {
            return false;
        }
        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }
    static void in() {
        int sum = 0;
        for(int i = 1; i <= n; i++) {
            sum += a[i] * mark[i];
        }
        if(check(sum)) {
            ArrayList<Integer> tmp = new ArrayList<>();
            for(int i = 1; i <= n; i++) {
                if(mark[i] == 1) {
                    tmp.add(a[i]);
                }
            }
            ans.add(tmp);
        }
    }
    static void Try(int i) {
        for(int j = 0; j < 2; j++) {
            mark[i] = j;
            if(i == n) {
                in();
            }
            else {
                Try(i + 1);
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-- > 0) {
            ans.clear();
            n = scanner.nextInt();
            for(int i = 1; i <= n; i++) {
                a[i] = scanner.nextInt();
            }
            Arrays.sort(a, 1, n + 1, Collections.reverseOrder());
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
