import java.util.Scanner;

public class BJ5585_jyj {
    public static void main(String[]arg){
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int[] array = {500,100,50,10,5,1};
        int money = 1000 - sc.nextInt();

        for(int i = 0; i < array.length; i++){
            if(money % array[i] >= 0){
                count += money/array[i];
                money = money%array[i];
            }
        }

        System.out.println(count);

    }
}
