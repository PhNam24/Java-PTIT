package BT;

import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

class Person_J05055 {
    private String code, name, bonus;
    private int rank, age, them;
    private Date start, end, time, last;
    private long result;

    public Person_J05055 (int stt, String name, String birth, String start, String end) throws ParseException {
        this.code = "VDV";
        if(stt < 10) {
            this.code += "0" + stt;
        }
        else {
            this.code += stt;
        }
        this.name = name;
        String[] tmp = birth.split("/");
        this.age = 2021 - Integer.parseInt(tmp[2]);
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
        if(this.age >= 32) {
            this.bonus = "00:00:03";
        }
        else if(this.age >= 25) {
            this.bonus = "00:00:02";
        }
        else if(this.age >= 18) {
            this.bonus = "00:00:01";
        }
        else {
            this.bonus = "00:00:00";
        }
        this.start = sdf.parse(start);
        this.end = sdf.parse(end);
        this.result = this.end.getTime() - this.start.getTime();
        System.out.println(result);
        int seconds = (int)(this.result / 1000) % 60;
        int minutes = (int)(this.result / 1000 * 60) % 60;
        int hours = (int)(this.result / 1000 * 60 * 60) % 60;
        this.time = sdf.parse(String.format("%02d:%02d:%02d", hours, minutes, seconds));
        String[] tmp1 = this.bonus.split(":");
        seconds -= Integer.parseInt(tmp1[2]);
        if(seconds < 0) {
            seconds += 60;
            minutes -= 1;
        }
        if(minutes < 0) {
            minutes += 60;
            hours -= 1;
        }
        this.last = sdf.parse(String.format("%02d:%02d:%02d", hours, minutes,seconds));
        this.rank = 1;
    }

    @Override
    public String toString() {
        return this.code + " " + this.name + " " + this.time + " " + this.bonus + " " + this.last + " " + this.rank;
    }
}
public class J05055_Xep_hang_van_dong_vien_1 {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        ArrayList<Person_J05055> a = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            String birth = scanner.nextLine();
            String start = scanner.nextLine();
            String end = scanner.nextLine();
            a.add(new Person_J05055(i + 1, name, birth, start, end));
        }
        for(Person_J05055 i: a) {
            System.out.println(i);
        }
    }
}
