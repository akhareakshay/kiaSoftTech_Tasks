package kiaSoftTech_Tasks.golden.project;

public class Teacher {
	private int id;
	private String name;
	private String subject;

	public Teacher() {
		// TODO Auto-generated constructor stub
	}

	public Teacher(int id, String name, String subject) {
		super();
		this.id = id;
		this.name = name;
		this.subject = subject;
	}

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

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

}