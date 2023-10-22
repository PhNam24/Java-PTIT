    package BT;

    import java.util.*;

    class Student_J06004 implements Comparable<Student_J06004> {
        private String code, name, sdt, topic;
        private int group;

        public Student_J06004(String code, String name, String sdt, int group) {
            this.code = code;
            this.name = name;
            this.sdt = sdt;
            this.group = group;
            this.topic = "";
        }

        public int getGroup() {
            return this.group;
        }

        public void setTopic(String topic) {
            this.topic = topic;
        }

        @Override
        public int compareTo(Student_J06004 a) {
            return this.code.compareTo(a.code);
        }
        @Override
        public String toString() {
            return this.code + " " + this.name + " " +  this.sdt + " " + this.group + " " + this.topic;
        }
    }
    public class J06004_Quan_ly_bai_tap_nhom_2 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            scanner.nextLine();
            ArrayList<Student_J06004> a = new ArrayList<>();
            for(int i = 0; i < n; i++) {
                String code = scanner.nextLine();
                String name = scanner.nextLine();
                String sdt = scanner.nextLine();
                int group = Integer.parseInt(scanner.nextLine());
                a.add(new Student_J06004(code, name, sdt, group));
            }
            for(int i = 0; i < m; i++) {
                String topic = scanner.nextLine();
                for(Student_J06004 j: a) {
                    if(j.getGroup() == i + 1) {
                        j.setTopic(topic);
                    }
                }
            }
            Collections.sort(a);
            for(Student_J06004 i: a) {
                System.out.println(i);
            }
        }
    }
