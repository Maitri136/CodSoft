import java.util.Scanner;

public class ATM
{
    static int balance = 10000;
     public static void main(String[] args)
   {
    
    Scanner scanner = new Scanner(System.in);

     while(true)
     {
        System.out.println("\n-- ATM --");
        System.out.println("1. Check Balance");
        System.out.println("2.Withdraw");
        System.out.println("3. Deposit");
        System.out.println("4. Exit");
        System.out.println("Enter your choice");

        int choice = scanner.nextInt();
        switch(choice)
        {
            case 1:
            System.out.println("Your current balance is: ₹" + balance);
            break;

            case 2:
            System.out.println("Enter amount to withdraw: ₹");
            int withdrawAmount = scanner.nextInt();
            if(withdrawAmount > balance)
            {
                System.out.println("Insufficient balance.");
            }
            else if (withdrawAmount <= 0)
            {
                System.out.println("Enter a valid Amount");
            }
            else
            {
                balance = withdrawAmount;
                System.out.println("Please collect your cash.");
                System.out.println("Remaining balance: " + balance);
            }
            break;
            case 3:
               System.out.println("Enter amount to deposit: ₹");
               int depositAmount = scanner.nextInt();
               if (depositAmount <= 0)
               {
                System.out.println("Enter a valid Amount.");
               }
               else
               {
                System.out.println("Your money has been successfully deposited.");
               System.out.println("New balance: ₹" + balance);
               }
               
               break;
               case 4:
               System.out.println("Thank you for using ATM");
               scanner.close();
               System.exit(0);
               default:
               System.out.println("Invalid choice. Please try again");
           
           

           
        }

     }
   }
    
}