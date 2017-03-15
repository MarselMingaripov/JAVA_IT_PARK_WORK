import java.util.Scanner;

class Program{
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Vvedite kolichesnvo strok");
		int a = scanner.nextInt();
		System.out.println("Vvedite kolichesnvo stolbcov");
		int b = scanner.nextInt();
		int mas[][] = new int[a][b];
		int q = 1;

		for (a = 0; a < mas.length; a++){
			for (b = 0; b < mas[a].length; b++){
				System.out.println("Vvedite element massiva");
				mas[a][b] = scanner.nextInt();
			}	
		}

		for (a = 0; a < mas.length; a++){
			int min = mas[a][0];
			for(b = 0; b < mas[a].length; b++){
				if (mas[a][b] < min){
					min = mas[a][b];
				}
			}
			System.out.println("Min " + q + " stroki = " + min);
			q++;
			System.out.println();
		}
	}
}