import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Car> carList = new ArrayList<>(3);
        for (int i=0;i<3;i++){
            System.out.println("— Введите название машины №"+(i+1)+": ");
            String name = scanner.next();
            int speed;



            while (true){

                System.out.println("— Введите скорость машины №"+(i+1)+": ");

                if (scanner.hasNextInt()) {
                    speed = scanner.nextInt();
                    if(speed>0&&speed<251){
                        break;
                    }
                }
                System.out.println("— Неправильная скорость");
                scanner.nextLine();
            }

            carList.add(new Car(name, speed));
        }
        Race raceResult = new Race();
        raceResult.resultRace(carList);
    }

}