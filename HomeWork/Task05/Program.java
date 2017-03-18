import java.util.Scanner;

class Program{
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Vvedite razmer massiva");
		int a = scanner.nextInt();
		int q[];
		q = new int [a];
		int sum = 0;
		int w = 0;

		while (w < a){
			System.out.println("Vvedite element massiva");
			q[w] = scanner.nextInt();
			sum = sum + q[w];
			w = w + 1;
		}
		System.out.println("Summa elementov massiva = " + sum);
		System.out.println();
	}
}