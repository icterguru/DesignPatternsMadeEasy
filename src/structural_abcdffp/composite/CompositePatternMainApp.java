/**
 *
 */
package structural_abcdffp.composite;

/**
 * @author HossaiM
 *
 */
public class CompositePatternMainApp {

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
