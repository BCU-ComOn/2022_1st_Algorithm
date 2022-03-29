import java.util.Scanner;

public class bj2798_YYH {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = scan.nextInt();
        int[] array = new int[count];
        int num = scan.nextInt();
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = scan.nextInt();
        }

        for (int i = 0; i < array.length-2; i++) {
            for (int j = i+1; j < array.length-1; j++) {
                for (int k = j+1; k < array.length; k++) {
                    if(num - (array[i] + array[j] + array[k]) >= 0 && num - (array[i] + array[j] + array[k]) < num - sum){
                        sum = array[i] + array[j] + array[k];
                    }
                }
            }
        }
        System.out.println(sum);
    }
}