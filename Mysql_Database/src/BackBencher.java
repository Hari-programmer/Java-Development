
public class BackBencher {

	private int  id;
	private String name;
	private int marks;
	private String subject;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int mark) {
		this.marks = mark;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	@Override
	public String toString() {
		return "BackBencher [id=" + id + ", name=" + name + ", mark=" + marks + ", subject=" + subject + "]";
	}
	
	
}
