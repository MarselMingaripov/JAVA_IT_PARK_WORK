import java.util.Scanner;

class Program {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Vvedite chislo");
		int a = scanner.nextInt();
		int c = 1;

		while (a != -1){
			int sum = 0;
			int b = 2;
			int e = 2;
			int q = a;

			while (q != 0){
				sum = sum + q % 10;
				q = q /10;
			}
			System.out.println(sum);
			int d = sum / 2;

			while (b <= d){
				if (sum % b == 0){
					if (sum == 2){
						c = c * a;
						b = b + 1;
					}
					else {
						if (sum == 3) {
							c = c * a;
							b = b + 1;
						}
						else {
							b = b + 1;
						}
					}
				}
				else {
					b = b + 1;
					e = e + 1;
				}
			}
			if (e == b){
				c = c * a;
			}
			System.out.println("Vvedite cledyuschee chislo");
			a = scanner.nextInt();	

		}
		System.out.println("Proizvedenie chisel, summa cifr kotoryx prostoe chislo = " + c);
		System.out.println();
	}
}