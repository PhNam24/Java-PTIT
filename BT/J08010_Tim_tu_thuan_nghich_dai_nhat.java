package BT;

import java.util.*;
public class J08010_Tim_tu_thuan_nghich_dai_nhat {
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
        Map<String, Integer> map = new LinkedHashMap<>();
        int maxLen = 0;
        while(scanner.hasNextLine()) {
            String[] input = scanner.nextLine().trim().split("\\s+");
            if(input[0].isEmpty()) {
                break;
            }
            for(String i: input) {
                if(check(i)) {
                    maxLen = Math.max(maxLen, i.length());
                    if(!map.containsKey(i)) {
                        map.put(i, 1);
                    }
                    else {
                        map.put(i, map.get(i) + 1);
                    }
                }
            }
        }
        for(Map.Entry<String, Integer> entry: map.entrySet()) {
            if(entry.getKey().length() == maxLen) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        }
    }
}
