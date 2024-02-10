import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 필요한 입력 값 받기
        int N = sc.nextInt();
        int M = sc.nextInt();
        // 배열을 만들어 입력값 보관
        int[] arr = new int[N];
        for(int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        // 최대한 가까운 카드를 만들기 위한 변수 생성
        int result = 0;
        // 3중 포문으로 arr[i] arr[j] arr[k] 의 합을 조건에 검사
        // 부르트포스로 검사 순회
        for (int i = 0 ; i < N-2; i++ ) {
            for(int j = i+1; j < N-1; j++) {
                for(int k = j+1; k < N; k++) {
                    int sum = arr[i] + arr[j] + arr[k];
                    // M에 가장 가까운 수로 갱신
                    if ( sum <= M) {
                        result = Math.max(result, sum);
                    }
                }
            }
        }
        System.out.println(result);
    }
}