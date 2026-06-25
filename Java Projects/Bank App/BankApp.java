import java.util.Scanner;
class BankAccount{

     int balance = 0;

  // for deposit money
    void deposit(int ammount){
        if(ammount <= 0){
            throw new IllegalArgumentException("Ammount must be positive");
        }
        balance = balance + ammount ;
        System.out.println("Deposited : " +ammount);
    }
    // for money withdraw
    void withdraw(int ammount){
        if(ammount > balance){
            throw new IllegalArgumentException("Insufficient balance");
        }
        if(ammount <= 0){
            throw new IllegalArgumentException("Invalid ammount");
        }
        balance = balance - ammount;
        System.out.println("Current Balance : " + balance);
    }
    // for check balance in account 
    void checkBalance(){
        System.out.println("Your Current Balance : "+balance);
    }
}


class BankApp{
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        BankAccount acc = new BankAccount();
        
        while (true) {
            try {
                System.out.println("\n1.Deposite\n2.Withdraw\n3.Check Balance\n4.Exit");
                
                System.out.print("Choose option : ");
                int choice = sc.nextInt();

                if(choice == 1){
                    System.out.print("Enter Ammount : ");
                    int amt = sc.nextInt();
                    acc.deposit(amt);
                }

                else if(choice == 2){
                    System.out.print("Enter Ammount : ");
                    int amt = sc.nextInt();
                    acc.withdraw(amt);
                }

                else if(choice == 3){
                    acc.checkBalance();
                }

                else if(choice == 4){
                    System.out.println("Thank you for using my Bank");
                    break;
                }

                else {
                    throw new IllegalArgumentException("Invalid choice!");
                }
           
            } catch (IllegalArgumentException e) {
                System.out.println("Error : "+ e.getMessage());
            } 
              finally {
                System.out.println("Transaction Finished");
           }
        }
    }
 }
