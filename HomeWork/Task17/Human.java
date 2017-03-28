public class Human {

	private String name;
	private int age;

	public Human() {
        this.name = " ";
        this.age = 0;
    }

	public Human(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
    	this.age = age;
    }

    public String getName() {
    	return name;
    }

    public int getAge() {
    	return age;
    }

	/*public static int[] BubbleSort(int b[]) {
		int a[] = new int[10];
		int i = a.length - 1;
		int j = 0;
		for (i = a.length -1; i > 0; i--){
			for (j = 0; j < i; j++){
				if (a[j].getAge() > a[j + 1].getAge()){
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		return a;
	}*/
}