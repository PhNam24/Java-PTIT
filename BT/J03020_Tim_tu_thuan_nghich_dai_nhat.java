package BT;

import java.util.*;
public class J03020_Tim_tu_thuan_nghich_dai_nhat {
    static boolean check(String s) {
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> m = new LinkedHashMap<>();
        int maxLength = 0;
        while(scanner.hasNextLine()) {
            String[] ss = scanner.nextLine().split("\\s+");
            if(ss.length == 1 && ss[0].isEmpty()) {
                break;
            }
            for(String s: ss) {
                if(check(s)) {
                    if(m.containsKey(s)) {
                        m.put(s, m.get(s) + 1);
                    }
                    else {
                        m.put(s, 1);
                    }
                    maxLength = Math.max(maxLength, s.length());
                }
            }
        }
        for(Map.Entry<String, Integer> i: m.entrySet()) {
            if(i.getKey().length() == maxLength && i.getValue() != 0) {
                System.out.println(i.getKey() + " " + i.getValue());
                m.put(i.getKey(), 0);
            }
        }
    }

}