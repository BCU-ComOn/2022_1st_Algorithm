package week1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int First = sc.nextInt();
		int Second = sc.nextInt();
		int third = sc.nextInt();
		int fourth = sc.nextInt();
		int Fifth = sc.nextInt();
		
		int sum = (First*First)+(Second*Second)+(third*third)+(fourth*fourth)+(Fifth*Fifth);
		int sixth = sum%10;
		System.out.println(sixth);
	}

}
