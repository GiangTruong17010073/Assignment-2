package vn.edu.vnuk.model;



public abstract class Person {
	protected int id;
	protected String Name;
	protected int yearOfBirth;
	protected int type;
	
	public Person() {}
	
	
	public Person(int id, int type) {
		this.id = id;
		this.type = type;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String Name) {
		this.Name = Name;
	}
	public int getYearOfBirth() {
		return yearOfBirth;
	}
	public void setYearOfBirth(int YearOfBirth) {
		this.yearOfBirth = YearOfBirth;
	}
	
	public void setType(int type) {
		this.type = type;
	}
	public int getType() {
		return type;
	}
	

	public abstract Object getSalary();

	public abstract String toString();
	
	public abstract void input();

}	



