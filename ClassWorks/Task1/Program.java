import java.util.Scanner;
class Program{
	public static void main(String[] args) {
		
		int a[] = {-3, 10, 11, 12, 15, -5};

		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int c = 0;
		for (int i = 1; i < a.length; i++){
			if (a[i] == x){
				c = i;
				
		
			}
		}

		if (c == 0){
			System.out.println("-1");
		}
		else {
			System.out.println(c);
		}

	
	}
}