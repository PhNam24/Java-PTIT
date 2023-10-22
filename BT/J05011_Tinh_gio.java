package BT;
import java.util.*;

class Player_J05011 implements Comparable<Player_J05011>{
    private String code, name, in, out;
    private int hour, minute;
    public Player_J05011() {
        this.code = null;
        this.name = null;
        this.in = null;
        this.out = null;
        this.hour = 0;
        this.minute = 0;
    }

    public Player_J05011(String code, String name, String in, String out) {
        this.code = code;
        this.name = name;
        this.in = in;
        this.out = out;
        String[] vao = in.split(":");
        String[] ra = out.split(":");
        int h1 = Integer.parseInt(vao[0]);
        int h2 = Integer.parseInt(ra[0]);
        int m1 = Integer.parseInt(vao[1]);
        int m2 = Integer.parseInt(ra[1]);
        if(m2 < m1) {
            this.minute = m2 + 60 - m1;
            this.hour = h2 - h1 - 1;
        }
        else {
            this.minute = m2 - m1;
            this.hour = h2 - h1;
        }
    }

    @Override
    public String toString() {
        return this.code + " " + this.name + " " + this.hour + " gio " + this.minute + " phut";
    }

    @Override
    public int compareTo(Player_J05011 a) {
        if(this.hour != a.hour) {
            if(this.hour > a.hour) {
                return -1;
            }
            else {
                return 1;
            }
        }
        if(this.minute > a.minute) {
            return -1;
        }
        return 1;
    }
}
public class J05011_Tinh_gio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        ArrayList<Player_J05011> a = new ArrayList<>();
        for(int i = 0 ; i < n; i++) {
            String code = scanner.nextLine();
            String name = scanner.nextLine();
            String in = scanner.nextLine();
            String out = scanner.nextLine();
            a.add(new Player_J05011(code, name, in, out));
        }
        Collections.sort(a);
        for(Player_J05011 i: a) {
            System.out.println(i);
        }
    }
}
