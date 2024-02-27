import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        double[] number = new double[N];

        for (int i = 0; i < N; i++) {
            double temp = sc.nextDouble();
            number[i] = temp;
        }
        double sum = 0;
        Arrays.sort(number);

        for (int i = 0; i < N; i++) {
            sum += ((number[i] / number[number.length-1]) * 100);
        }
        System.out.println(sum / number.length);
    }
}