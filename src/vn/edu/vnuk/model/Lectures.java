package vn.edu.vnuk.model;

import java.util.Scanner;

import vn.edu.vnuk.controller.Observer;
import vn.edu.vnuk.define.Define;

public class Lectures extends Person implements Observer {

	private String homeTown;
	private String department;
	private String qualification;
	private int allowance;
	private int periodsInMonth;
	private float salaryRatio;
	private int yearWorked;
	private float minimumWage;
	private int yearOfBirth;
	private boolean isCreated;
	
	public Lectures() {}
	


	public void setMinimumWage(float minimumWage) {
		this.minimumWage = minimumWage;
	}
	
	public float getMinimumWage() {
		return minimumWage;
	}
	
	public void setYearOfBirth(int yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}
	
	public int getYearOfBirth() {
		return yearOfBirth;
	}

	public void setHomeTown(String homeTown) {
		this.homeTown = homeTown;
	}

	public String getHomeTown() {
		return homeTown;
	}
	
	public void setDepartment(String department) {
		this.department = department;
	}
	
	public String getDepartment() {
		return department;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public int getAllowance() {
		return allowance;
	}

	public void setAllowance(int allowance) {
		this.allowance = allowance;
	}

	public int getPeriodsInMonth() {
		return periodsInMonth;
	}

	public void setPeriodsInMonth(int periodsInMonth) {
		this.periodsInMonth = periodsInMonth;
	}

	public float getSalaryRatio() {
		return salaryRatio;
	}

	public void setSalaryRatio(int salaryRatio) {
		this.salaryRatio = salaryRatio;
	}

	public int getYearWorked() {
		return yearWorked;
	}

	public void setYearWorked(int yearWorked) {
		this.yearWorked = yearWorked;
	}

	@Override
	public String toString() {
		return "Lectures [homeTown=" + homeTown + ", department=" + department + ", qualification=" + qualification
				+ ", allowance=" + allowance + ", periodsInMonth=" + periodsInMonth + ", salaryRatio=" + salaryRatio
				+ ", yearWorked=" + yearWorked + "]";
	}

	private Lectures(LecturesBuilder builder) {
		
		this.minimumWage = builder.minimumWage;
		this.id = builder.id;
		this.type = builder.type;
		this.homeTown = builder.homeTown;
		this.department = builder.department;
		this.yearWorked = builder.yearWorked;
		this.allowance = builder.allowance;
		this.salaryRatio = builder.salaryRatio;
	}
	
	public Lectures(int type, int latestId) {
	}

	public static class LecturesBuilder{
		private float minimumWage;
		private String homeTown;
		private String department;
		private float salaryRatio;
		private int allowance;
		private int yearWorked;
		private int id;
		private int type;
		private int yearOfBirth;
		private String name;
		private String qualification;
		private int periodsInMonth;
	

		    public LecturesBuilder (int id, int type) {
				this.id = id;
				this.type = type;
			}
			
			public LecturesBuilder setHomeTown( String homeTown) {
				this.homeTown = homeTown;
				return this;
			}
			
			public LecturesBuilder setDepartment(String department) {
				this.department = department;
				return this;
			}
			
			public LecturesBuilder setSalaryRatio(float salaryRatio) {
				this.salaryRatio = salaryRatio;
				return this;
			}
			
			public LecturesBuilder setAllowrance(int allowance) {
				this.allowance = allowance;
				return this;
			}
			
			
			public LecturesBuilder setYearWorked(int yearWorked) {
				this.yearWorked = yearWorked;
				return this;
			}
			
			public LecturesBuilder setYearOfBirth(int yearOfBirth) {
				this.yearOfBirth = yearOfBirth;
				return this;
			}
			
			public LecturesBuilder setMinimumWage(float minimumWage) {
				this.minimumWage = minimumWage;
				return this;
			}
			
			public LecturesBuilder setQualification(String qualification) {
				this.qualification = qualification;
				return this;
			}
			
			public LecturesBuilder setName(String name) {
				this.name = name;
				return this;
			}
			
			public Lectures build() {
				return new Lectures(this);
			}

			public LecturesBuilder setPeriodsInMonth(int periodsInMonth) {
				this.periodsInMonth = periodsInMonth;
				return this;
			}

			
		
	}	
	

	@Override
	public void input() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter name " + ((isCreated) ? this.Name : " ") + ": ");
		this.Name = sc.nextLine();
		
		System.out.println("Enter year of birth " + ((isCreated) ? this.yearOfBirth : " ") + ": ");
		this.yearOfBirth = Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter hometown " + ((isCreated) ? this.homeTown : " ") + ": ");
		this.homeTown = sc.nextLine();
		
		System.out.println("Enter department " + ((isCreated) ? this.department : " ") + ": ");
		this.department = sc.nextLine();
		
		System.out.println("Enter salary ratio " + ((isCreated) ? this.salaryRatio : " ") + ": ");
		this.salaryRatio = Float.parseFloat(sc.nextLine());
		
		System.out.println("Enter periods in month " + ((isCreated) ? this.periodsInMonth : " ") + ": ");
		this.periodsInMonth = Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter year worked " + ((isCreated) ? this.yearWorked : " ") + ": ");
		this.yearWorked = Integer.parseInt(sc.nextLine());
		
		minimumWage = Define.DEFAUT_MINIMUM_WAGE;
		
		System.out.println("Choose certificate " + ((isCreated) ? this.qualification : " " ) + "\n" +
						   "1. Bachelor. \n" +
						   "2. Master. \n" +
						   "3. Doctor.");
		int selection = Integer.parseInt(sc.nextLine());
		switch (selection) {
		case Define.TYPE_OF_BACHELOR: {
			this.qualification = Define.QUALIFICATION_OF_BACHELOR;
			this.allowance = Define.ALLOWRANCE_OF_BACHELOR;
			break;
		}
		case Define.TYPE_OF_MASTER: {
			this.qualification = Define.QUALIFICATION_OF_MASTER;
			this.allowance = Define.ALLOWRANCE_OF_MASTER;
			break;
		}
		case Define.TYPE_OF_DOCTOR: {
			this.qualification = Define.QUALIFICATION_OF_DOCTOR;
			this.allowance = Define.ALLOWRANCE_OF_DOCTOR;
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
		float salary = (salaryRatio * minimumWage) + allowance + (periodsInMonth * 45);
		return salary;
	}


	
}
