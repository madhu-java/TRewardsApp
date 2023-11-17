import java.util.Scanner;

public class Transaction extends Thread {
	private User user;
	Scanner scanner = new Scanner(System.in);
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public void run() {
		DoShopping doShopping= new DoShopping();
		user=doShopping.createUser();
		System.out.println();
		//System.out.println(user);
		//scanner.next();

	}
//public void redeem() {
//	
//	System.out.println();
//	System.out.println(user.getName() + " you have "+ user.getPoints()+" points");
//	boolean flag= true;
//	String input="N";
//	while(flag) {
//		System.out.println(	" Do you want to redeem your points Y/N");
//		
//	  input = scanner.next();
//	 if(input.equalsIgnoreCase("Y")||input.equalsIgnoreCase("N")) {
//		 flag=false;
//	 }
//	}
//	System.out.println(input);
//	if(input.equalsIgnoreCase("Y")) {
//	boolean redeemFlag=true;
//	while(redeemFlag) {
//	System.out.println("1.reward1 (headphones) - 200 points (2,00,0 rs)\r\n" + 
//			"2.reward2 (travel - 1000 kms) - 100 points \r\n" + 
//			"3.reward3 (tshirt) - 50 points");
//	System.out.println("Enter 1 or 2 or 3 to redeem your choice of reward");
//	
//	int redeem = scanner.nextInt();
//	if(redeem==1) {
//		if(user.getPoints()<200)
//			System.out.println("You have"+user.getPoints()+" points, you can't redeem this ");
//		else {
//			double newPoints =user.getPoints()- 200;
//			 user.setPoints(newPoints);
//			 System.out.println("Congratulations!..You redeemed headphones");
//			 System.out.println("You have "+user.getPoints()+" points left");
//			 
//			 redeemFlag=false;
//		}
//	}else if(redeem==2) {
//		if(user.getPoints()<100)
//			System.out.println("You have"+user.getPoints()+" points, you can't redeem this ");
//		else {
//			double newPoints =user.getPoints()- 100;
//			 user.setPoints(newPoints);
//			 System.out.println("Congratulations!..You redeemed 1000km travel points");
//			 System.out.println("You have "+user.getPoints()+" points left");
//			 redeemFlag=false;
//		}
//	}else if(redeem==3) {
//		if(user.getPoints()<50)
//			System.out.println("You have"+user.getPoints()+" points, you can't redeem this ");
//		else {
//			double newPoints =user.getPoints()- 50;
//			 user.setPoints(newPoints);
//			 System.out.println("Congratulations!..You redeemed a t-shirt");
//			 System.out.println("You have "+user.getPoints()+" points left");
//			 redeemFlag=false;
//		}
//	}
//	}
//	}else {
//		System.out.println("Alright..You can redeem later!!");
//	}
//}
//
}
