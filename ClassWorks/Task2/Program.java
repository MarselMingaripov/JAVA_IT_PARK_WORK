class Program{
	public static int sumall(int a, int b){
		int result = 0;
		while (a != b){
			result = result + a;
			a = a + 1;
		}
		result = result + b;
		return result;
	}
	public static void main(String[] args) {
		int s = 0;
		int e = 10;
		int r = 12;
		s = sumall (e,r);
		System.out.println(s);
	}

}