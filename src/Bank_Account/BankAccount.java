
package Bank_Account;

class BankAccount {
    private String name;
    private int age;
    private int acc_num;
    private double balance;
    private double deposit;
       
    String getName(){
         return name;
        }     
    public void setName(String name){
            this.name= name;
    }
    int getAge(){
        return age;
    }
    public void setAge(int age){
            this.age= age;
    }
    int getAccNum(){
        return acc_num;
    }
    public void setAccNum(int acc_num){
            this.acc_num= acc_num;    
        }   
    double getBalance(){
        return balance + deposit ;
    }
    public void  setBalance(double balance){
        this.balance= balance;
    }
    double getDeposit(){
        return deposit ;
    }
    public void  setDeposit(double deposit1, double deposit2){
        this.deposit= deposit1 + deposit2;
    }
}
