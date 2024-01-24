import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int H = sc.nextInt();
        int M = sc.nextInt();

        int resultH = 0;
        int resultM = 0;

        if (M < 45) {
            resultH = H - 1;
            if(resultH == -1) {
                resultH = 23;
            }
            resultM = M + 15;
        } else {
            resultH = H;
            resultM = M -45 ;
        }
        System.out.println(resultH + " " + resultM);
    }
}