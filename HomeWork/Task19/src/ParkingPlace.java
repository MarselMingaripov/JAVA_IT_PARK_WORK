
public class ParkingPlace {
    static  int AmountOfPlace =50;
    static String ParkPlace[] = new String[AmountOfPlace];
    static int FreePlace = 50;

    static   void parking(String model) {
        if(FreePlace != 0){
            for(int i = 0; i < ParkPlace.length; i++){
                if(ParkPlace[i] == null){
                    ParkPlace[i] = model;
                    FreePlace--;
                    System.out.println("Транспорт" + " "  + model + " " + "занял место" + " " + i + "." + " " + "Свободных мест" + " " + FreePlace);
                    System.out.println();
                    break;
                }

            }
        }
        else {
            System.out.println("Мест нет!");
            System.out.println();

        }

    }

     static void unparking(String model) {
        for(int i = 0; i < ParkPlace.length; i++){
            if(model == ParkPlace[i]){
                ParkPlace[i] = null;
                FreePlace++;
                System.out.println("Транспорт" + " " + model + " " + "уезжает");
                System.out.println("Свободных мест" + " " + FreePlace);
                System.out.println();
            }
        }
    }
}
