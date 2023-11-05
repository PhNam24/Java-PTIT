package TH.TH3;

import java.time.format.DateTimeFormatter;
import java.util.*;
import java.io.*;
import java.time.*;

class Student_TH3 implements Comparable<Student_TH3> {
    private String name;
    private long totalTime;

    public Student_TH3(String name, long totalTime) {
        this.name = name;
        this.totalTime = totalTime;
    }

    @Override
    public int compareTo(Student_TH3 a) {
        if(this.totalTime != a.totalTime) {
            return -(int)(this.totalTime - a.totalTime);
        }
        return this.name.compareTo(a.name);
    }

    public String toString() {
        return this.name + " " + this.totalTime;
    }
}

public class Bai_2 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new File("TH/TH3/InputFile/ONLINE.in"));
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        int n = Integer.parseInt(scanner.nextLine());
        ArrayList<Student_TH3> a = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            String time1 = scanner.nextLine();
            String time2 = scanner.nextLine();
            LocalDateTime start = LocalDateTime.parse(time1, dateTimeFormatter);
            LocalDateTime end = LocalDateTime.parse(time2, dateTimeFormatter);
            long totalTime = Duration.between(start, end).toMinutes();
            a.add(new Student_TH3(name, totalTime));
        }
        Collections.sort(a);
        for(Student_TH3 i: a) {
            System.out.println(i);
        }
    }
}
