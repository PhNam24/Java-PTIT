package BT;

import java.util.*;
public class J020356_Lua_chon_tham_lam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int s = scanner.nextInt();
        if(n * 9 < s || s == 0) {
            System.out.print("-1 -1");
        }
        else {
            s--;
            Stack<Integer> st = new Stack<>();
            for(int i = 0; i < n; i++) {
                if(s >= 9) {
                    st.push(9);
                    s -= 9;
                }
                else if(s > 0) {
                    st.push(s);
                    s = 0;
                }
                else st.push(0);
            }
            int tmp = st.pop() + 1;
            st.push(tmp);
            while(!st.empty()) {
                s += st.peek();
                System.out.print(st.pop());
            }
            System.out.print(" ");
            Queue<Integer> q = new LinkedList<>();
            while(s != 0) {
                if(s >= 9) {
                    q.add(9);
                    s -= 9;
                }
                else {
                    q.add(s);
                    s = 0;
                }
            }
            while(q.size() < n) {
                q.add(0);
            }
            while(!q.isEmpty()) {
                System.out.print(q.poll());
            }
        }
    }
}
