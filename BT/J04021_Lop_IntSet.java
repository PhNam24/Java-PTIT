package BT;

import java.util.*;

class IntSet {
    private ArrayList<Integer> arr = new ArrayList<>();
    private int[] d = new int[1005];
    public IntSet(int[] arr) {
        for(int i = 0; i < 1005; i++) {
            this.d[i] = 0;
        }
        for(int i = 0; i < arr.length; i++) {
            d[arr[i]]++;
        }
        for(int i = 0; i < 1005; i++) {
            if(this.d[i] != 0) {
                this.arr.add(i);
            }
        }
    }

    public IntSet union(IntSet a) {
        ArrayList<Integer> tmp = new ArrayList<>();
        int[] cnt = new int[1005];
        for(Integer i : this.arr) {
            cnt[i]++;
        }
        for(Integer i : a.arr) {
            cnt[i]++;
        }
        for(int i = 0; i < 1005; i++) {
            if(cnt[i] != 0) {
                tmp.add(i);
            }
        }
        int[] ans = new int[tmp.size()];
        for(int i = 0; i < tmp.size(); i++) {
            ans[i] = tmp.get(i);
        }
        return new IntSet(ans);
    }

    @Override
    public String toString() {
        String ans = "";
        for(Integer i : this.arr) {
            ans += i + " ";
        }
        return ans;
    }
}
public class J04021_Lop_IntSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), a[] = new int[n], b[] = new int[m];
        for(int i = 0; i<n; i++) a[i] = sc.nextInt();
        for(int i = 0; i<m; i++) b[i] = sc.nextInt();
        IntSet s1 = new IntSet(a);
        IntSet s2 = new IntSet(b);
        IntSet s3 = s1.union(s2);
        System.out.println(s3);
    }
}
