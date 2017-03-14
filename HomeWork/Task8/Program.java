import java.util.Scanner;

class Program{

	public static int srar(int a, int b){

		Scanner scanner = new Scanner(System.in);
		System.out.println("Vvedite kolichestvo strok");
		int a = scanner.nextInt();
		System.out.println("Vvedite kolichestvo stolbcov");
		int b = scanner.nextInt();

		int mas[][] = new int [a][b];

		for (a = 0; a < mas.length; a++){
			for (b = 0; b < mas[a].length; b++){
				System.out.println("Vvedite element massiva");
				mas[a][b] = scanner.nextInt();
				System.out.println(mas[a][b]);
				
			}
		}
		
		int kol = 0;
		int matr[][] = new int [a][b];
		int sum = 0;
		for (a = 0; a < matr.length; a++){
			for (b = 0; b < matr[0].length; b++){
			
				sum = sum + matr[a][b];
				kol++;

			}
		}
		int result = sum / kol;
		return result;

	}
	public static void main(String[] args) {

		int itog = srar(a, b);

		System.out.println(itog);
	}
}