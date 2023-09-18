package BT;

import java.util.*;
import java.io.*;
public class J08020_Kiem_tra_day_ngoac_dung {
    public static String check(char[] s) {
        Stack<Character> st = new Stack<Character>();
        for(char i: s) {
            if(st.empty() || i == '(' || i == '[' ||i == '{') {
                st.push(i);
            }
            else {
                if(i == ')') {
                    if(st.peek() == '(') {
                        st.pop();
                    }
                    else {
                        return "NO";
                    }
                }
                else if(i == ']') {
                    if(st.peek() == '[') {
                        st.pop();
                    }
                    else {
                        return "NO";
                    }
                }
                else if(i == '}') {
                    if(st.peek() == '{') {
                        st.pop();
                    }
                    else {
                        return "NO";
                    }
                }
            }
        }
        if(!st.empty()) {
            return "NO";
        }
        return "YES";
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());
        while(t-- > 0) {
            char[] s = scanner.nextLine().toCharArray();
            System.out.println(check(s));
        }
    }
}
