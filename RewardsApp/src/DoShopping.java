import java.util.Random;

public class DoShopping {
	private int amount =0;
	private User user=null;
	Random random = new Random();
	int points=0;
	public DoShopping()
	{
		//System.out.println("creating random user, random transaction and random points...");
		
	}
	synchronized public User createUser() {
		
		int id = random.nextInt(100)+1;
		amount= purchase();
		if (amount>2000)
			points=200;
		else if (amount>1500)
			points=150;
		else if (amount>1000)
			points=100;
		else if (amount>500)
			points=50;
		
			
		user = new User(id,"user"+id,"password"+id,points);
		 System.out.println(user.getName()+" you bought "+amount+" rs. of items..");
		return user;
	}
	private int purchase(){
		
		int randomNumber = random.nextInt(1001)+1000; // Generates a random integer
//		 System.out.println(user.getName()+" bought "+randomNumber+" rs. of items..");
		amount += randomNumber;
		 return amount;
				 
	

		
	}

}
