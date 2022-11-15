package yucatio;

import java.util.ArrayList;
import java.util.List;

public class MapCount {
  public static void main(String args[])  {
	// new Employee(名前、部署、性別)
	  List<Employee> employee = new ArrayList<>();  
	  
	  employee.add(new Employee("yucatio"    , "情報システム部"    ,"F")); 
	  employee.add(new Employee("ハル"       , "情報システム部"    ,"M")); 
	  employee.add(new Employee("saito_san"  , "情報システム部"    ,"M")); 
	  employee.add(new Employee("山葵"       , "情報システム部"    ,"F")); 
	  employee.add(new Employee("けこ"       , "情報システム部"    ,"F")); 
	  employee.add(new Employee("麻生"       , "情報システム部"    ,"M")); 
	  employee.add(new Employee("bata"       , "情報システム部"    ,"M")); 
	  employee.add(new Employee("市川"       , "情報システム部"    ,"M")); 
	  employee.add(new Employee("ちか"       , "情報システム部"    ,"M")); 
	  employee.add(new Employee("Hayashi"    , "情報セキュリティー部","M")); 
	  employee.add(new Employee("astraea"    , "情報セキュリティー部","M")); 
	  employee.add(new Employee("菅原鮮魚店" , "情報セキュリティー部","M")); 
	  employee.add(new Employee("M.Pentes"   , "情報セキュリティー部","M")); 
	  employee.add(new Employee("LOST_CANYON", "登山研究部"        ,"M")); 
	  employee.add(new Employee("zero"       , "登山研究部"        ,"M")); 
	  employee.add(new Employee("FLASH"      , "登山研究部"        ,"F")); 

	  
	  employee.stream().forEach(System.out::println);
  }
	
	
	
}
