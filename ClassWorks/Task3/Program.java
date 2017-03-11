class Program{
	public static void main(String[] args) {
		
		int a[] = {-3, 10, 11, 12, 15, -5};
		int j = 0;
		int i = 0;
		for (j = a.length - 1; j > 0; j--){
			for (i = 0; i < j; i++){
				if (a[i] > a[i + 1]){
					int temp = a[i];
					a[i] = a[i + 1];
					a[i + 1] = temp;		
				}
			
			}
		}
		for (i = 0; i < a.length; i++){
		System.out.print(a[i] + " ");
	}
}
}