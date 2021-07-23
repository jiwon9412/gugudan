import java.util.Scanner;

public class Gugudan_Main {

	public static void main(String[] args) {
		System.out.println("구구단 중 출력할 단은? :");
		Scanner scanner = new Scanner(System.in);
		int times = scanner.nextInt();
		if(2<=times && times<=9) {
			Gugudan_method.print(Gugudan_method.calculate(times));

		}
		else {
			System.out.println("2부터 9까지의 숫자를 입력하세요!");

		}
	}

}
