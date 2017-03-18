import java.util.Scanner;

class Program{

	public static int sumch(int a){
		int q = 0;
		while(a != 0){
			q = q + a % 10;
			a = a / 10;
		}
		return q;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Vvedite chislo");
		System.out.println();
		int r = scanner.nextInt();
		int t = sumch(r);
		System.out.println();
		System.out.println("Summa cifr chisla = " + t);
	}
}