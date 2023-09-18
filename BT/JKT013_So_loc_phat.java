package BT;

import java.util.*;
public class JKT013_So_loc_phat {

    public static void sinh(int n) {
        ArrayList<Long> a = new ArrayList<>();
        Queue<String> q = new LinkedList<>();
        q.add("6");
        q.add("8");
        a.add(6L);
        a.add(8L);
        while(!q.isEmpty()) {
            String tmp = q.poll();
            if(tmp.length() == n) {
                break;
            }
            a.add(Long.parseLong(tmp + "6"));
            a.add(Long.parseLong(tmp + "8"));
            q.add(tmp + "6");
            q.add(tmp + "8");
        }
        a.sort(Comparator.reverseOrder());
        System.out.println(a.size());
        for(long i: a) {
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-- > 0) {
            int n = scanner.nextInt();
            sinh(n);
            System.out.println();
        }
    }
}
