import java.util.ArrayList;
import java.util.List;

public class LaunchMain {

	public static void main(String[] args) throws InterruptedException {

Transaction transaction1= new Transaction();
Transaction transaction2= new Transaction();
Transaction transaction3= new Transaction();
Transaction transaction4= new Transaction();
Transaction transaction5= new Transaction();

transaction1.start();
transaction2.start();
transaction3.start();
transaction4.start();
transaction5.start();
Thread.sleep(2000);
List<User> users = new ArrayList<>();
users.add(transaction1.getUser());
users.add(transaction2.getUser());
users.add(transaction3.getUser());
users.add(transaction4.getUser());
users.add(transaction5.getUser());





users.forEach(user->System.out.println(user));
users.forEach(user->new Redeem().redeem(user));

System.out.println("Thank you!!");




}

	}


