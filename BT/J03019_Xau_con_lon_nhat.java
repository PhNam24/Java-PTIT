package BT;

import java.util.*;
public class J03019_Xau_con_lon_nhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String ans = "";
        char Min = 'a';
        for(int i = s.length() - 1; i >= 0; i--) {
            if(s.charAt(i) >= Min) {
                Min = s.charAt(i);
                ans = Min + ans;
            }
        }
        System.out.println(ans);
    }
}
