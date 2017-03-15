import java.util.Scanner;

class Program{
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Vvedite dliny storon");
		int a = scanner.nextInt();
		int b = a;
		int r = a;
		int t = a;
		int mas[][] = new int[a][b];
		int mass[][] = new int[r][t];
		int w = 0;
		int q = 0;

		for (a = 0; a < mas.length; a++){
			for (b = 0; b < mas[a].length; b++){
				System.out.println("Vvedite element massiva");
				mas[a][b] = scanner.nextInt();
			}
		}
		System.out.println();

		for (a = 0; a < mas.length; a++){
			for (b = 0; b < mas[a].length; b++){
				System.out.print(mas[a][b] + "    ");
			}
			System.out.println();
		}

		for (a = 0; a < mas.length; a++){
			for (b = mas[a].length - 1; b >= 0; b--){
				mass[q][w] = mas[a][b];
				q++;
			}
			w++;
			q = 0;
		}
		System.out.println();
		
		for (q = 0; q < mass.length; q++){
			for (w = 0; w < mass[q].length; w++){
				System.out.print(mass[q][w] + "   ");
			}
			System.out.println();
		}
	}
}