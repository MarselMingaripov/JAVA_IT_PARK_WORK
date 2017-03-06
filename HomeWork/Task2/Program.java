import java.util.Scanner;

class Program {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println ("Vvedite chislo");

		int a = scanner.nextInt();
		int sum = 0;
		int b = 1;

			 while (a != -1) {
				
				if (b % 2 == 0) {

					sum = sum + a;
				}
					b = b + 1;
					System.out.println ("Vvedite chislo");

					a = scanner.nextInt();
			}
	System.out.println ("Summa chisel s chetnim poryadkom vhozhdeniya =" + sum);		

	}
}