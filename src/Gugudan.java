import java.util.Scanner;

public class Gugudan {

	public static void main(String[] args) {
		System.out.println("구구단 중 출력할 단은? :");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		
		if(2<=num && num<=9) {
			for(int i=1; i<=9; i++) {
				System.out.println(num*i);
			}
		}
		else {
			System.out.println("2부터 9까지의 숫자를 입력하세요!");
		}
		
	}

}
