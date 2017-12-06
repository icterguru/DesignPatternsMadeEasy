
/**
 *
 */

import java.util.ArrayList;
import java.util.List;

/**
 * @author HossaiM
 * <br> Employee class
 */
class Employee {
	  private String name;
	   private String dept;
	   private float salary;
	   private List<Employee> subordinates;

	   /**
	    * <br> Employee <b> constructor </b>
	    */
	   public Employee(String name,String dept, float sal) {
	      this.name = name;
	      this.dept = dept;
	      this.salary = sal;
	      subordinates = new ArrayList<Employee>();
	   }

	   public void add(Employee e) {
	      subordinates.add(e);
	   }

	   public void remove(Employee e) {
	      subordinates.remove(e);
	   }

	   public List<Employee> getSubordinates(){
	     return subordinates;
	   }

	   @Override
	   public String toString(){
	      return ("Employee :[Name : " + name + ", dept : " + dept + ", salary :" + salary+"]");
	   }
}

/**
 * @author HossaiM
 *
 */
public class CompositePatternEx1Main {

	public static void main(String[] args) {
		Employee CEO = new Employee("John","CEO", 10000);

		Employee managerExecutive = new Employee("Richard","Manager Executive", 6000);
		Employee managerProduction = new Employee("Rob","Manager Production", 6000);
		Employee managerMarketing = new Employee("Michael","Manager Marketing", 6000);

		Employee eAssistant = new Employee("Ronald","Assistant: Executive", 4000);
		Employee pAssistant = new Employee("Rita","Assistant: Production", 4000);
		Employee mAssistant = new Employee("Rumel","Assistant: Marketing", 4000);

		CEO.add(managerExecutive);
		CEO.add(managerProduction);
		CEO.add(managerMarketing);

		managerExecutive.add(eAssistant);
		managerProduction.add(pAssistant);
		managerMarketing.add(mAssistant);

		//Prints the CEO
		System.out.println(CEO);

		// Prints the remaining employees
		for (Employee managers : CEO.getSubordinates()) {
			System.out.println(managers);  // Prints the managers

			for (Employee assistants : managers.getSubordinates()) {
				System.out.println(assistants); // Prints the assistants
			}
		}
	}

}
