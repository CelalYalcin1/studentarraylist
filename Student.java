package studentarraylist;
import java.util.List;

public class Student {

	private int id; 
	private String firstName;
	private String secondName;
	private int idendityNumber;
	
	public Student() {
		super();
	}

	public Student(int id, String firstName, String secondName, int idendityNumber) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.secondName = secondName;
		this.idendityNumber = idendityNumber;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public int getIdendityNumber() {
		return idendityNumber;
	}

	public void setIdendityNumber(int idendityNumber) {
		this.idendityNumber = idendityNumber;
	}
	
	
}
