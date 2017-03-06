import java.util.Scanner;

class Program {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Vvedite chislo");
		int a = scanner.nextInt();
		int c = 1;
		int d = a / 2;

		while (a != -1){
			int b = 2;
			int e = 2;

			while (b <= d){
				if (a % b == 0){
					if (a == 2){
						c = c * a;
						b = b + 1;
					}
					else {
						if (a == 3) {
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
		System.out.println("Proizvedenie prostyx chisel = " + c);
		System.out.println();
	}
}