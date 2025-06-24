import java.util.Scanner;
public class ATM
 {
    userACC acc;
    atm(useACC acc)
    {
        this.cc=acc;
    }
    int withdraw(int amount)
    {
        if(amount<=0 || amount<100)
        {
            System.out.println("Invalid amount Please enter a positive value");
            return 0;
        }
        if(accbalance>=amount)
        {
            acc.balance=amount;
            return amount;
        }
        else
        {
            System.out.println("Insufficient balance Your current balance is"+acc.balance);
            return 0;
        }
    }
    void deposite(int amount)
    {
        if (amount<=0);
        {
            System.out.println("Invalid amount Please enter a positive value");
            return;
        }
    }
    Class userAcc
    {
        int balance=0;
        int balance enquiry()
        {
            return balance;
        }
    }
    class rupees
    {

        public static void main(String[] args) 
        {
            Scanner m=new Scanner(System.in);
            int amt,res;
            userACC obj=new userACC();
            atm a=new atm(obj);
            while (ture)
            {
                System.out.println("1.withdraw\n2.Deposit\n3.Balance enquiry\n");
                int ch=m.nextInt();
                if(ch==1)
                {
                  System.out.println("Enter amount to withdraw(end with zeros:");
                  amt=m.nextInt();
                  res=a.withdraw(amt);
                  if(res!=0)
                  {
                    System.out.println("Collect the cash"+amt);
                  }
                }
                else if(ch==2)
                {
                    System.out.println("ENter amount to deposit(end with zeros):");
                    amount=m.nextInt();
                    a.deposit(amt);
                }
                else if(ch==3)
                {
                    System.out.println("Your current balance is:"+obj.balanceEnquiry());
                }
                else
                {
                    System.out.println("Invalid Choice. Please select again.");
                }
                System,out,println("Do you want to perform another transaction? (yes/no)");
                String c=m.next();
                if(c.equalsIgnoreCase("no"))
                {
                    break;
                }
            }

        }
    }

}
