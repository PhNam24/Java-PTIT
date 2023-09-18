package BT;

import java.util.*;
public class J03022_Xu_ly_van_ban {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> ans = new ArrayList<>();
        String input = "";
        while(scanner.hasNextLine()) {
            String tmp1 = scanner.nextLine();
            for(int i = 0; i < tmp1.length(); i++) {
                if(i == 0) {
                    input += tmp1.charAt(i);
                    continue;
                }
                if((tmp1.charAt(i - 1) == '.' || tmp1.charAt(i - 1) == '?' || tmp1.charAt(i - 1) == '!')) {
                    input += " " + tmp1.charAt(i);
                }
                else {
                    input += tmp1.charAt(i);
                }
            }
            String[] ss = tmp1.split("\\s+");
            if(ss.length == 1 && ss[0].isEmpty()) {
                break;
            }
        }
        String[] s = input.split("\\s+");
        String tmp = "";
        for(String string: s) {
            System.out.println(string);
            if(tmp.isEmpty()) {
                tmp += string;
            }
            else {
                tmp += " " + string;
            }
            if(tmp.charAt(tmp.length() - 1) == '.' || tmp.charAt(tmp.length() - 1) == '?' || tmp.charAt(tmp.length() - 1) == '!') {
                String tmp1 = "";
                for(int i = 0; i < tmp.length() - 1; i++) {
                    if(i == 0) {
                        tmp1 += Character.toUpperCase(tmp.charAt(i));
                    }
                    else {
                        tmp1 += Character.toLowerCase(tmp.charAt(i));
                    }
                }
                ans.add(tmp1);
                tmp = "";
            }
        }
        for(String i: ans) {
            System.out.println(i);
        }
    }
}
