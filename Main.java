package studentarraylist;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StudentManager studentManager = new StudentManager();
		Student student1 = new Student(1,"Orhan","�nan�",101);
		Student student2 = new Student(2,"Celal","Yal��n",102);
		Student student3 = new Student(3,"O�uzhan","Y�lmaz",103);
		
		studentManager.add(student1);
		studentManager.add(student2);
		studentManager.add(student3);
		
		studentManager.delete(2);
		System.out.println(studentManager.students.get(1).getFirstName());
		
		Student student4 = new Student(1,"Ali","koral",104);
		studentManager.update(student4);
		System.out.println(studentManager.students.get(0).getFirstName());
	
		for (Student student : studentManager.students) {
			
				System.out.println(student.getId()+" "+student.getFirstName()+" "+ student.getSecondName()+ " " + student.getIdendityNumber() );
				
			}
		
	}

}
