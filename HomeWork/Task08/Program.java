import java.util.Scanner;

class Program{

	public static int srar(int a, int b){

		int result = a / b;
		return result;
	}

		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);

			System.out.println("Vvedite kolichestvo strok");
			int a = scanner.nextInt();
			System.out.println("Vvedite kolichestvo stolbcov");
			int b = scanner.nextInt();
			int mas[][] = new int[a][b];
			int sum = 0;
			int kol = 0;

			for (a = 0; a < mas.length; a++){
				for (b = 0; b < mas[a].length; b++){
					System.out.println("Vvedite element massiva");
					mas[a][b] = scanner.nextInt();
					sum = sum + mas[a][b];
					kol++;
				}
			}
			int itog = srar(sum, kol);
			System.out.println("Srednee arif = " + itog);
	}
}