import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int T = input.nextInt();
        for (int i = 1; i < T+1; i++) {
            int A = input.nextInt();
            int B = input.nextInt();
            System.out.println(A+B);
        }
        input.close();

    }
}