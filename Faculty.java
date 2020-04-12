
import java.util.ArrayList;
import java.util.List;

public class Faculty {

	List<Student> studenti=new ArrayList<>();
	String facultyName;
	public Faculty() {
		super();
	}
	public Faculty(List<Student> studenti, String facultyName) {
		super();
		this.studenti = studenti;
		this.facultyName = facultyName;
	}
	public List<Student> getStudenti() {
		return studenti;
	}
	public void setStudenti(List<Student> studenti) {
		this.studenti = studenti;
	}
	public String getFacultyName() {
		return facultyName;
	}
	public void setFacultyName(String facultyName) {
		this.facultyName = facultyName;
	}
	@Override
	public String toString() {
		return "Faculty [studenti=" + studenti + ", facultyName=" + facultyName + "]";
	}
	
	public void addStudent(Student e) {
		studenti.add(e);
	}
	
	public void removeStudent(Student e) {
		studenti.remove(e);
	}
	
	
	
}
