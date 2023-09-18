package BT;

import java.lang.reflect.Array;
import java.util.*;

public class J02024_Day_con_co_tong_le {
    static int n;
    static Integer[] a = new Integer[20], mark = new Integer[20];

    static ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
    static void in() {
        int sum = 0;
        for(int i = 1; i <= n; i++) {
            sum += a[i] * mark[i];
        }
        if(sum % 2 == 1) {
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
