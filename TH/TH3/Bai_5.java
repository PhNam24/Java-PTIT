package TH.TH3;

import java.util.*;
import java.lang.Character;
public class Bai_5 {
    static boolean check(String s) {
        if(s.equals("*") || s.equals("/") || s.equals("+") || s.equals("-")) {
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());
        while (t-- > 0) {
            int n = Integer.parseInt(scanner.nextLine());
            String[] s = scanner.nextLine().split("\\s+");
            Stack<Long> st = new Stack<>();
            for (int i = s.length - 1; i >= 0; i--) {
                if (check(s[i])) {
                    st.push(Long.parseLong(s[i]));
                }
                else {
                    long tmp = st.pop();
                    if(s[i].equals("*")) {
                        tmp *= st.peek();
                    }
                    if(s[i].equals("/")) {
                        tmp /= st.peek();
                    }
                    if(s[i].equals("+")) {
                        tmp += st.peek();
                    }
                    if(s[i].equals("-")) {
                        tmp -= st.peek();
                    }
                    st.pop();
                    st.push(tmp);
                }
            }
            System.out.println(st.pop());
        }
    }
}
