import java.util.ArrayList;

public class Race {

    public static void resultRace(ArrayList<Car>carList){
        String vinName="";
        int distanceMax=0;
        int maxSpeed=0;
        for (Car car : carList) {
            if(car.speed>maxSpeed){
                maxSpeed=car.speed;
                vinName=car.name;
                distanceMax=maxSpeed*24;
            }
        }
        System.out.println("Самая быстрая машина: "+vinName+" проехала "+distanceMax+" киллометров");
    }
}
