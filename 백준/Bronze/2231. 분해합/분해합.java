import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        // 결과값 받기위한 변수
        int result = 0;
        // 0부터 N 까지 모든 숫자를 돌면서
        for(int i = 0; i < N; i++) {
            int number = i;
            int sum = 0;
            // 각 자릿수 더하는 작업
            while(number != 0) {
                sum += number % 10;
                number /= 10;
            }
            // 반복문을 도는 i(number)수와 각 자리를 더한 값이 N과 같을때
            // 생성자를 찾았을 때 탈출
            if(sum + i == N) {
                result = i;
                break;
            }
        }

        System.out.println(result);
    }
}