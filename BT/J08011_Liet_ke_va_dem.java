package BT;

import java.util.*;
public class J08011_Liet_ke_va_dem {
    static boolean check(String s) {
        for(int i = 0; i < s.length() - 1; i++) {
            if(s.charAt(i) > s.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> map = new LinkedHashMap<>();
        while(scanner.hasNextLine()) {
            String[] input = scanner.nextLine().trim().split("\\s+");
            if(input[0].isEmpty()) {
                break;
            }
            for(String i: input) {
                if(check(i)) {
                    if(!map.containsKey(i)) {
                        map.put(i, 1);
                    }
                    else {
                        map.put(i, map.get(i) + 1);
                    }
                }
            }
        }
        ArrayList<Integer> valueList = new ArrayList<>();
        for(Map.Entry<String, Integer> entry: map.entrySet()) {
            valueList.add(entry.getValue());
        }
        Collections.sort(valueList, Collections.reverseOrder());
        Map<String, Integer> ans_map = new LinkedHashMap<>();
        for (int i : valueList) {
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                if (entry.getValue().equals(i)) {
                    ans_map.put(entry.getKey(), i);
                }
            }
        }
        for(Map.Entry<String, Integer> entry: ans_map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
