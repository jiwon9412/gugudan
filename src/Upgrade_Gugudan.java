import java.util.Scanner;

public class Upgrade_Gugudan {

	public static void main(String[] args) {
		System.out.println("출력할 단은?(예를 들어 8을 입력하면 팔팔단출력) :");
		Scanner scanner = new Scanner(System.in);
		int times = scanner.nextInt();
		
		for(int i=2; i<=times; i++) {
			for(int j=1;j<=times; j++) {
				System.out.println(i*j);
			}
		}
	}

}
