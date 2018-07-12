package UML2Code;

import java.util.HashSet;
import java.util.Set;

// наследуем класс Man
public  class Employee extends Man{
	private String position;
//	todo: 2. Ассоциация 2.1 Бинарная
//Класс Employee имеет поле card, у которого тип IdCard, так же класс имеет методы для присваивания значения(setIdCard) этому полю и для получения значения(getIdCard). Из экземпляра объекта Employee мы можем узнать о связанном с ним объектом типа IdCard, значит навигация (стрелочка на линии) направлена от Employee к IdCard.
	private IdCard iCard;
	//		private Set<IdCard> iCard = new HashSet<IdCard>();

//	todo: 2.2 N-арная ассоциация
//Каждому объекты работник(Employee) может соответствовать несколько рабочих помещений. Мощность связи один-ко-многим. Навигация от Employee к Room.
	private Set<Room> room = new HashSet<Room>();
	private Department department;
	private Set<PastPosition> pastPosition = new HashSet<PastPosition>();
	// создаем и конструктор
	/**
	 * Instantiates a new Employee.
	 */
	public Employee() {
		System.out.println("Consructor of Employee");
	}

	public  Employee(String cName, String cSurname, String cPosition){
		name = cName;
		surname = cSurname;
		position = cPosition;
		System.out.println("Consructor of Employee(String cName, String cSurname, String cPosition)");
	}
	public void setPosition(String newPosition){
		// сначала должность заносим в список прежних должностей
		PastPosition pastPosition = new PastPosition(this.getPosition(), this.getDepartment());
		this.setPastPosition(pastPosition);
		// меняем должность
		position = newPosition;
	}
	public String getPosition(){
		return position;
	}
	public void setIdCard(IdCard c){
		iCard = c;
	}
	public IdCard getIdCard(){
		return iCard;
	}
	public void setRoom(Room newRoom){
		room.add(newRoom);
	}
	public Set  getRoom(){
		return room;
	}
	//		public Set<Room>  getRoom(){
//			return room;
//		}
	public void  deleteRoom(Room r){
		room.remove(r);
	}

	public void setDepartment(Department d){
		department = d;
	}

	public Department getDepartment(){
		return department;
	}

	public void setPastPosition(PastPosition p){
		pastPosition.add(p);
	}

	public Set<PastPosition>  getPastPosition(){
		return pastPosition;
	}

	public void deletePastPosition(PastPosition p){
		pastPosition.remove(p);
	}
}
