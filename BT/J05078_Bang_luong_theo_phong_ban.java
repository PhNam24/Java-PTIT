package BT;

import java.util.*;

class Employee_J05078 {
    private String code, name, room;
    private long luongCB, ngayCong, heSo, tong;
    public Employee_J05078(String code, String room, String name, long luongCB, long ngayCong) {
        this.code = code;
        this.room = room;
        this.name = name;
        this.luongCB = luongCB;
        this.ngayCong = ngayCong;
        int year = Integer.parseInt(this.code.substring(1, 3));
        if(year <= 3) {
            switch(this.code.charAt(0)){
                case 'A':
                    this.heSo = 10;
                    break;
                case 'B':
                    this.heSo = 10;
                    break;
                case 'C':
                    this.heSo = 9;
                    break;
                case 'D':
                    this.heSo = 8;
                    break;
            }
        }
        else if(year <= 8) {
            switch(this.code.charAt(0)){
                case 'A':
                    this.heSo = 12;
                    break;
                case 'B':
                    this.heSo = 11;
                    break;
                case 'C':
                    this.heSo = 10;
                    break;
                case 'D':
                    this.heSo = 9;
                    break;
            }
        }
        else if(year <= 15) {
            switch(this.code.charAt(0)){
                case 'A':
                    this.heSo = 14;
                    break;
                case 'B':
                    this.heSo = 13;
                    break;
                case 'C':
                    this.heSo = 12;
                    break;
                case 'D':
                    this.heSo = 11;
                    break;
            }
        }
        else {
            switch(this.code.charAt(0)){
                case 'A':
                    this.heSo = 20;
                    break;
                case 'B':
                    this.heSo = 16;
                    break;
                case 'C':
                    this.heSo = 14;
                    break;
                case 'D':
                    this.heSo = 13;
                    break;
            }
        }
        this.tong = this.luongCB * this.ngayCong * this.heSo * 1000;
    }

    public String getCode() {
        return this.code;
    }

    @Override
    public String toString() {
        return this.code + " " + this.name + " " + this.tong;
    }
}
public class J05078_Bang_luong_theo_phong_ban {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, String> map = new HashMap<>();
        for(int i = 0; i < n; i++) {
            String[] tmp = scanner.nextLine().split(" ");
            String room = "";
            for(int j = 1; j < tmp.length; j++) {
                room += tmp[j];
                if(j < tmp.length - 1) {
                    room += " ";
                }
            }
            if(!map.containsKey(tmp[0])) {
                map.put(tmp[0], room);
            }
        }
        int q = Integer.parseInt(scanner.nextLine());
        ArrayList<Employee_J05078> a = new ArrayList<>();
        for(int i = 0; i < q; i++) {
            String code = scanner.nextLine();
            String room = map.get(code.substring(3));
            String name = scanner.nextLine();
            long luongCB = Long.parseLong(scanner.nextLine());
            long ngayCong = Long.parseLong(scanner.nextLine());
            a.add(new Employee_J05078(code, room, name, luongCB, ngayCong));
        }
        String query = scanner.nextLine();
        System.out.println("Bang luong phong " + map.get(query) + ":");
        for(Employee_J05078 i: a) {
            if(i.getCode().substring(3).equals(query)) {
                System.out.println(i);
            }
        }
    }
}
