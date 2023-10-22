package TH.TH2;

import java.util.*;
import java.io.*;

class Student_H implements Comparable<Student_H> {
    private String msv, ten, lop, email, sdt, deTai, gv;

    public Student_H(String msv, String ten, String lop, String email, String sdt) {
        this.msv = msv;
        this.ten = ten;
        this.lop = lop;
        this.email = email;
        this.sdt = "0" + sdt;
    }

    public String getMsv() {
        return this.msv;
    }

    public String getDeTai() {
        return this.deTai;
    }

    public void setDeTai(String deTai) {
        this.deTai = deTai;
    }

    public void setGv(String gv) {
        this.gv = gv;
    }

    @Override
    public int compareTo(Student_H a) {
        return this.msv.compareTo(a.msv);
    }

    public String toString() {
        return this.msv + " " + this.ten + " " + this.gv + " " + this.deTai + " " + this.sdt;
    }
}

public class H_Huong_dan_do_an_tot_nghiep {
    public static void main(String[] args) throws IOException {
        Scanner scanner1 = new Scanner(new File("DANHSACH.in"));
        ArrayList<Student_H> a = new ArrayList<>();
        ArrayList<String> input = new ArrayList<>();
        while (scanner1.hasNextLine()) {
            input.add(scanner1.nextLine());
            if (input.size() == 5) {
                a.add(new Student_H(input.get(0), input.get(1), input.get(2), input.get(3), input.get(4)));
                input.clear();
            }
        }
        Scanner scanner2 = new Scanner(new File("HUONGDAN.in"));
        int n = Integer.parseInt(scanner2.nextLine());
        for(int i = 0; i < n; i++) {
            String[] input1 = scanner2.nextLine().split("\\s+");
            String gv = "";
            for(int j = 0; j < input1.length - 1; j++) {
                gv += input1[j];
                if(j < input1.length - 2) {
                    gv += " ";
                }
            }
            int m = Integer.parseInt(input1[input1.length - 1]);
            for(int j = 0; j < m; j++) {
                String[] input2 = scanner2.nextLine().split("\\s+");
                String msv = input2[0];
                String deTai = "";
                for(int k = 1; k < input2.length; k++) {
                    deTai += input2[k];
                    if(k < input2.length - 1) {
                        deTai += " ";
                    }
                }
                for(Student_H k : a) {
                    if(k.getMsv().equals(msv)) {
                        k.setGv(gv);
                        k.setDeTai(deTai);
                    }
                }
            }
        }
        Collections.sort(a);
        for(Student_H i: a) {
            if(!i.getDeTai().isEmpty()) {
                System.out.println(i);
            }
        }
    }
}
