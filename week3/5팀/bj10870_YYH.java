import java.util.Scanner;

public class bj10870_YYH {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int array[] = new int[21];
        array[0] = 0;
        array[1] = 1;
        
        for (int i = 2; i < array.length; i++) {
            array[i] = array[i-1] + array[i-2];
        }
        System.out.println(array[num]);
    }
}
