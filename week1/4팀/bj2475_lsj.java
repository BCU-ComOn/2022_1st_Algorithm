package week1;
// ��ǥ : ������ 5���� �������� ��� ��ģ �� ������ 10�� �� ���

import java.util.Scanner;

public class bj2475_lsj {
	// �Է� �Լ�
	public static String value_input() {
		Scanner input=new Scanner(System.in);
		return input.nextLine();
	}
	//���ڿ��� ������ 5���� ������ ��ȯ�ϴ� �Լ�
	public static int[] extract_value(String str) {
		//������ �� �迭 ����
		int[] keys=new int[5];
		//���ڿ� ������
		String[] strArr=str.split(" ");
        //���� ���ڿ��� ���� ����ȭ�Ͽ� �迭�� �ֱ�
		for(int count=0;count<5;count++) {
			keys[count]=Integer.parseInt(strArr[count]);
		}
		return keys;
	}
	//���� ��� �����Ͽ� 10�� ���� �������� ���ϴ� �Լ�
	public static int result(int[] arr) {
		//������ ���� ���� ����� ���� ����
		int sum=0;
		//�迭 ���� ���� �����Ͽ� sum�� ���ϴ� ��
		for(int count=0;count<5;count++) {
			sum+=arr[count]*arr[count];
		}
		//�� ��ȯ
		return sum%10;
	}
	
	// MAIN
	public static void main(String[] args) {
		String str=value_input();
		int[] keys=extract_value(str);
		System.out.println(result(keys));
	}

}
