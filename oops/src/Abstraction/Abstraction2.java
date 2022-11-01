package Abstraction;

public class Abstraction2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GetBank_Details obj = new GetBank_Details();
		obj.setAccNumber(123456789);
		obj.setBankName("SBI");
		obj.setBranchName("chinna Bazar");
		obj.setAmount(5000f);
		obj.getAccNumber();
		obj.getBankName();
		obj.getBranchName();
		obj.getAmount();
		
		
	}

}
abstract class Bank_Account
{
	int accNumber;
    String bankName;
	String branch;
	float amount;
	
	abstract void setAccNumber(int acc);
	abstract void setBankName(String s);
	abstract void setBranchName(String ss);
	abstract void setAmount(float amt);
	abstract void getAccNumber();
	abstract void getBankName();
	abstract void getBranchName();
	abstract void getAmount();
}
abstract class SetBank_Details extends Bank_Account
{
	public void setAccNumber(int acc) {
		super.accNumber = acc;
	}
	public void setBankName(String s) {
		super.bankName = s;
	}
	public void setBranchName(String ss) {
		super.branch = ss;
	}
	public void setAmount(float amt) {
		super.amount = amt;
	}
}
class GetBank_Details extends SetBank_Details
{
	public void getAccNumber() {
		System.out.println(super.accNumber);
	}
	public void getBankName() {
		System.out.println(super.bankName);
	}
	public void getBranchName() {
		System.out.println(super.branch);
	}
	public void getAmount() {
		System.out.println(super.amount);
	}
}