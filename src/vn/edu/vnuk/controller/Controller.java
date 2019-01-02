package vn.edu.vnuk.controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import vn.edu.vnuk.define.Define;
import vn.edu.vnuk.model.CasualWorkers;
import vn.edu.vnuk.model.Lectures;
import vn.edu.vnuk.model.Person;
import vn.edu.vnuk.model.Staff;

public class Controller {
	
	public static void arrayList() {
		ArrayList<String> str = new ArrayList<String>();
	}

	public static void menuOne() {
		int value;
		System.out.println("1. Add new Staff.\n"
						 + "2. Add new Staff on top. \n"
						 + "3. Add new Staff after Regency k. \n"
						 + "4. Add new Staff from staff.txt \n"
						 + "5. Add new CasualWorker from labor.txt \n"
						 + "6. Back to Main Menu");
		value = inputChoice(1,6);
		switch(value) {
			case 1: {
				switch (selectTypeOfEmployee()) {
				case Define.TYPE_OF_LECTURE: {
					Lectures lecture = (Lectures)PersonFactory.getPerson(Define.TYPE_OF_LECTURE);
					lecture.input();
					Define.persons.add(lecture);
					 break;
				}
				case Define.TYPE_OF_STAFF: {
					Staff staff = (Staff)PersonFactory.getPerson(Define.TYPE_OF_STAFF);
					staff.input();
					Define.persons.add(staff);
					break;
				}
			}
				break;
		}
			case 2: {
				switch (selectTypeOfEmployee()) {
				case Define.TYPE_OF_LECTURE:{
					Lectures lecture = (Lectures)PersonFactory.getPerson(Define.TYPE_OF_LECTURE);
					lecture.input();
					Define.persons.add(0, lecture);
					break;
				}
				case Define.TYPE_OF_STAFF: {
					Staff staff = (Staff)PersonFactory.getPerson(Define.TYPE_OF_STAFF);
					staff.input();
					Define.persons.add(0, staff);
					break;
				}
				}
				break;
			}
			case 3: {
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter k: ");
				int k = sc.nextInt();
				
				switch (selectTypeOfEmployee()) {
				case Define.TYPE_OF_LECTURE:{
					Lectures lecture = (Lectures)PersonFactory.getPerson(Define.TYPE_OF_LECTURE);
					lecture.input();
					Define.persons.add(k - 1, lecture);
					break;
				}
				case Define.TYPE_OF_STAFF: {
					Staff staff = (Staff)PersonFactory.getPerson(Define.TYPE_OF_STAFF);
					staff.input();
					Define.persons.add(k - 1, staff);
					break;
				}
				}
				break;
			}
			
			
			case 4: {
				Scanner sc = null;
				try {
					sc = new Scanner(new File("staff.txt"));
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} 
				int numberOfStaffs = Integer.parseInt(sc.nextLine());
				int type;
				float salaryRatio, minimumWage;
				int yearOfBirth, YearWorked, dayWorked, periodsInMonth;
				String name, hometown, department, Regency, qualification;
				
				for (int index = 0; index < numberOfStaffs; index++) {
					Define.latestId++;
					
					type = Integer.parseInt(sc.nextLine());
					yearOfBirth = Integer.parseInt(sc.nextLine());
					name = sc.nextLine();
					hometown = sc.nextLine();
					department = sc.nextLine();
					YearWorked = Integer.parseInt(sc.nextLine());
					salaryRatio = Float.parseFloat(sc.nextLine());
					minimumWage = Float.parseFloat(sc.nextLine());
					
					if (type == Define.TYPE_OF_LECTURE) {
						qualification = sc.nextLine();
						periodsInMonth = Integer.parseInt(sc.nextLine());
						

						Lectures newLectures = new Lectures.LecturesBuilder(Define.latestId, Define.TYPE_OF_LECTURE)
													.setYearOfBirth(yearOfBirth)
													.setName(name)
													.setHomeTown(hometown)
													.setDepartment(department)
													.setYearWorked(YearWorked)
													.setSalaryRatio(salaryRatio)
													.setQualification(qualification)
													.setPeriodsInMonth(periodsInMonth)
													.setMinimumWage(minimumWage)
													.build();
						
						Define.persons.add(newLectures);
					} else {
						Regency = sc.nextLine();
						dayWorked = Integer.parseInt(sc.nextLine());
						
						Staff newStaff = new Staff.StaffBuilder(Define.latestId, Define.TYPE_OF_STAFF)
													.setYearOfBirth(yearOfBirth)
													.setName(name)
													.setHomeTown(hometown)
													.setDepartment(department)
													.setYearWorked(YearWorked)
													.setSalaryRatio(salaryRatio)
													.setRegency(Regency)
													.setDayWorked(dayWorked)
													.setMinimumWage(minimumWage)
													.build();
						
						Define.persons.add(newStaff);							
					}
				}
				
				break;
			}
			
			case 5:{
				Scanner sc = null;
				try {
					sc = new Scanner(new File("labor.txt"));
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}
				int numberOfCasualWorkers = Integer.parseInt(sc.nextLine());
				int yearOfBirth, dayWorked;
				float earningPerDay, minimumWage;
				String name;
				
				for (int index = 0; index < numberOfCasualWorkers; index++) {
					name = sc.nextLine();
					yearOfBirth = Integer.parseInt(sc.nextLine());
					dayWorked = Integer.parseInt(sc.nextLine());
					earningPerDay = Float.parseFloat(sc.nextLine());
					
					CasualWorkers newCasualWorkers = new CasualWorkers.CasualWorkersBuilder(Define.latestId, Define.TYPE_OF_CASUALWORKER)
							.setName(name)
							.setDayWorked(dayWorked)
							.setYearOfBirth(yearOfBirth)
							.setEarningPerDay(earningPerDay)
							.build();
					
					Define.persons.add(newCasualWorkers);
				}
	
				break;
			}
			
			case 6: 
				return;
		}
	}
	
public static void menuTwo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the serial number staff need to edit the list: ");
		int value = Integer.parseInt(sc.nextLine());
		
		ArrayList<Person> persons = new ArrayList<Person>();
		persons = Define.persons;
		
		for(int i = 0; i< Define.persons.size(); i++) {
			if (i == value) {
				persons.get(i).input();
			} else {
				System.out.println("Cannot found!");
			}
		}
		
		return;
	}
	
	public static void menuThree() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter staff's number: ");
		int value = Integer.parseInt(sc.nextLine());
		
		ArrayList<Person> persons = new ArrayList<Person>();
		persons = Define.persons;
		
		for(int i = 0; i< Define.persons.size(); i++) {
			if(i == value) {
				persons.remove(value);
			} else {
				System.out.println("Cannot found!");
			}
		}
	}
	
	public static void menuFour() {
		int value;
		System.out.println("1. Show list. \n "
						 + "2. Show list order by arcending salary.  \n"
						 + "3. Show list order by alphabet. \n"
						 + "4. Find staff by name. \n"
						 + "5. Find staff by year of birth.");
		value = inputChoice(1, 6);
		switch(value) {
			case 1: {
				showListPerson(Define.persons);
				break;
			}
			case 2: {
				ArrayList<Person> tempPersons = (ArrayList<Person>) Define.persons.clone();
				
				for (int i = 0; i < Define.persons.size() - 1; i++) {
					for (int j = i + 1; j < Define.persons.size(); j++) {
							Person temp = tempPersons.get(j);
							tempPersons.set(j, tempPersons.get(i));
							tempPersons.set(i, temp);
					}
				}
				showListPerson(tempPersons);
				break;
			}
				
			case 3:{
				ArrayList<Person> tempPersons = (ArrayList<Person>) Define.persons.clone();
				
				Collections.sort(tempPersons, new Comparator<Person>() {
					
					@Override
					public int compare(Person t1, Person t2) {
						
						String s1 = t1.getName();
						String s2 = t2.getName();
						return s1.compareTo(s2);
					}
				});
				showListPerson(tempPersons);
				break;
				
			}
			case 4:{
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter name: ");
				String nameSearch = sc.nextLine();
				
				ArrayList<Person> persons = new ArrayList<Person>();
				Person person;
				boolean isFound = false;
				
				for (int index = 0; index < Define.persons.size(); index++) {
					person = Define.persons.get(index);
					
					if(person.getName().toLowerCase().contains(nameSearch.toLowerCase())) {
						persons.add(person);
						isFound = true;
					}
				}
				
				if (isFound == false) {
					System.out.println("Cannot found!");
				} else {
					showListPerson(persons);
					persons.clear();
				}
				break;
			}
			case 5:{
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter year of birth: ");
				int yearSearch = Integer.parseInt(sc.nextLine());
				
				ArrayList<Person> persons = new ArrayList<Person>();
				Person person;
				boolean isFound = false;
				
				for (int index = 0; index < Define.persons.size(); index++) {
					person = Define.persons.get(index);
					
					if (person.getYearOfBirth() == yearSearch) {
							persons.add(person);
							isFound = true;
					}
				}
				
				if (isFound == false) {
					System.out.println("Cannot found!");
				} else {
					showListPerson(persons);
				}
				break;
				
			}
			case 6: {
				return;
			}
		}
	}
	



	public static void menuFive() {
		while (Define.persons.isEmpty() == false) {
			Define.persons.clear();
		}
		System.out.println("Deleted");
	}
	
	public static void menuSix() {
		System.out.println("List of Staff with the same salary: ");
		showListNameAndSalary(Define.persons);
	}
	
	public static void menuSeven() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter new minimun wage: ");
		Define.newMinimumWage = Float.parseFloat(sc.nextLine());
	}
	
	public static void menuEight() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter staff's ID: ");
String text = sc.nextLine();
		
		String indexs[] = text.split(" ");
		
		int indexTemp;
		Subject subject = new Subject();
		
		for (int index = 0; index < indexs.length; index++) {
			indexTemp = Integer.parseInt(indexs[index]);
			
			if ((indexTemp >= 0) && (indexTemp < Define.persons.size())) {
				
				if ((Define.persons.get(indexTemp).getType() == Define.TYPE_OF_LECTURE) || (Define.persons.get(indexTemp).getType() == Define.TYPE_OF_STAFF )) {
					
					subject.attach((Observer)Define.persons.get(indexTemp));
					subject.notifyChange(Define.newMinimumWage);
				} else System.out.println("Cannot edit!");
				
			} else System.out.println("Cannot found!");
		}
	}
	public static void menuNine() {
		System.out.println("Exit");
		System.exit(0);
	}
	
	public static int inputChoice(int min, int max) {
		Scanner sc = new Scanner(System.in);
		int value = min - 1;
		boolean check = false;
		
		System.out.println(" Input choice (" + min + " - " + max + ")");
		
		while (check == false) {
			System.out.println("Input your choice: ");
			value = sc.nextInt();
			
			if (value < min || value > max) {
				System.out.println("Wrong input ");
			}
			else 
				check = true;
		}
		return value;
	}
	
	public static int selectTypeOfEmployee() {
		Scanner sc = new Scanner(System.in);
		int value;
		System.out.println("1. Lecture. "
						+  "2. Staff."
						+  "3. Casual Worker. ");
		
	value = inputChoice(1, 3);
	
	switch (value) {
	case 1: return Define.TYPE_OF_LECTURE;
	case 2: return Define.TYPE_OF_STAFF;
	default:  return Define.TYPE_OF_CASUALWORKER;
		}
	}
	private static void showListPerson(ArrayList<Person> persons) {
		System.out.format("%-6s %-20s %-20s %-10s %-10s %-15s %-15s %-15s %-15s %-15s %n", "N#", "Name", "YearOfBirth", "Hometown", "Type", "C1", "C2", "C3", "C4", "C5");
		for (int index = 0; index < persons.size(); index++) {
			System.out.format("%-6d %-20s %-20d "
					, index
					, persons.get(index).getName()
					, persons.get(index).getYearOfBirth());
			
			switch (persons.get(index).getType()) {
			
			case Define.TYPE_OF_LECTURE: {
				System.out.format("%-10s %-10s %-15s %-15s %-15s %-15s %-15s %n"
						, ((Lectures)persons.get(index)).getHomeTown()
						, "Lectures"
						, ((Lectures)persons.get(index)).getDepartment()
						, ((Lectures)persons.get(index)).getQualification()
						, ((Lectures)persons.get(index)).getAllowance()
						, ((Lectures)persons.get(index)).getPeriodsInMonth()
						, ((Lectures)persons.get(index)).getSalaryRatio());
				
				break;
			}
			
			case Define.TYPE_OF_STAFF: {
				System.out.format("%-10s %-10s %-15s %-15s %-15s %-15s %-15s %n"
						, ((Staff)persons.get(index)).getHomeTown()
						, "Staff"
						, ((Staff)persons.get(index)).getDepartment()
						, ((Staff)persons.get(index)).getRegency()
						, ((Staff)persons.get(index)).getAllowance()
						, ((Staff)persons.get(index)).getDayWorked()
						, ((Staff)persons.get(index)).getSalaryRatio());
				
				break;
			}
			
			case Define.TYPE_OF_CASUALWORKER: {
				System.out.format("%-10s %-10s %-15s %-15s %-15s %-15s %-15s %n"
						 , "null"
						 , "CWorker"
						 , "null"
						 , "null"
						 , "null"
						 , ((CasualWorkers)persons.get(index)).getDayWorked()
						 , ((CasualWorkers)persons.get(index)).getEarningPerDay());
			}
			}
		}
		
		System.out.println("\n \n \n" +
						   "C1-5 for Lectures: Department, Qualification, Allowance, PeriodsInMonth, SalaryRatio.\n" + 
				   		   "C1-5 for Staff: Department, Regency, Allowance, WorkDay, SalaryRatio.\n" +
						   "C1-5 for Casual Worker: null, null, null, WorkDay, EarningPerDay.");
	}

	private static void showListNameAndSalary(ArrayList<Person> persons) {
		System.out.format("%-6s %-20s %-10s %n", "N#", "Name", "Salary");
		for (int index = 0; index < persons.size(); index++) {
			System.out.format("%-6d %-20s %-10f %n"
						, index
						, persons.get(index).getName()
						, persons.get(index).getSalary());
		}
	}
	
}


