import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt(); // 시
        int d = sc.nextInt(); // 분
        // Please write your code here.

        int end = c * 60 + d;
        int start = a * 60 + b;

        int gap = end - start;

        System.out.println(gap);
    }
}