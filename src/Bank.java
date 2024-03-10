import com.shiftvision.oop.Account;
import com.shiftvision.oop.CheckingAccount;
import com.shiftvision.oop.SavingAccount;

public class Bank {

    public static void main(String[] args) {

        CheckingAccount checkingAccount1 = new CheckingAccount("123456789","Iftekhar Ivaan");

        //checkingAccount1.setAccountNumber("123456789");
        //checkingAccount1.setAccountName("Iftekhar Ivaan");
        checkingAccount1.deposit(200);
        checkingAccount1.withdraw(50);
        checkingAccount1.deposit(34);
        checkingAccount1.deposit(56);
        checkingAccount1.deposit(500);
        checkingAccount1.withdraw(30.50);
        //checkingAccount1.withdraw(-100);


        double balance = checkingAccount1.getBalance();

        System.out.println("My balance: " + balance);
        System.out.println(checkingAccount1.toString());

        SavingAccount savingAccount1 = new SavingAccount("987654321","Shehla Iftekhar");
        //savingAccount1.setAccountNumber("987654321");
        //savingAccount1.setAccountName("Shehla Iftekhar");
        savingAccount1.deposit(800);
        savingAccount1.withdraw(100);
        double balanceSaving = savingAccount1.getBalance();

        System.out.println("My saving balance: " + balanceSaving);
        System.out.println(savingAccount1.toString());

    }
}
