
public class Main {








// Create a Bank class which can store BankAccounts.
// It should have a createAccount method with a BankAccount as an input parameter.
// It should have a getAllMoney method, which returns the sum of
// the accounts' money (sum of Currency values regardless of the Currency type).

// For example:

  public static void main(String[] args) {
    Currency janeCash = new UsaDollar(1500);

    BankAccount janeAcc = new BankAccount("Jane", "1234", janeCash);
    janeAcc.deposit(500);

    int janeWithdraw = janeAcc.withdraw("1111", 500);
    System.out.println("janeWithdraw = " + janeWithdraw);
    // janeWithdraw = 0

    janeWithdraw = janeAcc.withdraw("1234", 500);
    System.out.println("janeWithdraw = " + janeWithdraw);
    // janeWithdraw = 500

    janeWithdraw = janeAcc.withdraw("1234", 2000);
    System.out.println("janeWithdraw = " + janeWithdraw);
    // janeWithdraw = 0

    Currency johnnyCash = new HungarianForint(500);

    Bank myBank = new Bank();
    myBank.createAccount(janeAcc);

    myBank.createAccount(new BankAccount("Johnny", "1993", johnnyCash));

    //BankAccount accountTest = new BankAccount("name","1234",janeCash);
    //accountTest.deposit((1500));

    int allMoney = myBank.getAllMoney();
    System.out.println("allMoney = " + allMoney);
    // allMoney = 2000 */



  }
}

