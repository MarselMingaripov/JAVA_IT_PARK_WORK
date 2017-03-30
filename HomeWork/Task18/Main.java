import java.util.Random;

public class Main{
	
	public static void main(String[] args) {
		
		Random random = new Random();

		int ages[] = new int[120];

		HumansList people[] = new HumansList[10];
		HumansList marsel = new HumansList();
		HumansList regina = new HumansList();
		HumansList roman = new HumansList();
		HumansList vasya = new HumansList();
		HumansList kolya = new HumansList();
		HumansList dima = new HumansList();
		HumansList sasha = new HumansList();
		HumansList petya = new HumansList();
		HumansList tolya = new HumansList();
		HumansList zina = new HumansList();
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


		/*marsel.setAge(10);
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
		zina.setName("Zina");*/

		
		
		marsel.setName("Marsel");
		regina.setName("Regina");
		roman.setName("Roman");
		vasya.setName("Vasya");
		kolya.setName("KOLYA");
		dima.setName("Dima");
		sasha.setName("Alexsandr Ivanovich");
		petya.setName("Petya");
		tolya.setName("Tolya");
		zina.setName("Zina");
		
		for(int i = 0; i < people.length; i++) {
			people[i].setAge(random.nextInt(120)) ;
		}

		for(int i = 0; i < people.length; i++) {
			System.out.println(people[i].getName() + "      " + people[i].getAge());
		}

		System.out.println();

		for(int i = 0; i < ages.length; i++){
			ages[i] = 0;
		}

		for (int i = 0; i < 121; i++){
			for (int j = 0; j < people.length; j++){
				if (people[j].getAge() == i){
					ages[i]++;
				}
			}
		}

		for (int i = 0; i < ages.length; i++){
			if(ages[i] != 0){
				System.out.println("vozrast" + " " + i + "  " + "kolichestvo" + " " + ages[i]);
			}
		}
	}
}