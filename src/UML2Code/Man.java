package UML2Code;

/**
 * The Class Man.
 */
public  class Man{
	
	/** The name. */
	protected String name;
	
	/** The surname. */
	protected String surname;		
	
	/**
	 * Instantiates a new man.
	 */
	public Man() {
		System.out.println("Consructor of Man");
	}
	
	/**
	 * Sets the name.
	 *
	 * @param newName the new name
	 */
	public void setName(String newName){
		name = newName;			
	}
	
	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName(){
		return name;
	}
	
	/**
	 * Sets the surname.
	 *
	 * @param newSurname the new surname
	 */
	public void setSurname(String newSurname){
		name = newSurname;			
	}
	
	/**
	 * Gets the surname.
	 *
	 * @return the surname
	 */
	public String getSurname(){
		return surname;
	}
	
	/* 
	 * @see java.lang.Object#toString()
	 */
	public String toString(){
		return "I'm " + getSurname() + " " + getName();
	}
}	 
