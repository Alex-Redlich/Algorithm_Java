import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[9];
        int maxNum = 0;
        int maxNumIndex = 0;
        for( int i = 0; i < 9; i++ ) {
            arr[i] = sc.nextInt();
            if(arr[i] > maxNum) {
                maxNum = arr[i];
                maxNumIndex = i;
            }
        }
        System.out.println(maxNum);
        System.out.println(maxNumIndex + 1);
    }
}