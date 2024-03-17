
import com.shiftvision.ShiftVisionException;
import com.shiftvision.trainings.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int x = 10;
        int y = 0;

        try {
            int z = x / y;
            System.out.println("Z: " + z);



        }
        catch (ArithmeticException exp){
            System.out.println("We have an ArithmeticException");
            //System.out.println(exp);
            throw new ShiftVisionException("We have a new ArithmeticException for out math.");
        }
        catch (RuntimeException exp){
            System.out.println("We have an RuntimeException");
            System.out.println(exp);
        }
        catch (Exception exp){
            System.out.println("We have an exception");
            System.out.println(exp);
        }
        finally {
            System.out.println("This is finally block");
        }





        //com.shiftvision.trainings.JavaVariableTraining.variableTraining();
       // JavaVariableTraining.variableTraining();
       // JavaArrayTraining.arrayTraining();
        //JavaOperationTraining.operation();
        //JavaIfElseTraining.ifElseTraining();
        //JavaForLoopTraining.javaForLoop();
        //JavaWhileLoopTraining.whileLoopTraining();
        //JavaDoWhileLoopTraining.doWhileLoop();

        //JavaSwitchTraining.switchTraining();

        /*Scanner input = new Scanner(System.in);

        System.out.println("Enter your name?");
        String name = input.next();

        System.out.println("Enter your birth month:");
        int month = input.nextInt();

        System.out.println("Enter your birth day:");
        int day = input.nextInt();







        input.close();*/
    }
}