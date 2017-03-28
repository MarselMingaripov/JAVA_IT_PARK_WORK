public class Main{

	public static void main(String[] args) {
		
		Human people[] = new Human[10];
		Human marsel = new Human();
		Human regina = new Human();
		Human roman = new Human();
		Human vasya = new Human();
		Human kolya = new Human();
		Human dima = new Human();
		Human sasha = new Human();
		Human petya = new Human();
		Human tolya = new Human();
		Human zina = new Human();
		people[0] = marsel; 
		people[1] = regina; 
		people[2] = roman;
		people[3] = vasya;
		people[4] = kolya;
		people[5] = dima;
		people[6] = sasha;
		people[7] = petya;
		people[8] = tolya;
		people[9] = zina;

		marsel.setAge(10);
		regina.setAge(15);
		marsel.setName("Marsel");
		regina.setName("Regina");
		roman.setAge(14);
		roman.setName("Roman");
		vasya.setAge(40);
		vasya.setName("Vasya");
		kolya.setAge(27);
		kolya.setName("KOLYA");
		dima.setAge(38);
		dima.setName("Dima");
		sasha.setAge(66);
		sasha.setName("Alexsandr Ivanovich");
		petya.setAge(24);
		petya.setName("Petya");
		tolya.setAge(35);
		tolya.setName("Tolya");
		zina.setAge(51);
		zina.setName("Zina");
		Human temp;

		//int b[] = new int[10];
		//b = BubbleSort(people[].Human);
		
		for (int x = people.length -1; x > 0; x--){
			for (int y = 0; y < x; y++){
				if (people[y].getAge() > people[y + 1].getAge()){
					temp = people[y];
					people[y] = people[y + 1];
					people[y + 1] = temp;
				}
			}
		}



		for (int x = 0; x < people.length; x++){
			System.out.print(people[x].getName() + " ");
			System.out.print(people[x].getAge());
			System.out.println();
		}
	}
}