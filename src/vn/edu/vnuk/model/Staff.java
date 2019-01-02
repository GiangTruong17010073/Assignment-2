package vn.edu.vnuk.model;

import java.util.Scanner;

import vn.edu.vnuk.controller.Observer;
import vn.edu.vnuk.define.Define;

public class Staff extends Person implements Observer {
	
	private String homeTown;
	private String department;
	private int dayWorked;
	private float salaryRatio;
	private int allowance;
	private String regency;
	private int yearWorked;
	private float minimumWage;
	private boolean isCreated;
	public Staff() {}


	public Staff(int type, int Id) {
	}

	public float getMinimumWage() {
		return minimumWage;
	}
	
	public void setMinimumWage(float minimumWage) {
		this.minimumWage = minimumWage;
	}
	
	public String getHomeTown() {
		return homeTown;
	}


	public void setHomeTown(String homeTown) {
		this.homeTown = homeTown;
	}


	public String getDepartment() {
		return department;
	}


	public void setDepartment(String department) {
		this.department = department;
	}


	public int getDayWorked() {
		return dayWorked;
	}


	public void setDayWorked(int dayWorked) {
		this.dayWorked = dayWorked;
	}


	public float getSalaryRatio() {
		return salaryRatio;
	}


	public void setSalaryRatio(float salaryRatio) {
		this.salaryRatio = salaryRatio;
	}


	public int getAllowance() {
		return allowance;
	}


	public void setAllowance(int allowance) {
		this.allowance = allowance;
	}


	public String getRegency() {
		return regency;
	}


	public void setRegency(String regency) {
		this.regency = regency;
	}


	public int getYearWorked() {
		return yearWorked;
	}


	public void setYearWorked(int yearWorked) {
		this.yearWorked = yearWorked;
	}


	@Override
	public String toString() {
		return "Staff [homeTown=" + homeTown + ", department=" + department + ", dayWorked=" + dayWorked
				+ ", salaryRatio=" + salaryRatio + ", allowance=" + allowance + ", regency=" + regency + ", yearWorked="
				+ yearWorked + "]";
	}
	private Staff(StaffBuilder builder) {
		
		this.homeTown = builder.homeTown;
		this.department = builder.department;
		this.dayWorked = builder.dayWorked;
		this.allowance = builder.allowance;
		this.salaryRatio = builder.salaryRatio;
		this.minimumWage = builder.minimumWage;
	}
	
	public static class StaffBuilder{
		public float minimumWage;
		private String homeTown;
		private String department;
		private float salaryRatio;
		private int allowance;
		private int dayWorked;
		private int yearOfBirth;
		private String name;
		private String regency;
		public StaffBuilder (int id, int type) {
			}
			
			public StaffBuilder setHomeTown( String homeTown) {
				this.homeTown = homeTown;
				return this;
			}
			
			public StaffBuilder setName( String name) {
				this.name = name;
				return this;
			}
			public StaffBuilder setDepartment(String department) {
				this.department = department;
				return this;
			}
			
			public StaffBuilder setSalaryRatio(float salaryRatio2) {
				this.salaryRatio = salaryRatio2;
				return this;
			}
			
			public StaffBuilder setAllowrance(int allowance) {
				this.allowance = allowance;
				return this;
			}
			
			public StaffBuilder setPosition(String position) {
				return this;
			}
			
			public StaffBuilder setDayWorked(int dayWorked) {
				this.dayWorked = dayWorked;
				return this;
			}
			
			public StaffBuilder setMinimumWage(float minimumWage) {
				this.minimumWage = minimumWage;
				return this;
			}
			
			public StaffBuilder setYearWorked(int yearWorked) {
				return this;
			}
			
			public Staff build() {
				return new Staff(this);
			}

			public StaffBuilder setYearOfBirth(int yearOfBirth) {
				this.yearOfBirth = yearOfBirth;
				return this;
			}

			public StaffBuilder setRegency(String regency) {
				this.regency = regency;

				return null;
			}
		
	}	
	
	
	



	@Override
	public void input() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter name " + ((isCreated) ? this.Name : " ") + " ");
		this.Name = sc.nextLine();
		
		System.out.println("Enter year of birth " + ((isCreated) ? this.yearOfBirth : " ") + ": ");
		this.yearOfBirth = Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter hometown " + ((isCreated) ? this.homeTown : " ") + ": ");
		this.homeTown = sc.nextLine();
		
		System.out.println("Enter department " + ((isCreated) ? this.department : " ") + ": ");
		this.department = sc.nextLine();
		
		System.out.println("Enter salary ratio " + ((isCreated) ? this.salaryRatio : " ") + ": ");
		this.salaryRatio = Float.parseFloat(sc.nextLine());
		
		System.out.println("Enter day worked " + ((isCreated) ? this.dayWorked : " ") + ": ");
		this.dayWorked = Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter year worked " + ((isCreated) ? this.yearWorked : " ") + ": ");
		this.yearWorked = Integer.parseInt(sc.nextLine());
		
		minimumWage = Define.DEFAUT_MINIMUM_WAGE;
		
		System.out.println("Choose a position " + ((isCreated) ? this.regency : " ") + "\n" +
				   		   "1. Chief of department. \n" +
				           "2. Deputy of department. \n" +
				   	       "3. Employee.");
		int selection = sc.nextInt();
		switch (selection) {
		case Define.TYPE_OF_CHIEF: {
			this.regency = Define.POSITION_OF_CHIEF;
			this.allowance = Define.ALLOWRANCE_OF_CHIEF;
			break;
		}
		case Define.TYPE_OF_DEPUTY: {
			this.regency = Define.POSITION_OF_DEPUTY;
			this.allowance = Define.ALLOWRANCE_OF_DEPUTY;
			break;
		}
		case Define.TYPE_OF_EMPLOYEE: {
			this.regency = Define.POSITION_OF_EMPLOYEE;
			this.allowance = Define.ALLOWRANCE_OF_EMPLOYEE;
			break;
		}
		}
		
		if (!isCreated) isCreated = true;
	}

	@Override
public void update (float minimumWage) {
		this.minimumWage = minimumWage;
	}


	@Override
	public Object getSalary() {
		float salary = (salaryRatio * minimumWage) + allowance + (dayWorked * 30);
		return salary;
	}



	
}
