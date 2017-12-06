/**
 *
 */
package structural_abcdffp.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author HossaiM
 * <br> Employee class
 */
public class Employee {
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
