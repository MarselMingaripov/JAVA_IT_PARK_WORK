import java.util.Scanner;

class Program{
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Vvedite dliny storon");
		int a = scanner.nextInt();
		int b = a;
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
				System.out.print(mas[a][b] + "    ");
			}
			System.out.println();
		}
		for (a = 0; a < mas.length; a++){
			for (b = 0; b < mas[a].length; b++){
				if (a == b){
					mas[a][b] = 0;
				}
			}
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