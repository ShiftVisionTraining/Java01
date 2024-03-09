import com.shiftvision.oop.Calculator;
//import com.shiftvision.oop.*;

public class MyCalculator {
    public static void main(String[] args) {
        //Integer y;
        //y = 20;
        //Integer x = 10;

        Calculator myCal;
        myCal = new Calculator();
        //Calculator myCal = new Calculator();

        int sum = myCal.add(2,5);
        System.out.println("Sum:" + sum);

        //Calculator myCal2 = new Calculator();

        int mySum = Calculator.sub(10,5);
        System.out.println("mySum: " + mySum);

    }
}
