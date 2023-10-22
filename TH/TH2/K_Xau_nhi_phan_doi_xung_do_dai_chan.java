package TH.TH2;

import java.util.*;
public class K_Xau_nhi_phan_doi_xung_do_dai_chan {
    static ArrayList<String> ans = new ArrayList<>();
    static int n;
    static int[] a = new int[35];

    static void print(int n) {
        String tmp = "";
        for(int i = 1; i <= n / 2; i++) {
            tmp += String.valueOf(a[i]);
        }
        String tmp1 = "";
        for(int i = tmp.length() - 1; i >= 0; i--) {
            tmp += tmp.charAt(i);
        }
        ans.add(tmp);
    }

    static void Try(int i, int n) {
        for(int j = 0; j < 2; j++) {
            a[i] = j;
            if(i == n / 2) {
                print(n);
            }
            else {
                Try(i + 1, n);
            }
        }
    }
    public static void main(String[] args) {
        for(int i = 2; i <= 30; i += 2) {
            Try(1, i);
        }
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-- > 0) {
            n = scanner.nextInt();
            for(String i: ans) {
                if(i.length() <= n) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        }
    }
}
