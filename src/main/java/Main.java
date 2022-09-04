public class Main {
    public static void main(String[] args) {

        Flat homes[] = new Flat[10];

        for (int i = 0; i < homes.length; i++ ){
            int randNum = (int)Math.floor(Math.random() * 3);

            if (randNum == 0) {
                homes[i] = new Flat("Waw","Narutowicza");
            }
            if (randNum == 1) {
                homes[i] = new House("Krk","Placka", 3);
            }
            if (randNum == 2) {
                homes[i] = new Residence("Krk","Placka", 4, 5);
            }

//            System.out.println(homes[i]);
        }
        for (int i = 0; i < homes.length; i++ ){

            System.out.println("Home i: " + i);
            Flat home = homes[i];

            if (home instanceof  Residence){
                Residence residence = (Residence) home;
                System.out.println("Residence garageSize: " + residence.getGarageSize());
                System.out.println(residence.toString());
            }else if (home instanceof House ){
                House house = (House) home;
                System.out.println("House parcelSize: " + house.getParcelSize());
                System.out.println(house.toString());
            }else {
                System.out.println(home.toString());
            }
        }

    }
}
