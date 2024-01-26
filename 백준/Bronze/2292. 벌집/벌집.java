import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        // 방문 수 선언 초기화
        int count = 1;
        // 겹? 두께? 선언 초기화
        int range = 2;
        // N이 1일 경우 출력 예외처리
        if (N == 1) {
            System.out.println(1);
        } else {
            // 한겹당 6n으로 숫자가 커지기에 그 안에 숫자가 있는지 판단해서 계산
            while (range <= N) {
                range = range + (6 * count);
                count++;
            }
            // 최소 방문수 출력
            System.out.println(count);
        }
    }
}