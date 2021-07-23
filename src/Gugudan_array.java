import java.util.Scanner;

public class Gugudan_array {

	public static void main(String[] args) {
		System.out.println("구구단 중 출력할 단은? :");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int [][]arr = new int[8][9];
		
		if(2<=num && num<=9) {
			for(int i=0; i<arr.length; i++) {
				for(int j=0; j<9; j++) {
					arr[i][j] = i*(j+1);
				}
			}
			for(int i=0; i<9; i++) {
				System.out.println(arr[num][i]);
			}
		}
		else {
			System.out.println("2부터 9까지의 숫자를 입력하세요!");
		}
		
		
	}

}
