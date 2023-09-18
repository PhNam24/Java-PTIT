package BT;

import java.util.*;
public class J03023_So_La_Ma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        while(t-- > 0) {
            String s = scanner.nextLine();
            Map<Character, Integer> m = new HashMap<>();
            m.put('I', 1);
            m.put('V', 5);
            m.put('X', 10);
            m.put('L', 50);
            m.put('C', 100);
            m.put('D', 500);
            m.put('M', 1000);
            int ans = m.get(s.charAt(s.length() - 1));
            for(int i = s.length() - 2; i >= 0; i--) {
                if(m.get(s.charAt(i)) < m.get(s.charAt(i + 1))) {
                    ans -= m.get(s.charAt(i));
                }
                else {
                    ans += m.get(s.charAt(i));
                }
            }
            System.out.println(ans);
        }
    }
}
