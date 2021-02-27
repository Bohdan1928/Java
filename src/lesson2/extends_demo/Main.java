package lesson2.extends_demo;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(1, "mazda");
        Offroad offroad = new Offroad(2, "subaru", 256);
        SuperCar superCar = new SuperCar(3, "urus", 480,true);
        Suv suv = new Suv(4, "ram4000", 240, 50, 50);
        offroad.drive();
        System.out.println(offroad);

        Car[] cars = new Car[4];
        cars[0] = car;
        cars[1] = offroad;
        cars[2] = superCar;
        cars[3] = suv;


        Offroad[] offroads = new Offroad[2];
        offroads[0] = superCar;
        offroads[1] = suv;

        checkCar(superCar);
    }
    public static void checkCar(Car car){
        car.drive();
    }
}
