package TH.TH2;

import java.util.*;

public class L_Hinh_chu_nhat_don_sac {
    static long calc(long[] a, int m, int n) {
        long[] l = new long[n];
        long[] r = new long[n];
        Stack<Integer> st1 = new Stack<>();
        Stack<Integer> st2 = new Stack<>();
        st1.push(n - 1);
        for(int i = n - 1; i >= 0; i--) {
            while(!st1.empty() && a[i] <= a[st1.peek()]) {
                st1.pop();
            }
            if(!st1.empty()) {
                r[i] = st1.peek() - 1;
            }
            else {
                r[i] = n - 1;
            }
            st1.push(i);
        }
        for(int i = 0; i < n; i++) {
            while(!st2.empty() && a[i] <= a[st2.peek()]) {
                st2.pop();
            }
            if(!st2.empty()) {
                l[i] = st2.peek() + 1;
            }
            else {
                l[i] = 0;
            }
            st2.push(i);
        }
        long res = 0;
        for(int i = 0; i < n; i++) {
            res = Math.max(res, a[i] * (r[i] - l[i] + 1));
        }
        return  res;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        long[] a = new long[n];
        long[] b = new long[n];
        for(int i = 0; i < n; i++) {
            a[i] = scanner.nextLong();
            b[i] = m - a[i];
        }
        System.out.println(Math.max(calc(a, m, n), calc(b, m, n)));
    }
}
