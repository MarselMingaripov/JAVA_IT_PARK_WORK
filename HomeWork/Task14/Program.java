import java.util.Scanner;

class Program{

	public static boolean prost(int a){
		int b;
		int c = 0;

		for(b = 2; b <= (a / 2); b++){
			if(a % b == 0){
				c++;
			}
		}
		System.out.println();
		if(c != 0){
			return true;
		}
		else {
			return false;
		}

	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Vvedite chislo");
		System.out.println();
		int q = scanner.nextInt();

		if(prost(q) == false){
			System.out.println("Chislo prostoe");
		}
		else{
			System.out.println("Chislo ne prostoe");
		}
		System.out.println();
	}
}