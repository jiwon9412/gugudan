import java.util.Scanner;

public class Gugudan_method {

	public static int[] calculate(int times) {
		int[] arr = new int[9];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = times*(i+1);
		}
		return arr;
	}
	
	public static void print(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	public static void main(String[] args) {
		System.out.println("구구단 중 출력할 단은? :");
		Scanner scanner = new Scanner(System.in);
		int times = scanner.nextInt();
		if(2<=times && times<=9) {
			print(calculate(times));

		}
		else {
			System.out.println("2부터 9까지의 숫자를 입력하세요!");

		}
	}

}
