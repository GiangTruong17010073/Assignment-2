package vn.edu.vnuk.define;

import java.util.ArrayList;

import vn.edu.vnuk.model.Person;

public class Define {
	public static final int TYPE_OF_LECTURE = 1;
	public static final int TYPE_OF_STAFF = 2;
	public static final int TYPE_OF_CASUALWORKER = 3;
	
	public static final int TYPE_OF_BACHELOR = 1;
	public static final int TYPE_OF_MASTER = 2;
	public static final int TYPE_OF_DOCTOR = 3;
	
	public static final int TYPE_OF_CHIEF = 1;
	public static final int TYPE_OF_DEPUTY = 2;
	public static final int TYPE_OF_EMPLOYEE = 3;
	
	public static final float DEFAUT_MINIMUM_WAGE = 730;
	public static int latestId = 0;
	
	public static final int ALLOWRANCE_OF_BACHELOR = 300;
	public static final int ALLOWRANCE_OF_MASTER = 900;
	public static final int ALLOWRANCE_OF_DOCTOR = 2000;
	public static final int ALLOWRANCE_OF_CHIEF = 1000;
	public static final int ALLOWRANCE_OF_DEPUTY = 600;
	public static final int ALLOWRANCE_OF_EMPLOYEE = 400;
	
	public static final String POSITION_OF_CHIEF = "Chief";
	public static final String POSITION_OF_DEPUTY = "Deputy";
	public static final String POSITION_OF_EMPLOYEE = "Employee";
	public static final String QUALIFICATION_OF_BACHELOR = "Bachelor";
	public static final String QUALIFICATION_OF_MASTER = "Master";
	public static final String QUALIFICATION_OF_DOCTOR = "Doctor";

	public static float newMinimumWage = DEFAUT_MINIMUM_WAGE;
	
	public static ArrayList<Person> persons = new ArrayList<>();

}
