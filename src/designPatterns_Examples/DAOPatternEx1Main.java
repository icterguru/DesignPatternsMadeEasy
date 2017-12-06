import java.util.ArrayList;
import java.util.List;

/**
 *
 */

/**
 * @author HossaiM
 *
 */

class DAOStudent {
   private String name;
   private int rollNo;

   DAOStudent(String name, int rollNo){
      this.name = name;
      this.rollNo = rollNo;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public int getRollNo() {
      return rollNo;
   }

   public void setRollNo(int rollNo) {
      this.rollNo = rollNo;
   }
}

interface StudentDao {
	   public List<DAOStudent> getAllStudents();
	   public DAOStudent getStudent(int rollNo);
	   public void updateStudent(DAOStudent student);
	   public void deleteStudent(DAOStudent student);
	}

class StudentDaoImpl implements StudentDao {

	   //list is working as a database
	   List<DAOStudent> students;

	   public StudentDaoImpl(){
	      students = new ArrayList<DAOStudent>();
	      DAOStudent student1 = new DAOStudent("Robert",0);
	      DAOStudent student2 = new DAOStudent("John",1);
	      students.add(student1);
	      students.add(student2);
	   }
	   @Override
	   public void deleteStudent(DAOStudent student) {
	      students.remove(student.getRollNo());
	      System.out.println("Student: Roll No " + student.getRollNo() + ", deleted from database");
	   }

	   //retrive list of students from the database
	   @Override
	   public List<DAOStudent> getAllStudents() {
	      return students;
	   }

	   @Override
	   public DAOStudent getStudent(int rollNo) {
	      return students.get(rollNo);
	   }

	   @Override
	   public void updateStudent(DAOStudent student) {
	      students.get(student.getRollNo()).setName(student.getName());
	      System.out.println("Student: Roll No " + student.getRollNo() + ", updated in the database");
	   }
	}

public class DAOPatternEx1Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StudentDao studentDao = new StudentDaoImpl();

	      //print all students
	      for (DAOStudent student : studentDao.getAllStudents()) {
	         System.out.println("Student: [RollNo : " + student.getRollNo() + ", Name : " + student.getName() + " ]");
	      }


	      //update student
	      DAOStudent student =studentDao.getAllStudents().get(0);
	      student.setName("Michael");
	      studentDao.updateStudent(student);

	      //get the student
	      studentDao.getStudent(0);
	      System.out.println("Student: [RollNo : " + student.getRollNo() + ", Name : " + student.getName() + " ]");
	}

}
