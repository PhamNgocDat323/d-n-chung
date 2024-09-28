package java_27_9;
import java.util.Scanner;

public class BankAccount {
    public  int Balance;
    public BankAccount(int Balance){
        this.Balance = Balance;
    }
    Scanner sc = new Scanner(System.in);
    public void Deposit(){
        System.out.println("Enter deposit amount: ");
        int depositAmount = sc.nextInt();
        if(depositAmount > 0){
            Balance += depositAmount;
            System.out.println("Deposit successful. New balance: " + Balance);
        }else{
            System.out.println("Invalid deposit amount.");
        }

    }
    public void Withdraw(){
        System.out.println("Enter withdraw amount: ");
        int withdrawAmount = sc.nextInt();
        if(withdrawAmount <= Balance){
            Balance -= withdrawAmount;
            System.out.println("Withdraw successful. New balance: " + Balance);
        }else{
            System.out.println("Insufficient balance.");
        }

    }

//    public static void main(String[] args) {
//        BankAccount account = new BankAccount(10000);
//        System.out.println("Enter your Choice:");
//        System.out.println("1.Deposit or 2.Withdraw");
//        Scanner sc = new Scanner(System.in);
//        int choice = sc.nextInt();
//        if(choice == 1){
//            account.Deposit();
//        }
//        if(choice == 2){
//            account.Withdraw();
//        }
//        if(choice != 1 && choice != 2){
//            System.out.println("Invalid choice.");
//        }
//
//
//    }


}
