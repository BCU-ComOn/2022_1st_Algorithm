import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] small_boy = new int[9];
		int sum = 0;
		int A = 0, B = 0;

		for (int i = 0; i < small_boy.length; i++) { // ������ Ű �Է�
			small_boy[i] = sc.nextInt();
			sum += small_boy[i]; // sum�� ������ 9���� Ű�� ��
		}
		Arrays.sort(small_boy); //Ű�� ���������� ����
		
		for(int a = 0; a < small_boy.length-1; a++) { //���Ʈ ����
			for(int b = a+1; b < small_boy.length; b++) {
				if(sum - small_boy[a] - small_boy[b] == 100) { //�ٽ�
					A = a;
					B = b;
					break;
				}
			}
		}
		
		for(int j = 0; j < small_boy.length; j++) { // ��¥ ������ Ű ���
			if(j == A || j == B) //����
				continue;
			System.out.println(small_boy[j]);
		}
		sc.close();
	}
}