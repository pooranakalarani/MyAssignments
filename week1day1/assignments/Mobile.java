package week1day1.assignments;

public class Mobile {

	public void makeCall() {
         
		String mobileModel = "MOTOROLA";
		float mobileWeight = 220.50f;
	
		System.out.println("Mobile Model= "+mobileModel);
		System.out.println("Mobile Weight= "+mobileWeight);
	}
	
	public void sendMsg() {	
	    
		 boolean isfullCharge = true;
		 int mobileCost = 50000;
		 
		 System.out.println("Is full charge= "+isfullCharge);
		 System.out.println("The Mobile cost= "+mobileCost);
	}

public static void main(String[] args) {
	
	Mobile phn = new Mobile();
	phn.makeCall();
	phn.sendMsg();
	System.out.println("This is my phone details");
}




}

	
	
	
