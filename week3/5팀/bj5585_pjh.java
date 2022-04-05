package Week03_;
import java.util.Scanner;
public class Bj5585_pjh {

    public static void main(String[] args) {
    	System.out.println("상품의 가격을 입력하시오");
    	Scanner ex = new Scanner(System.in);//상품가격
    	int M = 1000 - ex.nextInt();
        int amount = 0; //거스름돈 개수
        int [] change = {500,100,50,10,5,1};
        for (int i=0;i<change.length; i++){
            if(M % change[i]>=0){
                amount += M/change[i];
                M = M%change[i];  
            }
        } 
        System.out.println(amount);
    }
}