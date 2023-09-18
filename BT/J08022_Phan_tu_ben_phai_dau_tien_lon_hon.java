package BT;

import java.util.*;
public class J08022_Phan_tu_ben_phai_dau_tien_lon_hon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-- > 0) {
            int n = scanner.nextInt();
            int[] a = new int[n];
            for(int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            Stack<Integer> st = new Stack<>();
            int[] ans = new int[n];
            for(int i = 0; i < n; i++) {
                if(st.empty()) {
                    st.push(i);
                }
                else {
                    while(!st.empty() && a[i] > a[st.peek()]) {
                        ans[st.pop()] = a[i];
                    }
                    st.push(i);
                }
            }
            while(!st.empty()) {
                ans[st.pop()] = -1;
            }
            for(int i = 0; i < n; i++) {
                System.out.print(ans[i] + " ");
            }
            System.out.println();
        }
    }
}
