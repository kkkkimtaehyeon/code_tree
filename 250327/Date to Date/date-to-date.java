import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        // Please write your code here.

        int[] months = {0, 31,28,31,30,31,30, 31, 31,30,31,30,31};

        int result = 0;
        for (int m = m1; m < m2; m++) {
            result += months[m];
        }
        result += d2;
        result -= d1 - 1;
        System.out.println(result);
    }
}