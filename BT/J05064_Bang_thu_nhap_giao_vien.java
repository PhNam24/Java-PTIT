package BT;

import java.util.*;

class Teacher_J05064 {
    private String code, name;
    private long luong, bac, phuCap, tong;

    public Teacher_J05064(String code, String name, long luong) {
        this.code = code;
        this.name = name;
        this.luong = luong;
        String pos = this.code.substring(0, 2);
        this.bac = Long.parseLong(this.code.substring(2));
        if(pos.equals("HT")) {
            this.phuCap = 2000000;
        }
        else if(pos.equals("HP")) {

            this.phuCap = 900000;
        }
        else {
            this.phuCap = 500000;
        }
        this.tong = this.luong * this.bac + this.phuCap;
    }

    @Override
    public String toString() {
        return this.code + " " + this.name + " " + this.bac + " " + this.phuCap + " " + this.tong;
    }
}
public class J05064_Bang_thu_nhap_giao_vien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> map =  new HashMap<>();
        int n = Integer.parseInt(scanner.nextLine());
        ArrayList<Teacher_J05064> a = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            String code = scanner.nextLine();
            String name = scanner.nextLine();
            long luong = Long.parseLong(scanner.nextLine());
            String pos = code.substring(0,2);
            if(!map.containsKey(pos)) {
                map.put(pos, 1);
                a.add(new Teacher_J05064(code, name, luong));
            }
            else if(pos.equals("HT")) {
                if(map.get(pos) < 1) {
                    a.add(new Teacher_J05064(code, name, luong));
                    map.put(pos, map.get(pos) + 1);
                }
            }
            else if(pos.equals("HP")) {
                if(map.get(pos) < 2) {
                    a.add(new Teacher_J05064(code, name, luong));
                    map.put(pos, map.get(pos) + 1);
                }
            }
            else {
                map.put(pos, map.get(pos) + 1);
                a.add(new Teacher_J05064(code, name, luong));
            }
        }
        for(Teacher_J05064 i: a) {
            System.out.println(i);
        }
    }
}