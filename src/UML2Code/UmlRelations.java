package UML2Code;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class UmlRelations
{		
	public  static  void main(String[] args){
		// Employee
		Man myEngineer01 = new Employee();
		System.out.println(myEngineer01.toString());
		Man myEngineer02 = new Employee("And02", "Lya", "Controller");
		System.out.println(myEngineer02.toString());
		Employee myEngineer03 = new Employee("And03", "Lya", "Controller");
		System.out.println(myEngineer03.toString());
		Employee sysEngineer = new Employee("Жора04", "Кустов", "Управделами");
		System.out.println(sysEngineer.toString());
		sysEngineer.setPosition("Инженер");
		// второй Employee
		Employee director = new Employee("Федор", "Дубов", "Директор");
		// IdCard
		IdCard card = new IdCard(123);
		try {
			card.setDateExpire(new SimpleDateFormat("yyyy-MM-dd").parse("2015-12-31"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sysEngineer.setIdCard(card);
		// Room
		Room room101 = new Room(101);
		Room room321 = new Room(321);
		sysEngineer.setRoom(room101);
		sysEngineer.setRoom(room321);
		// Department
		Department programmersDepartment = new Department("Программисты");
		programmersDepartment.addEmployee(sysEngineer);
		// PastPosition		
		sysEngineer.setPosition("Сторож");
		// Output
		System.out.println(myEngineer01.getName() +" работает в должности "+ sysEngineer.getPosition());
		System.out.println(myEngineer02.getName() +" работает в должности "+ sysEngineer.getPosition());
		System.out.println(sysEngineer.getName() +" работает в должности "+ sysEngineer.getPosition()); 
		System.out.println("Удостовирение действует до " + new SimpleDateFormat("yyyy-MM-dd").format(sysEngineer.getIdCard().getDateExpire()) ); 
		System.out.println("Может находиться в помещеньях:");
		Iterator<Room> iter =  sysEngineer.getRoom().iterator();
		while(iter.hasNext()){
			System.out.println( ((Room) iter.next()).getNumber());
		}
		System.out.println("Относится к   отделу "+sysEngineer.getDepartment().getName());
		System.out.println("В отделе "+sysEngineer.getDepartment().getName()+" работает "
						   +sysEngineer.getDepartment().getPersonCount()+" человек.");
		System.out.println("В прошлом работал как:");		
		Iterator<PastPosition> iterPastPosition =  sysEngineer.getPastPosition().iterator();
		while(iterPastPosition.hasNext()){
			System.out.println( ((PastPosition) iterPastPosition.next()).getName());
		}
		// Menu
		Menu menu = new Menu();
		Employee employees[] = new Employee[10];
		employees[0]= sysEngineer;
		employees[1] = director;
		menu.showEmployees(employees);
	}
}
