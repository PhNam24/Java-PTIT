package BT;
import java.util.*;
class Student_J05018 implements Comparable<Student_J05018>{
    private String code, name, rank;
    private double sum;

    public Student_J05018() {
        this.code = null;
        this.name = null;
        this.rank = null;
        this.sum = 0;
    }

    public Student_J05018(int stt, String name, double sum) {
        this.code = "HS";
        if(stt < 10) {
            this.code += "0" + String.valueOf(stt);
        }
        else {
            this.code += String.valueOf(stt);
        }
        this.name = name;
        this.sum = sum;
        if(this.sum >= 9) {
            this.rank = "XUAT SAC";
        }
        else if(this.sum >= 8) {
            this.rank = "GIOI";
        }
        else if(this.sum >= 7) {
            this.rank = "KHA";
        }
        else if(this.sum >= 5) {
            this.rank = "TB";
        }
        else {
            this.rank = "YEU";
        }
    }

    @Override
    public String toString() {
        double scale = Math.pow(10, 1);
        return this.code + " " + this.name + " " + (Math.round(this.sum * scale) / scale) + " " + this.rank;
    }

    @Override
    public int compareTo(Student_J05018 a) {
        if(this.sum != a.sum) {
            if(this.sum > a.sum) {
                return -1;
            }
            else {
                return 1;
            }
        }
        return this.code.compareTo(a.code);
    }
}
public class J05018_Bang_diem_hoc_sinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        ArrayList<Student_J05018> a = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            double sum = 0;
            for(int j = 0; j < 10; j++) {
                if(j < 2) {
                    sum += scanner.nextDouble() * 2;
                }
                else {
                    sum += scanner.nextDouble();
                }
            }
            sum /= 12;
            a.add(new Student_J05018(i + 1, name, sum));
            if(i < n - 1) {
                scanner.nextLine();
            }
        }
        Collections.sort(a);
        for(Student_J05018 i: a) {
            System.out.println(i);
        }
    }
}
