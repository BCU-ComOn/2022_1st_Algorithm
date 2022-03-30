import java.util.Scanner;

public class bj5585_YYH {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int money = 1000 - scan.nextInt();
        int count = 0;

        while (true) {
            if(money / 500 >= 1){
                money = money - 500;
                count++;
            }else if(money / 100 >= 1){
                money = money - 100;
                count++;
            }else if(money / 50 >= 1){
                money = money - 50;
                count++;
            }else if(money / 10 >= 1){
                money = money - 10;
                count++;
            }else if(money / 5 >= 1){
                money = money - 5;
                count++;
            }else if(money / 1 >= 1){
                money = money - 1;
                count++;
            }else{
                break;
            }
        }
        System.out.println(count);
    }
}