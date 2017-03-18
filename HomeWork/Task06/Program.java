import java.util.Scanner;

class Program{

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Vvedite razmer massiva");
		int a = scanner.nextInt();
		int b = 0;
		int c = 1;
		int q[];
		q = new int [a];

		while (b < a) {
			System.out.println("Vvedite element massiva");
			q[b] = scanner.nextInt();
			b = b + 1;
		}

		int e = 0;

		while (e < a){
			if (q[e] % 2 == 0)
				if (e % 2 != 0){
					c = c * q[e];
				}
				e = e + 1;
		}
		System.out.println("Proizvedenie chetnyx elementov massiva na nechetnyx mestax = " + c);
		System.out.println();
	}
}