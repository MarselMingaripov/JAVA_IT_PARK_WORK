import java.util.Scanner;

class Program{

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Vvedite razmer massiva");

		int a = scanner.nextInt();
		int b = 0;
		int q[];
		q = new int[a];

		while (b < a) {
			System.out.println("Vvedite element massiva");
			q[b] = scanner.nextInt();
			b = b + 1;
		}

		System.out.println();

		int w = 0;
		int e = 0;
		int r = a - 1;

		while (w < a / 2) {
			int temp = q[w];
			q[w] = q[r];
			q[r] = temp;
			w = w + 1;
			r = r - 1;
		}
		int t = 0;

		while (t < a){
			System.out.println(q[t]);
			t = t + 1;
		}
	}
}	