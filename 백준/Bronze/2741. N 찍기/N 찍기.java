import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();

        input.close();

        for(int i = 1; i <= N; i++){
            System.out.println(i);
        }
    }
}