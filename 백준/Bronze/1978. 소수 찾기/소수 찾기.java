import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 주어진 수 N개
        int N = sc.nextInt();
        
        int number;
        // 소수의 갯수를 파악하기 위한 변수 선언
        int count = 0;
        
        for (int i =0; i < N; i++) {
            number = sc.nextInt();
            // 입력된 숫자를 2부터 하나씩 나누면서
            for(int j = 2; j <= number; j++) {
                // 만약 동일하다면(자기자신이라면) count를 1 증가
                if(j == number) {
                    count++;
                }
                // 나눈 나머지가 0이 되면(약수가 존재) 빠져 나온다
                if(number % j == 0) {
                    break;
                }
            }
        }

        System.out.println(count);
        
    }
}