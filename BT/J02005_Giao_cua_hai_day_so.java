    package BT;

    import java.util.Arrays;
    import java.util.Scanner;

    public class J02005_Giao_cua_hai_day_so {
        public static Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) {
            int[] d = new int[1005];
            int n = scanner.nextInt(), m = scanner.nextInt();
            int[] a = new int[n], b = new int[m];
            for(int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
                d[a[i]] = 1;
            }
            for(int i = 0; i < m; i++) {
                b[i] = scanner.nextInt();
            }
            Arrays.sort(b);
            for(int i = 0; i < m; i++) {
                if(d[b[i]] == 1) {
                    System.out.print(b[i] + " ");
                    d[b[i]] = 0;
                }
            }
        }
    }
