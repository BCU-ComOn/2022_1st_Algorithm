import java.util.Scanner;

public class bj2675_YYH {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = scan.nextInt();
        int[] num = new int[count];
        String[] word = new String[count];

        for (int i = 0; i < count; i++) {
            num[i] = scan.nextInt();
            word[i] = scan.next();
        }

        for (int i = 0; i < word.length; i++) {
            for (int j = 0; j < word[i].length(); j++) {
                for (int k = 0; k < num[i]; k++) {
                    System.out.print(word[i].charAt(j));
                }
            }
            System.out.println();
        }
    }
}

