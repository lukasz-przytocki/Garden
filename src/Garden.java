public class Garden {
    Plant plant1;
    Plant plant2;
    Plant plant3;

    void printInfo(){
        System.out.println(plant1.name + " " + plant1.waterDemand +"ml\n"+
                plant2.name + " " + plant2.waterDemand+"mn\n"+
                plant3.name + " " + plant3.waterDemand);
    }


     int monthlyWaterDemand(Plant plant1, Plant plant2, Plant plant3){
        return 30*(plant1.waterDemand+plant2.waterDemand+plant3.waterDemand);
    }

    int yearlyWaterDemand(Plant plant1, Plant plant2, Plant plant3){
        return monthlyWaterDemand(plant1,plant2,plant3)*12;
    }

}
