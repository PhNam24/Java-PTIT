package TH.TH3;


import com.sun.source.tree.Tree;

import java.util.*;

public class Bai_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-- > 0) {
            int n = scanner.nextInt();
            int[] a = new int[n];
            Set<Integer> le = new TreeSet<>();
            Set<Integer> chan = new TreeSet<>();
            for(int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
                if(a[i] % 2 != 0) {
                    le.add(a[i]);
                }
                else {
                    chan.add(a[i]);
                }
            }
            for(Integer i: chan) {
                System.out.print(i + " ");
            }
            System.out.println();
            ArrayList<Integer> b = new ArrayList<>();
            b.addAll(le);
            Collections.sort(b, Collections.reverseOrder());
            for(Integer i: b) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
