import java.util.Scanner;

class Program{

	public static int rf(int a){
		int b = 0;
		int c = 1;
		int d = 0;
		for(int i = 0; i < (a - 2); i++){
			d = b + c;
			b = c;
			c = d;
		}
		return d;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Vvedite nomer chlena ryada");
		int q = scanner.nextInt();
		System.out.println();
		int w = rf(q);
		System.out.println(w);
		System.out.println();
	}
	
}