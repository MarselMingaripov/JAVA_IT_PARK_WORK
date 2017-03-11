import java.util.Random;
class Program{
	public static void main(String[] args) {
		int ages[] = new int[1000];
		Random random = new Random();
		int a[] = new int[120];
		for (int i = 0; i < a.length; i++){
			a[i] = 0;
		}

		for(int i = 0; i < ages.length; i++) {
			ages[i] = random.nextInt(120);
		}
		
		for (int i = 0; i < ages.length; i++){
			for (int q = 0; q < a.length; q++){
			if (ages[i] == q){
			a[i] = a[i] + 1;	
			}
		}
	}
		for (int i = 0; i < a.length; i++){
			System.out.println(a[i]);
		}
	}
}