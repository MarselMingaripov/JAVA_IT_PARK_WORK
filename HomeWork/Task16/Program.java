import java.util.Scanner;

class Program {
	
	public static int fib(int n, int x1, int x2) {
		int x3;
		if (n > 2) {
			x3 = x1 + x2;
			x1 = x2;
			x2 = x3;
			return fib(n - 1, x1, x2);
		} else {
			return x2;
		}
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Vvedite nomer chlena ryada");
		int x = scanner.nextInt();
		System.out.println();
		int y = fib(x, 0, 1);
		System.out.println(y);
		System.out.println();
	}
}