
/**
 * @author HossaiM
 * <br>
 * Source: http://www.tutorialspoint.com/java/java_string_concat.htm
 */

abstract class AbstractCustomer {
	   protected String name;
	   public abstract boolean isNil();
	   public abstract String getName();
	}


class CustomerFactory {
	public static final String[] names = {"Mahdi", "Munim", "Mithila", "Myesha", "Mitul", "Myeda", "Mugdho"};

	   public static AbstractCustomer getCustomer(String name){

	      for (int i = 0; i < names.length; i++) {
	         if (names[i].equalsIgnoreCase(name)){
	            return new RealCustomer(name);
	         }
	      }
	      return new NullCustomer();
	   }
}

class NullCustomer extends AbstractCustomer {

	   @Override
	   public String getName() {
	      return "Not Available in Customer Database";
	   }

	   @Override
	   public boolean isNil() {
	      return true;
	   }
	}
class RealCustomer extends AbstractCustomer {

	   public RealCustomer(String name) {
	      this.name = name;
	   }

	   @Override
	   public String getName() {
	      return name;
	   }

	   @Override
	   public boolean isNil() {
	      return false;
	   }
	}


/**
 * @author HossaiM
 *
 */
public class NullObjectPatternEx1Main {


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AbstractCustomer customer1 = CustomerFactory.getCustomer("Mahdi");
		AbstractCustomer customer2 = CustomerFactory.getCustomer("Munim");
		AbstractCustomer customer3 = CustomerFactory.getCustomer("Mithila");
		AbstractCustomer customer4 = CustomerFactory.getCustomer("Myesha");
		AbstractCustomer customer5 = CustomerFactory.getCustomer("Myeda");
		AbstractCustomer customer6 = CustomerFactory.getCustomer("Mitul");
		AbstractCustomer customer7 = CustomerFactory.getCustomer("Mugdho");

		AbstractCustomer customer8 = CustomerFactory.getCustomer("Maria");

		System.out.println("Valid Customers");
		System.out.println(customer1.getName());
		System.out.println(customer2.getName());
		System.out.println(customer3.getName());
		System.out.println(customer4.getName());
		System.out.println(customer5.getName());
		System.out.println(customer6.getName());
		System.out.println(customer7.getName());
		System.out.println(customer8.getName());


	}
}
