
package Bank_Account;

public class Main {
    public static void main(String [] args){
        BankAccount info= new BankAccount();
        info.setName("Janine Grace P. Suello"); 
        info.setAge(21);
        info.setAccNum(9856321);
        info.setDeposit(56235.63, 5236.42);
        info.setBalance(24536);
        
        
        System.out.println("Name: " + info.getName());
        System.out.println("Age: " + info.getAge());
        System.out.println("Account Number: " + info.getAccNum());
        System.out.println("Deposit: " + info.getDeposit());
        System.out.println("Balance: " + info.getBalance());
    }
}

