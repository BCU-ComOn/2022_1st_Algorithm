import java.util.Scanner;

public class BJ5532_jyj {
    public static void main(String[]arg){
        Scanner sc = new Scanner(System.in);
        int A; // 국어 총 페이지 수
        int B; // 수학 총 페이지 수
        int C; // 하루에 풀 수 있는 국어 페이지 수
        int D; // 하루에 풀 수 있는 수학 페이지 수
        int L; // 방학 일 수
        int day = 0; // 방학 일 수 구하기 위한 값

        L = sc.nextInt();
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();
        while(true){
            A -= C;
            B -= D;
            day++;
            if (A <= 0 && B <= 0){
                break;
            }
        }
        System.out.println(L - day);
    }
}
