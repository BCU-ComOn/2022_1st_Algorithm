package week1;
//��ǥ : a+b�� ���� ���
// ����Ʈ ��ĳ��
import java.util.Scanner;

public class bj2558_lsj {
	//�Է� �Լ�
	public static int[] user_input() {
		Scanner input= new Scanner(System.in);
		int[] value= {input.nextInt(),input.nextInt()};
		input.close();
		return value;
	}
	//��� �Լ�
	public static int summary(int a,int b) {
		return a+b;
	}
	public static void main(String[] args) {
		int[] value=user_input();
		System.out.println(summary(value[0],value[1]));
	}

}
