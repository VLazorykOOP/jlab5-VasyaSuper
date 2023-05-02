package Task1;

import java.io.*;
import java.util.*;

public
class Main {
    public static void main(String[] args) {
        System.out.println(" Java lab 5 \n");
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
        try {
            File file = new File("D:\\IV_Семестр\\Java\\jlab5-VasyaSuper\\src\\Task1\\vehicles.txt");

            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] vehicles_parts = line.split(",");

                String vehicleName = vehicles_parts[0];
                double maxSpeed = Double.parseDouble(vehicles_parts[1]);

                Vehicle vehicle = new Vehicle(vehicleName, maxSpeed) {
                    @Override
                    public int compareTo(Vehicle o) {
                        return 0;
                    }
                };
                vehicles.add(vehicle);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не знайдено.");
        }

        System.out.println("Транспортний засіб: ");
        for (Vehicle vehicle : vehicles) {
            vehicle.show();
        }
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        ArrayList<Car> carList = new ArrayList<>();
        try {
            File file = new File("D:\\IV_Семестр\\Java\\jlab5-VasyaSuper\\src\\Task1\\car.txt");

            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] car_parts = line.split(",");

                String vehicleName = car_parts[0];
                double maxSpeed = Double.parseDouble(car_parts[1]);
                double power = Double.parseDouble(car_parts[2]);
                String color = car_parts[3];

                Car car = new Car(vehicleName, maxSpeed, power, color);
                carList.add(car);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не знайдено.");
            e.printStackTrace();
        }

        System.out.println("\nАвтомобіль: ");
        // Виведення списку автомобілів
        for (Car car : carList) {
            car.show();
        }
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        ArrayList<Train> trainsList = new ArrayList<>();

        try {
            File file = new File("D:\\IV_Семестр\\Java\\jlab5-VasyaSuper\\src\\Task1\\train.txt");

            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] trains_parts = line.split(",");

                String vehicleName = trains_parts[0];
                double maxSpeed = Double.parseDouble(trains_parts[1]);

                String color = trains_parts[2];
                double powerTraction = Double.parseDouble(trains_parts[3]);

                Train train = new Train(vehicleName, maxSpeed, color, powerTraction);
                trainsList.add(train);
            }
            scanner.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("\nПоїзд: ");
        // вивід списку об'єктів
        for (Train train: trainsList) {
            train.show();
        }
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        ArrayList<ExpressTrain> expressTrainList = new ArrayList<>();

        try {
            File file = new File("D:\\IV_Семестр\\Java\\jlab5-VasyaSuper\\src\\Task1\\expressTrain.txt");

            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] expressTrain_parts = line.split(",");

                String vehicleName = expressTrain_parts[0];
                double maxSpeed = Double.parseDouble(expressTrain_parts[1]);

                String color = expressTrain_parts[2];
                double powerTraction = Double.parseDouble(expressTrain_parts[3]);

                double numberWheels = Double.parseDouble(expressTrain_parts[4]);
                String fuel = expressTrain_parts[5];

                ExpressTrain expressTrain = new ExpressTrain(vehicleName, maxSpeed, color, powerTraction, numberWheels, fuel);
                expressTrainList.add(expressTrain);
            }
            scanner.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("\nЕкспрес: ");
        // вивід списку об'єктів
        for (ExpressTrain expressTrain: expressTrainList) {
            expressTrain.show();
        }
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        carList.add(new Car("Toyota", 200, 200, "red"));
        carList.add(new Car("BMW", 220, 120, "black"));
        carList.add(new Car("Mercedes", 240, 300, "white"));

        Collections.sort(carList);

        System.out.println("\n//////////////////////////////////////////////////////////////////////////////////////////////////////////////// ");
        for (Car car : carList) {
            System.out.print("\n");
            car.show();
        }
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        trainsList.add(new Train("Locomotive", 100, "Green", 25));
        trainsList.add(new Train("TopGun", 300, "Red", 100));
        trainsList.add(new Train("Low", 50, "Blue", 50));

        Collections.sort(trainsList);

        System.out.println("\n//////////////////////////////////////////////////////////////////////////////////////////////////////////////// ");
        for (Train train: trainsList) {
            System.out.print("\n");
            train.show();
        }
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        expressTrainList.add(new ExpressTrain("Loot", 100, "Green", 25,40, "oil"));
        expressTrainList.add(new ExpressTrain("Gun", 300, "Red", 100,50, "electrical"));
        expressTrainList.add(new ExpressTrain("knife", 50, "Blue", 50, 40, "oil"));

        Collections.sort(expressTrainList);

        System.out.println("\n//////////////////////////////////////////////////////////////////////////////////////////////////////////////// ");
        for (ExpressTrain expressTrain: expressTrainList) {
            System.out.print("\n");
            expressTrain.show();
        }
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        Scanner scanner = new Scanner(System.in);
        /*
        System.out.println("Додаємо по одному запису у кожну колекцію");
        System.out.println("Транспортний засіб");

        System.out.println("Введіть ім'я транспорту:");
        String name = scanner.nextLine();

        System.out.println("Введіть максимальну швидкість:");
        double maxSpeed = scanner.nextDouble();
        scanner.nextLine();

        vehicles.add(new Vehicle(name, maxSpeed));

        for (Vehicle vehicle : vehicles) {
            System.out.print("\n");
            vehicle.show();
        }
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("Автомобіль");

        System.out.println("Введіть ім'я транспорту:");
        String name1 = scanner.nextLine();

        System.out.println("Введіть максимальну швидкість:");
        double maxSpeed1 = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Потужність:");
        double power = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Колір автомобіля: ");
        String color = scanner.nextLine();

        carList.add(new Car(name1, maxSpeed1, power, color));

        Collections.sort(carList);

        for (Car car : carList) {
            System.out.print("\n");
            car.show();
        }
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("Поїзд");

        System.out.println("Введіть ім'я транспорту:");
        String name2 = scanner.nextLine();

        System.out.println("Введіть максимальну швидкість:");
        double maxSpeed2 = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Колір поїзда: ");
        String color1 = scanner.nextLine();

        System.out.println("Кількість (завантажених) вагонів які він може тягти: ");
        double powerTraction = scanner.nextDouble();
        scanner.nextLine();

        trainsList.add(new Train(name2, maxSpeed2, color1, powerTraction));

        Collections.sort(trainsList);

        System.out.println("\n//////////////////////////////////////////////////////////////////////////////////////////////////////////////// ");
        for (Train train: trainsList) {
            System.out.print("\n");
            train.show();
        }
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("Eкспрес");

        System.out.println("Введіть ім'я транспорту:");
        String name3 = scanner.nextLine();

        System.out.println("Введіть максимальну швидкість:");
        double maxSpeed3 = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Колір поїзда: ");
        String color2 = scanner.nextLine();

        System.out.println("Кількість (завантажених) вагонів які він може тягти: ");
        double powerTraction1 = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Кількість коліс: ");
        double numberWheels = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Вид палива який він використовує: ");
        String fuel = scanner.nextLine();

        expressTrainList.add(new ExpressTrain(name3, maxSpeed3,color2,powerTraction1,numberWheels,fuel));

        Collections.sort(expressTrainList);

        for (ExpressTrain expressTrain: expressTrainList) {
            System.out.print("\n");
            expressTrain.show();
        }*/
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        System.out.println("\n////////////////////////////////////////////////////////////////////////////////////////////////////////////////\n");
        List<Vehicle> transport  = new ArrayList<>();
        transport.addAll(carList);
        transport.addAll(trainsList);
        transport.addAll(expressTrainList);

        Collections.sort(transport);

        for (Vehicle vehicle : transport) {
            System.out.println(vehicle + "\n----------------------------------------------------");
        }

        System.out.println("\n////////////////////////////////////////////////////////////////////////////////////////////////////////////////\n");
        Comparator<Vehicle> comparator = Comparator.comparing(Vehicle::getMaxSpeed);
        Collections.sort(transport, comparator);

        for (Vehicle vehicle : transport) {
            System.out.println(vehicle + "\n----------------------------------------------------");
        }
    }

}

abstract class Vehicle implements Comparable<Vehicle>{
    protected String vehicleName;
    protected double maxSpeed;

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public Vehicle(String vehicleName, double maxSpeed) {
        this.vehicleName = vehicleName;
        this.maxSpeed = maxSpeed;
    }

    public int compareTo(Vehicle car) {
        if (car instanceof Car tt) {
            return CharSequence.compare(this.vehicleName, tt.vehicleName);
        }
        else
            return -1;
    }
    public String toString() {
        return "Vehicle " +
                "\nІм'я транспорту: " + vehicleName + "\nМаксимальна швидкість: " + maxSpeed;
    }

    public void show() {
        System.out.println("Ім'я транспорту: " + vehicleName);
        System.out.println("Максимальна швидкість: " + maxSpeed);
    }
}

class Car extends Vehicle{
    public double power;
    private String color;

    public Car(String vehicleName, double maxSpeed, double power, String color) {
        super(vehicleName, maxSpeed);
        this.power = power;
        this.color = color;
    }

    public String toString() {
        return "Vehicle " +
                "\nІм'я автомобіля: " + vehicleName + "\nМаксимальна швидкість: " + maxSpeed;
    }
    @Override
    public void show() {
        super.show();
        System.out.println("Потужність: " + power);
        System.out.println("Колір автомобіля: " + color);
    }
}

class Train extends Vehicle{
    protected String color;
    protected double powerTraction;

    public Train(String vehicleName, double maxSpeed, String color, double powerTraction) {
        super(vehicleName, maxSpeed);
        this.color = color;
        this.powerTraction = powerTraction;
    }

    public String toString() {
        return "Vehicle " +
                "\nІм'я потяга: " + vehicleName + "\nМаксимальна швидкість: " + maxSpeed;
    }
    public void show() {
        super.show();
        System.out.println("Колір потяга: " + color);
        System.out.println("Кількість (завантажених) вагонів які він може тягти: " + powerTraction);
    }
}

class ExpressTrain extends Train{
    private double numberWheels;

    private String fuel;
    public ExpressTrain(String vehicleName, double maxSpeed, String color, double powerTraction, double numberWheels, String fuel) {
        super(vehicleName, maxSpeed, color,powerTraction);
        this.numberWheels = numberWheels;
        this.fuel = fuel;
    }

    public String toString() {
        return "Vehicle " +
                "\nІм'я експресу: " + vehicleName + "\nМаксимальна швидкість: " + maxSpeed;
    }
    public void show() {
        super.show();
        System.out.println("Кількість коліс: " + numberWheels);
        System.out.println("Вид палива який він використовує: " + fuel);
    }

}

