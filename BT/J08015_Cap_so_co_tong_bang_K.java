package BT;

import java.util.*;
import java.io.*;

public class J08015_Cap_so_co_tong_bang_K {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-- > 0) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            long[] a = new long[n];
            Map<Long, Long> m = new HashMap<>();
            for(int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
                if(m.containsKey(a[i])) {
                    long tmp = m.get(a[i]);
                    m.put(a[i], tmp + 1);
                }
                else {
                    m.put(a[i], (long)1);
                }
            }
            long cnt = 0;
            for(int i = 0; i < n; i++){
                if(m.containsKey(k - a[i])) {
                    if(a[i] == k - a[i]) {
                        cnt += m.get(a[i]) - 1;
                    }
                    else {
                        cnt += m.get(k -  a[i]);
                    }
                }
            }
            System.out.println(cnt / 2);
        }
    }
}
