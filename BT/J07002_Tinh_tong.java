package BT;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class J07002_Tinh_tong {
    public static Scanner scanner = new Scanner(System.in);

    static boolean check(String s) {
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(0) == '-') {
                continue;
            }
            if(!Character.isDigit(s.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("DATA.in");
        Scanner scanner1 = new Scanner(file);
        String s = null;
        long sum = 0;
        while(scanner1.hasNextLine()) {
            s = scanner1.nextLine().trim();
            if(s.equals("")) {
                continue;
            }
            String[] ss = s.split("\\s+");
            for(int i = 0; i < ss.length; i++) {
                if(ss[i].length() > 9) {
                    continue;
                }
                if(check(ss[i])) {
                    if(Long.valueOf(ss[i]) <= 2147483647 && Long.valueOf(ss[i]) >= -2147483648) {
                        sum += Integer.valueOf(ss[i]);
                    }
                }
            }
        }
        System.out.print(sum);
    }
}
