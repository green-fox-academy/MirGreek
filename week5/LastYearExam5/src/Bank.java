import java.util.ArrayList;

public class Bank {
 ArrayList<BankAccount> bankAccounts = new ArrayList<>();

  public void createAccount(BankAccount account){
    bankAccounts.add(account);
  }

  public Integer getAllMoney(){
      Integer sum=0;
                                                                   //System.out.println(janeAcc.currency.value);
    for (int i = 0; i < bankAccounts.size() ; i++) {
      sum += bankAccounts.get(i).currency.value;
    }
    return sum;


    }

}
// Create a Bank class which can store BankAccounts.
// It should have a createAccount method with a BankAccount as an input parameter.
// It should have a getAllMoney method, which returns the sum of
// the accounts' money (sum of Currency values regardless of the Currency type).