import com.shiftvision.oop.Car;

public class MyCarUser {
    public static void main(String[] args) {

        Car myCar = new Car();
        myCar.setBrand("BMW");
        myCar.setColor("Black");
        myCar.setNumberOfWheel(4);
        myCar.setSpeed(30);

        //System.out.println("My car brand is:" + myCar.getBrand());

        //myCar.print();
        System.out.println(myCar.drive());

    }
}
