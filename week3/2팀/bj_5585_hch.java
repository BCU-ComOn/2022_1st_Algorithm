import java.util.Scanner;

public class bj_5585_hch {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int money = in.nextInt();
        int send = 1000 - money;
        int result = 0;

        int [] coins = {500,100,50,10,5,1};

        for(int coin : coins){

            if (coin > send)
                continue;
            result += send / coin;
            send %= coin;

        }
        System.out.println(result);

    }
}
