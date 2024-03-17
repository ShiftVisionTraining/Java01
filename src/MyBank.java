import com.shiftvision.oop.*;

public class MyBank {

    public static Account openAccount(String type, String accountNumber, String accountName){
        Account account = null;

        if(type.contentEquals("Checking")){
            account = new CheckingAccount(accountNumber,accountName);
        } else if(type.contentEquals("Saving")){
            account = new SavingAccount(accountNumber,accountName);
        } else if(type.contentEquals("Saving+")){
            account = new SavingPlusAccount(accountNumber,accountName);
        } else if(type.contentEquals("Saving++")){
            account = new SavingPlusPlusAccount(accountNumber,accountName);
        }

        return account;
    }

    public static void main(String[] args) {

        try {
            //ATM cardAccount = new SavingAccount("123456789","Iftekhar Ivaan");

            ATM cardAccount = openAccount("Saving++", "12345678", "Iftekhar Ivaan");
            if (cardAccount instanceof Bank) {
                ((Bank) cardAccount).deposit(-2000);
                //System.out.println("You can try deposit positive amount");
            }
            cardAccount.withdraw(200);
            System.out.println("Balance: " + ((Bank) cardAccount).getBalance());
            ((SavingPlusPlusAccount) cardAccount).print();
        }
        catch (Exception exp){
            System.out.println(exp.toString());
            System.out.println("You can try deposit positive amount");
        }


//        CheckingAccount checkingAccount1 = new CheckingAccount("123456789","Iftekhar Ivaan");
//
//        //checkingAccount1.setAccountNumber("123456789");
//        //checkingAccount1.setAccountName("Iftekhar Ivaan");
//        checkingAccount1.deposit(200);
//        checkingAccount1.withdraw(50);
//        checkingAccount1.deposit(34);
//        checkingAccount1.deposit(56);
//        checkingAccount1.deposit(500);
//        checkingAccount1.withdraw(30.50);
//        //checkingAccount1.withdraw(-100);
//
//
//        double balance = checkingAccount1.getBalance();
//
//        System.out.println("My balance: " + balance);
//        System.out.println(checkingAccount1.toString());
//
//        SavingAccount savingAccount1 = new SavingAccount("987654321","Shehla Iftekhar");
//        //savingAccount1.setAccountNumber("987654321");
//        //savingAccount1.setAccountName("Shehla Iftekhar");
//        savingAccount1.deposit(800);
//        savingAccount1.withdraw(100);
//        double balanceSaving = savingAccount1.getBalance();
//
//        System.out.println("My saving balance: " + balanceSaving);
//        System.out.println(savingAccount1.toString());
//
//        SavingPlusAccount savingPlusAccount1 = new SavingPlusAccount("682382377237823", "Simrohn Iftekhar");
//        savingPlusAccount1.deposit(20000);
//        savingPlusAccount1.withdraw(3000);
//        System.out.println("My saving plus balance: " + savingPlusAccount1.getBalance());
//
//        SavingPlusPlusAccount savingPlusPlusAccount1 = new SavingPlusPlusAccount("9982382377237823", "Ameera Iftekhar");
//        savingPlusPlusAccount1.deposit(20000);
//        savingPlusPlusAccount1.withdraw(100, "I am withdrawing because of food");
//        System.out.println("My saving plus plus balance: " + savingPlusPlusAccount1.getBalance());
    }
}
