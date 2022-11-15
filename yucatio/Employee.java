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
  
  
  
  
}
