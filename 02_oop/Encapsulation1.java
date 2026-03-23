class BanckAcc{
    private String owner;
    private double balance;

    BanckAcc(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public void getBalance() {
      System.out.println("The balance is : " + balance);
    }

    public void getOwner() {
      System.out.println("The user is : " + owner);
    }

    public void work(){
        getOwner();
        getBalance();

    }
    public void deposit(double amount){
        if(amount>0){
            balance+=amount ;
            System.out.println("deposit complete of : " +amount);

        }else{
            throw new Error("Invalid amount ");
        }
    }
    public void withDraw(double amount){
        if(amount<balance){
            balance-=amount ;
            System.out.println("withdraw complete of : " +amount);
        }else{
            throw new Error("Insufficient balance");
        }
    }
    
}

public class Encapsulation1 {
    public static void main(String[] args) {
        BanckAcc b = new BanckAcc("Oliver", 1000);

        b.work();
        
        b.deposit(100);
        b.work();

        b.withDraw(200);
        b.work();

    }
}

/*
The user is : Oliver
The balance is : 1000.0
deposit complete of : 100.0
The user is : Oliver
The balance is : 1100.0
withdraw complete of : 200.0
The user is : Oliver
The balance is : 900.0
*/