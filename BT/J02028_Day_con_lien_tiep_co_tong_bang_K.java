package BT;

import java.util.*;
public class J02028_Day_con_lien_tiep_co_tong_bang_K {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-- > 0) {
            int n = scanner.nextInt();
            long k = scanner.nextLong();
            long[] a = new long[n];
            for(int i = 0; i < n; i++) {
                a[i] = scanner.nextLong();
            }
            Map<Long, Long> m =  new HashMap<>();
            long sum = 0;
            m.put(sum , 1L);
            String ans = "NO";
            for(int i = 0; i < n; i++) {
                sum += a[i];
                if(m.containsKey(sum - k)) {
                    ans = "YES";
                    break;
                }
                m.put(sum, m.getOrDefault(sum, 0L) + 1);
            }
            System.out.println(ans);
        }
    }
}
