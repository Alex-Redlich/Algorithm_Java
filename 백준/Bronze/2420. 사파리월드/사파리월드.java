import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        long n = input.nextLong();
        long m = input.nextLong();

        input.close();

        System.out.println(Math.abs(n-m));

    }
}