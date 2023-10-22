package TH.TH2;

import java.util.*;
import java.io.*;
public class C_Xu_ly_van_ban_1 {
    static boolean check(String s) {
        for(int i = 0; i < s.length(); i++) {
            if(Character.isDigit(s.charAt(i))) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new File("VANBAN.in"));
        Set<String> s = new TreeSet<>();
        while(scanner.hasNext()) {
            String input = scanner.next();
            if(check(input)) {
                s.add(input);
            }
        }
        for(String i: s) {
            System.out.println(i);
        }
    }
}
