/**
 *
 */

/**
 * @author HossaiM
 * <br>
 * http://www.tutorialspoint.com/design_pattern/front_controller_pattern.htm
 *
 */

class HomeView {
   public void show(){
      System.out.println("Displaying Home Page");
   }
}

class StudentViewFC {
   public void show(){
      System.out.println("Displaying Student Page");
   }
}

class Dispatcher {
   private StudentViewFC studentView;
   private HomeView homeView;

   public Dispatcher(){
      studentView = new StudentViewFC();
      homeView = new HomeView();
   }

   public void dispatch(String request){
      if(request.equalsIgnoreCase("STUDENT")){
         studentView.show();
      }
      else{
         homeView.show();
      }
   }
}


class FrontController {

   private Dispatcher dispatcher;

   public FrontController(){
      dispatcher = new Dispatcher();
   }

   private boolean isAuthenticUser(){
      System.out.println("User is authenticated successfully.");
      return true;
   }

   private void trackRequest(String request){
      System.out.println("Page requested: " + request);
   }

   public void dispatchRequest(String request){
      //log each request
      trackRequest(request);

      //authenticate the user
      if(isAuthenticUser()){
         dispatcher.dispatch(request);
      }
   }
}

public class FrontControllerPatternEx1Main {

	public static void main(String[] args) {
		 FrontController frontController = new FrontController();
	      frontController.dispatchRequest("HOME");
	      frontController.dispatchRequest("STUDENT");
	}

}
