package BT;
import java.util.*;
public class J08024_So_0_va_so_9 {
    static ArrayList<Integer> a =  new ArrayList<>();

    public static void sinh() {
        Queue<String> q = new LinkedList<>();
        q.add("9");
        a.add(9);
        while(!q.isEmpty()) {
            String tmp = q.poll();
            if(tmp.length() == 9) {
                break;
            }
            a.add(Integer.parseInt(tmp + "0"));
            a.add(Integer.parseInt(tmp + "9"));
            q.add(tmp + "0");
            q.add(tmp + "9");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        sinh();
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            for(int i: a) {
                if(i % n == 0) {
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}
