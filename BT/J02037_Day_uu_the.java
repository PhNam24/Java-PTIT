package BT;

import java.util.*;
public class J02037_Day_uu_the {
    static String check(ArrayList<Integer> a) {
        int c = 0, l = 0;
        for(int i = 0; i < a.size(); i++) {
            if(a.get(i) % 2 == 0) {
                c++;
            }
            else {
                l++;
            }
        }
        if(a.size() % 2 == 0) {
            if(c > l) {
                return "YES";
            }
            else {
                return  "NO";
            }
        }
        else if(c > l) {
            return "NO";
        }
        return "YES";
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        while(t-- > 0 ) {
            String[] s = scanner.nextLine().split("\\s+");
            ArrayList<Integer> a = new ArrayList<>();
            for(int i = 0; i < s.length; i++) {
                a.add(Integer.parseInt(s[i]));
            }
            System.out.println(check(a));
        }
    }
}
