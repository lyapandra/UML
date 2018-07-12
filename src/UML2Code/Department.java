package UML2Code;

import java.util.HashSet;
import java.util.Set;
public  class Department implements Unit{
	private String name;
//	2.3 Агрегация
	private Set<Employee> employees = new HashSet<Employee>();
	public Department(String n){
		name = n;
	}
	public void setName(String newName){
		name = newName;
	}
	public String getName(){
		return name;
	}
	public void  addEmployee(Employee newEmployee){
		employees.add(newEmployee);
		// todo: 2.3 Агрегация: связываем сотрудника с этим отделом
		/*наш класс, помимо конструктора и метода изменения имени отдела, имеет методы для занесения в отдел нового сотрудника, для удаления сотрудника и для получения всех сотрудников входящих в данный отдел.*/
		newEmployee.setDepartment(this); 
	}
	public Set<Employee>  getEmployees(){
		return employees;
	}
	public void  removeEmployee(Employee e){
		employees.remove(e);
	}
	public int getPersonCount(){
		return getEmployees().size();
	}
}
