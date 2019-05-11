public class GardenMain {
    public static void main(String[] args) {
        Plant plant1 = new Plant("Tulipan", 1000);
        Plant plant2 = new Plant("Róża", 500);
        Plant plant3 = new Plant("Orchidea", 100);

        Garden garden = new Garden();

        garden.plant1=plant1;
        garden.plant2 = plant2;
        garden.plant3 = plant3;

        garden.printInfo();

        System.out.println(garden.monthlyWaterDemand(plant1,plant2,plant3));
        System.out.println(garden.yearlyWaterDemand(plant1,plant2,plant3));

    }
}
