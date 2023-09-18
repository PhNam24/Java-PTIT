package BT;

import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
public class J07008_Day_con_tang_dan {
    public static Scanner scanner = new Scanner(System.in);
    public static int n;
    public static int[] a = new int[25];
    public static int[] res = new int[25];
    public static ArrayList<String> ans = new ArrayList<>();
    static int check() {
        int[] tmp = new int[25];
        int cnt = 0;
        for(int i = 1; i <= n; i++) {
            if(res[i] == 1) {
                tmp[cnt++] = a[i];
            }
        }
        if(cnt == 1 || cnt == 0) {
            return 0;
        }
        for(int i = 0; i < cnt - 1; i++) {
            if(tmp[i] >= tmp[i + 1]) {
                return 0;
            }
        }
        return 1;
    }
    static void in() {
        if(check() == 1) {
            String tmp = "";
            for(int i = 1; i <= n; i++) {
                if(res[i] == 1) {
                    tmp += String.valueOf(a[i]) + " ";
                }
            }
            ans.add(tmp);
        }
    }
    static void Try(int i) {
        for(int j = 0; j < 2; j++) {
            res[i] = j;
            if(i == n) {
                in();
            }
            else {
                Try(i + 1);
            }
        }
    }
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("DAYSO.in");
        Scanner scanner1 = new Scanner(file);
        String s = null;
        while(scanner1.hasNextLine()) {
            s = scanner1.nextLine().trim();
            String[] tmp = s.split("\\s+");
            if(tmp.length == 1) {
                n =Integer.valueOf(s);
            }
        }
        String[] ss = s.split("\\s+");
        int d = 1;
        for(int i = 0; i < ss.length; i++) {
            a[d++] = Integer.valueOf(ss[i]);
        }
        Try(1);
        Collections.sort(ans);
        for(int i = 0; i < ans.size(); i++) {
            System.out.println(ans.get(i));
        }
    }
}
