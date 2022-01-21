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
				System.out.println(student.getFirstName()+" isimli öğrenci kayıtlıdır.");
				return;				
			}
			else {
				System.out.println(student.getId()+" "+student.getFirstName()+" "+
						student.getSecondName()+" "+student.getIdendityNumber()+" isimli öğrenci kayıt edildi.");
			}
			
		this.students.add(student);
		
	}
	public void delete(int id) {
		
		Student StudentToDelete = new Student();;
		for (Student student : students) {
			if(student.getId()==id) {
				StudentToDelete=student;
				students.remove(StudentToDelete);
				System.out.println(StudentToDelete.getFirstName()+" isimli öğrenci silindi");
				return;
			}
		}
	
		//this.students.delete(student);
		
		
	}
	public void update(Student updatedStudent) {
		int index=0;// i
		for (Student student : students) {
			//ıd ile öğrenci değiştirme
			if(student.getId()==updatedStudent.getId()) {
				student=updatedStudent;
				students.set(index,updatedStudent);
				System.out.println(student.getId()+" ID'li öğrenci güncellendi");
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
