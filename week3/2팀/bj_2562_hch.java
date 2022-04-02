import java.util.Scanner;

public class bj_2562_hch {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int [] range = {in.nextInt(),in.nextInt(),in.nextInt(),
                        in.nextInt(),in.nextInt(),in.nextInt(),
                        in.nextInt(),in.nextInt(),in.nextInt()};
        in.close();

        int count = 0;
        int max = 0;
        int index = 0;

        for(int value : range){
            count+=1;

            if (value > max) {
            max = value;
            index = count;

            }
        }
        System.out.println(max + "\n" + index);
    }
}
