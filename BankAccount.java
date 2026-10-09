class bank{
    String accountholder;
    double amount;
    double balance;
    void calculate(bank receiver,double amount){
        if(balance>=amount){
            balance=balance-amount;
            receiver.balance=receiver.balance+amount;
        }
    }
}
    public class BankAccount {
        public static void main(String[] args) {
            bank a1=new bank();
            bank a2=new bank();
            a1.accountholder="Vedika";
            a1.balance=20000;
            a2.balance=15000;
            a1.calculate(a2,5000);
            System.out.println("Account holder name:"+a1.accountholder);            
            System.out.println("Remaining balance:"+a1.balance);

        }
    
}
