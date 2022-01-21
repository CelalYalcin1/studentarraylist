package studentarraylist;
import java.util.List;
import java.util.ArrayList;

public class StudentManager {
	private int studentsSize;
	ArrayList<Student> students = new ArrayList<Student>();
	
	public StudentManager() {
		
	}
	
	public void add(Student student) {
		
			if(students.contains(student) == true){
				System.out.println(student.getFirstName()+" isimli ��renci kay�tl�d�r.");
				return;				
			}
			else {
				System.out.println(student.getId()+" "+student.getFirstName()+" "+
						student.getSecondName()+" "+student.getIdendityNumber()+" isimli ��renci kay�t edildi.");
			}
			
		this.students.add(student);
		
	}
	public void delete(int id) {
		
		Student StudentToDelete = new Student();;
		for (Student student : students) {
			if(student.getId()==id) {
				StudentToDelete=student;
				students.remove(StudentToDelete);
				System.out.println(StudentToDelete.getFirstName()+" isimli ��renci silindi");
				return;
			}
		}
	
		//this.students.delete(student);
		
		
	}
	public void update(Student updatedStudent) {
		int index=0;// i
		for (Student student : students) {
			//�d ile ��renci de�i�tirme
			if(student.getId()==updatedStudent.getId()) {
				student=updatedStudent;
				students.set(index,updatedStudent);
				System.out.println(student.getId()+" ID'li ��renci g�ncellendi");
				return;
			}
			index++;
		}
		//students.set(id, student);
		
}
	
	public ArrayList<Student> getAll(){
		return this.students;
	}
}
