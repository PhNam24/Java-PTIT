package BT;

import java.util.ArrayList;
import java.util.Scanner;

public class J03040_Bien_so_dep {
    public static Scanner scanner = new Scanner(System.in);
    static String check(char[] s) {
        ArrayList<Integer> a = new ArrayList<>();
        for(int i = 5 ; i < s.length; i++) {
            if(i == 8) {
                continue;
            }
            a.add(s[i] - '0');
        }
        int cnt = 0;
        int tmp1 = 0;
        int tmp2 = 0;
        for(int i = 0; i < a.size(); i++) {
            if(a.get(i) == 6 || a.get(i) == 8) {
                cnt++;
            }
        }
        for(int i = 0; i < a.size() - 1; i++) {
            if(a.get(i) >= a.get(i + 1)) {
                tmp1 = 1;
            }
            if(a.get(i) != a.get(i + 1)) {
                tmp2 = 1;
            }
        }
        if(cnt == 5) {
            return "YES";
        }
        if(tmp1 == 0) {
            return "YES";
        }
        if(tmp2 == 0) {
            return "YES";
        }
        if(a.get(0) == a.get(1) && a.get(1) == a.get(2) && a.get(2) != a.get(3) && a.get(3) == a.get(4)) {
            return "YES";
        }
        return "NO";
    }
    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.nextLine();
        while(t-- > 0) {
            char[] s = scanner.nextLine().toCharArray();
            System.out.println(check(s));
        }
    }
}
