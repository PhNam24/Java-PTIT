package BT;

import java.util.*;;
import java.io.*;
class IntSet_J07009 {
    private Set<Integer> set = new TreeSet<>();
    public IntSet_J07009 (int[] a) {
        for(int i = 0; i < a.length; i++) {
            this.set.add(a[i]);
        }
    }

    public IntSet_J07009 intersection(IntSet_J07009 s) {
        ArrayList<Integer> tmp = new ArrayList<>();
        for(Integer i: this.set) {
            if(s.set.contains(i)) {
                tmp.add(i);
            }
        }
        int[] ans = new int[tmp.size()];
        int d = 0;
        for(Integer i: tmp) {
            ans[d++] = i;
        }
        return new IntSet_J07009(ans);
    }

    @Override
    public String toString() {
        String ans = "";
        for(Integer i: this.set) {
            ans += i + " ";
        }
        return ans;
    }
}
public class J07009_Lop_IntSet_2 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        int n = sc.nextInt(), m = sc.nextInt(), a[] = new int[n], b[] = new int[m];
        for(int i = 0; i<n; i++) a[i] = sc.nextInt();
        for(int i = 0; i<m; i++) b[i] = sc.nextInt();
        IntSet_J07009 s1 = new IntSet_J07009(a);
        IntSet_J07009 s2 = new IntSet_J07009(b);
        IntSet_J07009 s3 = s1.intersection(s2);
        System.out.println(s3);
    }
}
