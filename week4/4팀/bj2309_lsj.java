import java.util.Scanner;
// 목표 : 9명의 난쟁이 키의 전체 합에서 2명의 난쟁이 키를 빼 100이 되는 값을 찾으면, 7명의 진짜 난쟁이를 찾을 수 있다.
// 주의사항 : 다른 방식이 있을 수 있음에 유의
public class bj2309_lsj {
	//입력부
	public static int[] input() {
		Scanner input = new Scanner(System.in);
		int[] value=new int[9];
		for(int count=0;count<9;count++) {
			//9번 입력받는다. (난쟁이의 키)
			value[count]=input.nextInt();
		}
		return value;
	}
	//진짜 난쟁이의 키를 찾아 반환하는 함수
	public static int[] seek_gnome(int[] val) {
		int summary=0;
		//난쟁이들의 키의 합
		for(int count=0;count<val.length;count++) {
			summary+=val[count];
		}
		summary-=100; //가짜 난쟁이들의 키의 합 (전체 합 - 가짜 난쟁이들의 합 = 진짜 난쟁이들의 합)
		int[] spy=new int[2]; //가짜 난쟁이들의 키를 저장할 배열 선언
		for(int first_case=0;first_case<val.length;first_case++) { //첫 번째 가짜 난쟁이를 구하는 반복문 - first_case는 첫 번째 난쟁이의 index
			for(int second_case=0;second_case<val.length;second_case++) { //두 번째 가짜 난쟁이를 구하는 반복문 - second_case는 두 번째 난쟁이의 index
				if((val[first_case]+val[second_case])==summary) { //전체 합에서 둘의 키를 빼면 100이다 == "두 난쟁이는 가짜이다"
					spy[0]=val[first_case];spy[1]=val[second_case]; //두명의 가짜 난쟁이가 누구인지 저장
					break;
				}
			}
		}
		// 진짜 난쟁이들을 저장할 배열 선언
		int[] result=new int[7];
		// 가짜 난쟁이를 제외한 진짜 난쟁이들만 방금 선언한 배열에 저장
		for(int count=0,correct_one=0;count<val.length;count++) { // correct_one은 count와 달리 진짜 난쟁이들의 배열의 index를 증가시키기 위해 선언
			if((val[count]==spy[0])||(val[count]==spy[1])) { // 해당하는 index에 존재하는 난쟁이가 가짜였는가?
				//System.out.println("spy detected. : "+val[count]); // 테스트용
				continue;
			}else { //해당하는 index에 존재하는 난쟁이가 진짜였다면
				result[correct_one]=val[count]; // 진짜 난쟁이들의 배열에 저장
				//System.out.println("value : "+result[correct_one]); // 테스트용
				correct_one++; //result의 인덱스 증가를 위해 값 증가
			}
		}
		//결과값 반환
		return result;
	}
	//오름차순 정렬
	public static int[] ascending_arr(int[] arr) {
		while(true) { //오름차순 정렬이 완료될때까지 무한 반복
			boolean is_ascending=true; //오름차순이 완료되있다고 가정
			for(int count=1;count<arr.length;count++) { //배열의 모든 값을 바로 앞의 값과 비교해 오름차순대로 정렬
				if(arr[count-1]>arr[count]) {  //오름차순이 아니라면
					is_ascending=false;  //오름차순이 아니라고 bool값 저장
					int temp=arr[count-1]; //값을 잠시 보관해둘 임시 변수 temp 선언
					arr[count-1]=arr[count];
					arr[count]=temp;
				}
			}
			//for문에서 오름차순인지 검색을 마친 후에도 is_ascending이 true 라면 반복문 종료 (오름차순이 완료됨)
			if(is_ascending==true) {
				break;
			}
		}
		//값 반환
		return arr;
	}
	//배열값을 출력하는 함수
	public static void print_arr(int[] arr) {
		for(int count=0;count<arr.length;count++) {
			System.out.println(arr[count]);
		}
	}
	public static void main(String[] args) {
		//실행부
		int[] value=input();
		int[] gnomes=seek_gnome(value);
		int[] ascending_arr=ascending_arr(gnomes);
		print_arr(ascending_arr);
	}
}
