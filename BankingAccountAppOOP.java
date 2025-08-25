import java.util.*;
class BankAccount{
	double accNum;
	int balance;
	BankAccount(double accNum, int balance){
		this.accNum=accNum;
		this.balance=balance;
	}
	double getAccNum(){return accNum;}
	int getBalance(){return balance;}
	
	
}
class SavingAccount extends BankAccount{
	SavingAccount(double accNum, int balance){
		super(accNum,balance);
	}
	int interest;
	void setInterest(int i){
		this.interest=i;
	}
	void displayDetails(){
		System.out.println("Account Number --> "+accNum);
		System.out.println("Balance is --> "+balance);
		System.out.println("Interest is --> "+interest);
	}
}
class CurrentAccount extends BankAccount{
	CurrentAccount(double accNum, int balance){
		super(accNum, balance);
	}
	int overDraftLimit;
	void setOverDraft(int o){
		this.overDraftLimit=o;
	}
	void displayDetails(){
		System.out.println("Account Number --> "+accNum);
		System.out.println("Balance is --> "+balance);
		System.out.println("Overdraft is --> "+overDraftLimit);
		
	}
}
public class BankingAccountAppOOP{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter saving account number");
		double acc1=sc.nextDouble();
		System.out.println("Enter saving balance");
		int bal1=sc.nextInt();
		
		
		SavingAccount sa=new SavingAccount(acc1,bal1);
		System.out.println("Enter Interest");
		int inter=sc.nextInt();
		sa.setInterest(inter);
		sa.displayDetails();
		
		System.out.println("Enter current account number");
		double acc2=sc.nextDouble();
		System.out.println("Enter current balance");
		int bal2=sc.nextInt();
		CurrentAccount ca=new CurrentAccount(acc2,bal2);
		System.out.println("Enter OverDraft Limit");
		int odraft=sc.nextInt();
		ca.setOverDraft(odraft);
		ca.displayDetails();
		
	}
}