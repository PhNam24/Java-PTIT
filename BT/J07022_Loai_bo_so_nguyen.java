package BT;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J07022_Loai_bo_so_nguyen {
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
        ArrayList<String> ans = new ArrayList<>();
        while(scanner1.hasNextLine()) {
            s = scanner1.nextLine().trim();
            if(s.equals("")) {
                continue;
            }
            String[] ss = s.split("\\s+");
            for(int i = 0; i < ss.length; i++) {
                if(ss[i].length() > 9) {
                   ans.add((ss[i]));
                   continue;
                }
                if(!check(ss[i])) {
                    ans.add(ss[i]);
                }
                else {
                    if(Long.valueOf(ss[i]) > 2147483647 || Long.valueOf(ss[i]) < -2147483648) {
                        ans.add(ss[i]);
                    }
                }
            }
        }
        Collections.sort(ans);
        for(int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
    }
}
