import java.util.Scanner;

class Program{
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Vvedite dliny storon");
		int a = scanner.nextInt();
		int b = a;
		int mas[][] = new int[a][b];
		int sb = a - 1;

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
			mas[a][sb] = 0;
			sb--;
		}
		System.out.println();
		for (a = 0; a < mas.length; a++){
			for (b = 0; b < mas[a].length; b++){
				System.out.print(mas[a][b] + "   ");	
			}
			System.out.println();
		}					
	}
}