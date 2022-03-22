package week2;
import java.util.Scanner;
public class bj19698_lsj {
	public static int[] input() {
		Scanner input = new Scanner(System.in);
		int[] val= {
				input.nextInt(),
				input.nextInt(),
				input.nextInt(),
				input.nextInt()
		};
		input.close();
		return val;
	}
	public static int room_size_cal(int[] val) {
		// [ N W H L ]
		int cow_num=val[0];
		int width=val[1];
		int height=val[2];
		int target_size=val[3];
		if(cow_num<(width/target_size)*(height/target_size)) {
			return cow_num;
		}else {
			return ((width/target_size)*(height/target_size));
		}
	}
	public static boolean validation_check(int[] val) {
		for(int index=0;index<val.length;index++) {
			if(val[index]<1||val[index]>1000) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] val=input();
		if (validation_check(val)) {
			int result = room_size_cal(val);
			System.out.println(result);
		}
	}
}
