package BT;

import java.util.*;

class Pair_J08021<T, U> {
    private T first;
    private U second;
    public Pair_J08021(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return this.first;
    }

    public U getSecond() {
        return this.second;
    }
}

public class J08021_Day_ngoac_dung_dai_nhat {
    public static int count(char[] s) {
        int ans = 0;
        Stack<Pair_J08021<Character, Integer>> st = new Stack<>();
        int[] d = new int[100005];
        for(int i = 0; i < s.length; i++) {
            if(s[i] == '(') {
                st.push(new Pair_J08021(s[i], i));
            }
            else {
                if(s[i] == ')' && !st.empty() && st.peek().getFirst() == '(') {
                    d[i] = d[i - 1];
                    if(st.peek().getSecond() != 0) {
                        d[i] += d[st.peek().getSecond() - 1];
                    }
                    d[i] += 2;
                    st.pop();
                }
            }
            ans = Math.max(ans, d[i]);
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());
        while(t-- > 0) {
            char[] s = scanner.nextLine().toCharArray();
            System.out.println(count(s));
        }
    }
}
