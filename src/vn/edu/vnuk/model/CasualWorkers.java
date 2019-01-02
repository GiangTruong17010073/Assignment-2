package vn.edu.vnuk.model;

import java.util.Scanner;


public class CasualWorkers extends Person {
	private int dayWorked;
	private float earningPerDay;
	private boolean isCreated;
	
	public CasualWorkers(int dayWorked, int earningPerDay) {
		super();
		this.dayWorked = dayWorked;
		this.earningPerDay = earningPerDay;
	}

	public CasualWorkers() {
	}

	public int getDayWorked() {
		return dayWorked;
	}

	public void setDayWorked(int dayWorked) {
		this.dayWorked = dayWorked;
	}

	public float getEarningPerDay() {
		return earningPerDay;
	}

	public void setEarningPerDay(int earningPerDay) {
		this.earningPerDay = earningPerDay;
	}

	@Override
	public String toString() {
		return "CasualWorkers [dayWorked=" + dayWorked + ", earningPerDay=" + earningPerDay + "]";
	}
	
	private CasualWorkers(CasualWorkersBuilder builder) {
		
		this.isCreated = false;
		this.dayWorked = builder.dayWorked;
		this.earningPerDay = builder.earningPerDay;
		this.yearOfBirth = builder.yearOfBirth;
		this.id = builder.id;
		this.type = builder.type;
		
	}
	
	public static class CasualWorkersBuilder{
		private int dayWorked;
		private float earningPerDay;
		private int yearOfBirth;
		private int id;
		private int type;
		private String name;
	
		public CasualWorkersBuilder( int id, int type) {
			this.id = id;
			this.type = type;
		}
			

			public CasualWorkersBuilder setDayWorked(int dayWorked) {
				this.dayWorked = dayWorked;
				return this;
			}
			
			
			public CasualWorkersBuilder setEarningPerDay(float earningPerDay2) {
				this.earningPerDay = earningPerDay2;
				return this;
			}
			
			public CasualWorkersBuilder setYearOfBirth(int yearOfBirth) {
				this.yearOfBirth = yearOfBirth;
				return this;
			}
			
			public CasualWorkersBuilder setName(String name) {
				this.name = name;
				return this;
			}
			
			
			public CasualWorkers build() {
				return new CasualWorkers(this);
			}
		
	}	
	
	@Override
	public void input() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter name " + ((isCreated) ? this.Name : " ") + " ");
		this.Name = sc.nextLine();
		
		System.out.println("Enter year of birth " + ((isCreated) ? this.yearOfBirth : " ") + ": ");
		this.yearOfBirth = Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter days worked " + ((isCreated) ? this.dayWorked : " ") + ": ");
		this.dayWorked = Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter earning per day " + ((isCreated) ? this.earningPerDay : " ") + ": ");
		this.earningPerDay = Integer.parseInt(sc.nextLine());
		
		if (!isCreated) isCreated = true;
		
	}

	@Override
	public Object getSalary() {
		float salary = dayWorked * earningPerDay;
		return salary;
	}
}
