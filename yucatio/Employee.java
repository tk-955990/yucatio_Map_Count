package yucatio;

public class Employee {

	Employee() {}

	public Employee(String name,String section,String gender) {
		this.name = name;
		this.section = section;
		this.gender = gender; 
	}

	private String name;
	private String section;
	private String gender;


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}

	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}


	@Override
	public String toString() {
		return String.format("名前:%15s 部署:%15s 性別:%s", this.name,this.section,this.gender );
	}

}
