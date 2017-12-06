import java.util.Date;

/**
 *
 */

/**
 * @author HossaiM
 * <br>
 * http://www.tutorialspoint.com/design_pattern/mediator_pattern.htm
 *
 */

class ChatRoom {
   public static void showMessage(User user, String message){
      System.out.println(new Date().toString() + " [" + user.getName() + "] : " + message);
   }
}

class User {
   private String name;

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public User(String name){
      this.name  = name;
   }

   public void sendMessage(String message){
      ChatRoom.showMessage(this,message);
   }
}

public class MediatorPatternEx1Main {
	public static void main(String[] args) {
		User robert = new User("Mokter ");
		User john = new User(" Hossain");

		robert.sendMessage("Hi! Dr. Mokter!");
		john.sendMessage("Hello! Dr. Hossain!!");
	}
}
