import java.util.Scanner;

class Program{

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		int max = 0;
		int q = 1;
		System.out.println("Vvedite kolichtsto strok");
		int a = scanner.nextInt();
		System.out.println("Vvedite kolichtsto stolbcov");
		int b = scanner.nextInt();
		int c = 0;
		int d = 0;

		int mas[][] = new int[a][b];

		for (a = 0; a < mas.length; a++){
			for (b = 0; b < mas[a].length; b++){
				System.out.println("Vvedite element massiva");
				mas[a][b] = scanner.nextInt();
			}
		}
		System.out.println();

		for (a = 0; a < mas.length; a++){
			for (b = 0; b < mas[a].length; b++){
				System.out.print(mas[a][b] + " ");
			}
			System.out.println();
		}
		
		for (d = 0; d < b; d++){
			for (c = 0; c < a; c++){
				if (mas[c][d] > max){
				max = mas[c][d];
				}
			}
			System.out.println(max + " - max znach v stolbce " + q);
		max = 0;
		q++;
		}	
	}
}