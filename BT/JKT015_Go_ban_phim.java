package BT;

import java.util.*;
public class JKT015_Go_ban_phim {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        Stack<Character> st = new Stack<>();
        Stack<Character> st1 = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '-') {
                if(!st.empty()) {
                    st.pop();
                }
            }
            else if(s.charAt(i) == '<') {
                if(!st.empty()) {
                    st1.push(st.pop());
                }
            }
            else if(s.charAt(i) == '>') {
                if(!st1.empty()) {
                    st.push(st1.pop());
                }
            }
            else {
                st.push(s.charAt(i));
            }
        }
        while(!st1.empty()) {
            st.push(st1.pop());
        }
        ArrayList<Character> a = new ArrayList<>(st);
        for(Character i: a) {
            System.out.print(i);
        }
    }
}
