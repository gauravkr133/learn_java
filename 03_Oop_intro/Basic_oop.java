public class Basic_oop{
    int acc_no;
    String name;
    float balance;

    void setData(int a,String n,float b){
        this.acc_no = a;
        this.name = n;
        this.balance = b;
    }

    void showDetails(){
        System.out.println("Your account details");
        System.out.println("Name: "+this.name);
        System.out.println("Account Number: "+this.acc_no);
        System.out.println("Balance: "+this.balance);
    }

    void deposit(float amt){
        this.balance+=amt;
        System.out.println("Your updated balance is: "+this.balance);
    }

    void withdrawal(float amt){
        if(amt>this.balance){
            System.out.println("Insufficient Balance");
            return;
        }

        this.balance-=amt;
        System.out.println("Your updated balance is: "+this.balance);
    }

    void checkBalance(){
        System.out.println("Your Balance is: "+this.balance);
    }

    public static void main(String[] args){
        Basic_oop acc = new Basic_oop();
        acc.setData(10001,"Gaurav",1000.50f);
        acc.showDetails();
        System.out.println();
        acc.checkBalance();
        System.out.println();
        acc.deposit(500);
        acc.checkBalance();
        acc.withdrawal(0.5f);
        acc.withdrawal(15000);
        acc.checkBalance();
    }


}