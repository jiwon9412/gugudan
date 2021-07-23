import java.util.Scanner;

public class Upgrade_Gugudan2 {

	public static void main(String[] args) {
		System.out.println("출력할 단은?(예를 들어 8,7을 입력하면 팔칠단출력) :");
		Scanner scanner = new Scanner(System.in);
		
		String input = scanner.nextLine();
		String[] split = input.split(",");
		
		int first = Integer.parseInt(split[0]);
		int second = Integer.parseInt(split[1]);
		
		for(int i=2; i<=first; i++) {
			for(int j=1; j<=second; j++) {
				System.out.println(i*j);
			}
		}
	}

}
