package week1;

import java.util.Scanner;
public class bj8393_lsj {
	//���� �Է¹޴� �Լ�
	public static int user_input() {
		Scanner input=new Scanner(System.in);
		return input.nextInt();
	}
	//�Էµ� ���� �ùٸ��� Ȯ���ϴ� �Լ�
	public static boolean check(int value) {
		if (value>=1 || value<=10000) {
			return true;
		}
		return false;
	}
	//1���� n������ ���� ���� ��ȯ�ϴ� �Լ�
	public static int sum(int value) {
		int summary=0;
		for(int count=0;count<=value;count++) {
			summary+=count;
		}
		return summary;
	}
	
	//����� Main
	public static void main(String[] args) {
		//�� �Է¹ޱ�
		int input_value=user_input();
		//���� �ùٸ��� Ȯ�� �� ����
		if(check(input_value)) {
			System.out.println(sum(input_value));
		}
	}

}