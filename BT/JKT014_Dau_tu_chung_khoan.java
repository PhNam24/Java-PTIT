package BT;

import java.util.*;
public class JKT014_Dau_tu_chung_khoan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-- > 0) {
            int n = scanner.nextInt();
            int[] a = new int[n];
            for(int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            int[] ans = new int[n];
            ans[0] = 1;
            Stack<Integer> st = new Stack<>();
            st.push(0);
            for(int i = 1; i < n; i++) {
                while (!st.empty() && a[i] >= a[st.peek()]) {
                    st.pop();
                }
                if (st.empty()) {
                    ans[i] = i + 1;
                } else {
                    ans[i] = i - st.peek();
                }
                st.push(i);
            }
            for(int i: ans) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static class J020356_Lua_chon_tham_lam {
    }
}
