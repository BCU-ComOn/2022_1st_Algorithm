package week1;

import java.util.Scanner;
public class bj3046_lsj {
	//���� �Է¹޴� �κ�
	public static int[] input() {
		Scanner input = new Scanner(System.in);
		int[] result= {input.nextInt(),input.nextInt()};
		return result;
	}
	//R2���� ã�� �Լ�
	public static int find_R2(int[] val) {
		//���X2-R1 = R2�� �̿��� ���
		int result=val[1]*2-val[0];
		return result;
	}
	//�Էµ� ���� �ùٸ��� Ȯ���ϴ� �Լ�
	public static boolean validation_check(int[] val) {
		int a=val[0];
		int b=val[1];
		//���� Ȯ��
		if((a>1000||a<-1000)||(b>1000||b<-1000)) {
			return false;
		}
		return true;
	}
	
	//�����
	public static void main(String[] args) {
		// �� �Է�
		int[] input_val=input();
		// ���� Ȯ�� �� R2�� ã�� ���
		if(validation_check(input_val)) {
			int result=find_R2(input_val);
			System.out.println(result);
		}
	}
}