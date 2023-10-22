package TH.TH2;

import java.util.*;
import java.io.*;
public class D_Xu_ly_van_ban_2 {
    static boolean check(String s) {
        if(s.contains(".") || s.contains(",") || s.contains("!") || s.contains("?") || s.contains(":")) {
            return false;
        }
        for(int i = 0; i < s.length(); i++) {
            if(Character.isDigit(s.charAt(i))) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new File("TH/TH2/InputFile/VANBAN.in"));
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
