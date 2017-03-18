import java.util.Scanner;

class Program{

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Vvedite razmer massiva");

		int a = scanner.nextInt();
		int b = 0;
		int q[];
		int max[] = new int[a];
		int c = 0;

		q = new int[a];

		while (b < a) {
			System.out.println("Vvedite element massiva");
			q[b] = scanner.nextInt();
			b = b + 1;
		}

		System.out.println();

		for (int i = 1; i < (q.length - 1); i++){
			if (q[i] > q[i - 1]){
				if (q[i] > q[i + 1]){
					max[c] = q[i];
					c++;
				}
			}
		}
		for (c = 0; c < max.length; c++){
			if (max[c] != 0){
			System.out.println(max[c]);}
		}
	}
}	