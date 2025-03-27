import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        // Please write your code here.

        int[] months = {0, 31,28,31,30,31,30, 31, 31,30,31,30,31};
        int dayMin = 24 * 60;
        int hourMin = 60;

        int bias = 11 * dayMin + 11 * hourMin + 11;
        int target = A * dayMin + B * hourMin + C;
        if (target < bias) {
            System.out.println(-1);
        } else {
            System.out.println(target - bias);
        }
    }

    
}