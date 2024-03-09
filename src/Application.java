import com.shiftvision.oop.Calculator;

public class Application {

    public static void main(String[] args) {

        //testMe();
        int myAddNumber;
        Application myClass = new Application();
        myAddNumber = myClass.addNumber(10, 30);
        System.out.println("MyAddNumber:" + myAddNumber);

        float x = Application.addNumber(1.2f, 3.5f);
        //float x = addNumber(1.2f, 3.5f);
        System.out.println("My float add:" + x);

        //Calculator xxx = new Calculator();
        //int sum = xxx.add(4,5);
    }


    public static void testMe(){
        System.out.println("Test me");
        int x = 1;
        int y = 2;
        int z = x + y;
        System.out.println("Z:" + z );
    }

    public static int addNumber(){
        System.out.println("Add Number");
        int x = 1;
        int y = 2;
        int z = x + y;
        return z;
    }
//    public static int addNumber(){
//        System.out.println("Add Number");
//        int x = 3;
//        int y = 3;
//        int z = x + y;
//        return z;
//    }

    public static float addNumber(float firstNumber, float secondNumber){
        System.out.println("Add Number");
        float z = firstNumber + secondNumber;
        return z;
    }

    public int addNumber(int firstNumber, int secondNumber){
        System.out.println("Add Number");
        int z = firstNumber + secondNumber;
        return z;
    }

    public int addNumber(int firstNumber, float secondNumber){

        return 0;
    }
    public int addNumber(float firstNumber, int secondNumber){

        return 0;
    }
}

