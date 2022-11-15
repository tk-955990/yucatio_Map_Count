package yucatio;

public class Employee {
  
  String name;
  String deploy;
  String gender;
  
  public Employee(String name,String deploy,String gender) {
	  this.name = name;
	  this.deploy = deploy;
	  this.gender = gender; 
  }
  
  
  public String getName() {
	  return name;
  }
  public void setName(String name) {
	  this.name = name;
  }
  
  public String getDeploy() {
	  return deploy;
  }
  public void setDeploy(String deploy) {
	  this.deploy = deploy;
  }
  
  public String getGender() {
	  return gender;
  }
  public void setGender(String gender) {
	  this.gender = gender;
  }
  
  
  @Override
  public String toString() {
	  return String.format("名前:%12s 部署:%13s 性別:%s", this.name,this.deploy,this.gender );
  }
  
}
