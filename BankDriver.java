package Encapsulation;

public class BankDriver {
	
	public static void main(String[] args) {
		
		Bank b1=new Bank(1,"Maharashtra_Bank", "Katraj");
		b1.display();
		System.out.println(b1);
//		System.out.println(b1.bId); CTE as the attributes are private we can not access it.
		
		System.out.println(b1.getId());
	}

}
