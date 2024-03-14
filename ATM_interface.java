import java.util.Scanner;
class B_account{
    private double bal;
    public B_account(double i_bal){
        this.bal=i_bal;
    }
    public double getBal(){
        return bal;
    }
    public void deposit(double amt){
        if(amt>0){
            bal+=amt;
            System.out.println("Deposit of Rs. "+amt+" successful."+"\nCurrent balance: Rs. "+bal);
        }
        else{
            System.out.println("Invalid Deposit Amount!");
        }
    }
    public void withdrawl(double amt){
        if(amt>0 && amt<=bal){
            bal-=amt;
            System.out.println("Withdrawl of Rs. "+amt+" successful."+"\nCurrent balance: Rs. "+bal);
        }
        else{
            System.out.println("Invalid Withdrawl Amount or Insufficient Balance!");
        } 
    }
}
class ATM{
    private B_account b_account;
    public ATM(B_account b_account) {
        this.b_account=b_account;
    }
    public void displayMenu(){
        System.out.print("\nATM MENU:"+"\n1. CHECK BALANCE"+"\n2. DEPOSIT"+"\n3. WITHDRAW"+"\n4. EXIT");
    }
    public void transaction(int ch, Scanner sc){
        switch (ch) {
            case 1:
                System.out.print("Current Balance: Rs."+b_account.getBal());
                break;
            case 2:
                System.out.print("Enter Deposit Ammount:------Rs.");
                double d_amt=sc.nextDouble();
                b_account.deposit(d_amt);
                break;
            case 3:
                System.out.print("Enter Withdrawl Ammount:------Rs.");
                double w_amt=sc.nextDouble();
                b_account.withdrawl(w_amt);
                break; 
            case 4:
                System.out.println("Exiting ATM"+"\n-----THANK YOU-----");
                sc.close();
                System.exit(0);
                break;          
            default:
               System.out.println("Invalid Choice. Please Select a Valid Option.");
        }
    }
}
public class ATM_interface {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter initial account balance: Rs. ");
        double i_bal=sc.nextDouble();
        B_account b_account=new B_account(i_bal);
        ATM atm=new ATM(b_account);
        while(true){
            atm.displayMenu();
            System.out.print("\nSelect an Option ");
            int ch=sc.nextInt();
            atm.transaction(ch,sc);
        }
    }
    
}
