import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Car> carList = new ArrayList<>(3);
        for (int i=0;i<3;i++){
            System.out.println("— Введите название машины №"+(i+1)+": ");
            String name = scanner.next();
            System.out.println("— Введите скорость машины №"+(i+1)+": ");
            int speed = scanner.nextInt();
            while (speed<1||speed>250){
                System.out.println("— Неправильная скорость");
                System.out.println("— Введите скорость машины №"+(i+1)+": ");
                speed = scanner.nextInt();
            }
            carList.add(new Car(name, speed));
        }
        Race raceResult = new Race();
        raceResult.resultRace(carList);
    }

}