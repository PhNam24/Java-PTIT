package BT;

import java.util.*;

public class J02027_Khoang_cach_nho_hon_K {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-- > 0) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int[] a = new int[n];
            Set<Integer> s = new HashSet<>();
            for(int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
                s.add(a[i]);
            }
            Integer[] b = s.toArray(new Integer[0]);
            Arrays.sort(b);
            long cnt = 0;
            for(int i = 0; i < s.size(); i++) {
                long tmp = Arrays.binarySearch(b, b[i] + k);
                if(tmp < 0) {
                    tmp = -(tmp + 1);
                }
                cnt += (tmp - (long)i - 1);
            }
            System.out.println(cnt);
        }
    }
}
