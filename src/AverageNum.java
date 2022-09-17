import java.util.Scanner;

public class AverageNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double i = -1;
        double s = 0;
        double a = 0;
        double b = 0;
        do {
            a = scan.nextInt();
            s += a;
            b = s;
            i++;
        } while (a != 0);
        System.out.println(b / i);
    }
}