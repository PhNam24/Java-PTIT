package TH.Practice1;

import java.util.*;
import java.io.*;

public class F_Thiet_lap_dia_chi_email_2  {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new File("DANHSACH.in"));
        Set<String> set = new HashSet<>();
        ArrayList<String> d = new ArrayList<>();
        while(scanner.hasNextLine()) {
            String tmp = scanner.nextLine().trim().toLowerCase();
            String[] s = tmp.split("\\s+");
            String fullname = "";
            for(int i = 0 ; i < s.length - 1; i++) {
                fullname += s[i];
            }
            if(set.contains(fullname)) {
                continue;
            }
            else {
                set.add(fullname);
            }
            String name = s[s.length - 1];
            for(int i = 0 ; i < s.length - 1; i++) {
                name += s[i].charAt(0);
            }
            d.add(name);
            int cnt = Collections.frequency(d, name);
            System.out.print(name);
            if(cnt != 1) {
                System.out.print(cnt);
            }
            System.out.println("@ptit.edu.vn");
        }
    }
}

